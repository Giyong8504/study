package org.koreait.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaAuditing //이렇게만 설정하면 null 값이었던 날짜와 시간이 적용된다.
public class MvcConfig implements WebMvcConfigurer {

}
