package com.koreait.configs;

import com.koreait.mdels.member.LoginFailureHandler;
import com.koreait.mdels.member.LoginSuccessHandler;
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
        http.formLogin(f -> { //람다식으로. 3.1. 버전부터 경로와 사람마다 이름이 다르기에 이름에 대한 설정만 해주면 된다.
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



        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); //많이 있긴 하지만 이걸 쓴다.
    }
}
