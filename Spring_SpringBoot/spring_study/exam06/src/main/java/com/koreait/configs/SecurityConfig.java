package com.koreait.configs;

import com.koreait.mdels.member.LoginFailureHandler;
import com.koreait.mdels.member.LoginSuccessHandler;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        /*회원 인증 설정 - 로그인*/
        http.formLogin(f -> { //람다식으로. 3.1. 버전부터 //  경로와 사람마다 이름이 다르기에 이름에 대한 설정만 해주면 된다.
            f.loginPage("/member/login")
                    .usernameParameter("userId") // 아이디에 대한 이름값.
                    .passwordParameter("userPw")
                    .successHandler(new LoginSuccessHandler())
                    .failureHandler(new LoginFailureHandler());


        });

        /*회원 로그아웃 설정*/
        http.logout(f -> {
           f.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                   .logoutSuccessUrl("/member/login");
        });

        /*회원 인가 설정(접근 통제)*/
        http.authorizeHttpRequests(c -> {
           c.requestMatchers("/mypage/**").authenticated() //회원전용 (로그인 했을때만 가능한 페이지)
                   .requestMatchers("/admin/**").hasAnyAuthority("ADMIN") //관리자 전용페이지
                   .anyRequest().permitAll(); // 나머지 페이지는 전체 접근 가능
        });

        http.exceptionHandling(c -> {
           c.authenticationEntryPoint((req, res, e) -> {
               String URI = req.getRequestURI();
               if (URI.indexOf("/admin") != 1) { // 관리자 페이지
                   res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "NOT AUTHORIZED");

               } else { // 회원 전용 페이지
                   // 로그인 페이지 이동
                   res.sendRedirect(req.getContextPath() + "/member/login");
               }

           });
        });

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); //많이 있긴 하지만 이걸 쓴다.
    }
}
