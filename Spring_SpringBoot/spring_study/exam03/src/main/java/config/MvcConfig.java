package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer { // 중요! 반드시 외워라. 복습 복습!!
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
        // 요청 유입 1. 컨트롤러 빈 -> 2. 정적 자원
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) { //컨트롤 없이 바로 설정하는 것. 예) 회사소개 페이지
        registry.addViewController("/")
                .setViewName("main/index");

        registry.addViewController("/mypage")
                .setViewName("member/mypage"); // 마이페이지에 설정없이 바로 가게 할 수 있는 것.
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        registry.jsp("/WEB-INF/view/", ".jsp");
    }
}