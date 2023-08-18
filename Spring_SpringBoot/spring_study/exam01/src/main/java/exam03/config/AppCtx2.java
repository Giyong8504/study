package exam03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import exam03.models.member.*;
import org.springframework.context.annotation.Import;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Configuration
@Import(AppCtx3.class) // 많을 경우 {}를 사용하여 추가.
public class AppCtx2 {

    @Bean
    public JoinService joinService() {
        return new JoinService();
    }

    @Bean
    public ListService listService() {
        return new ListService();
    }
//    @Bean
    public DateTimeFormatter dateTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

        return formatter;
    }
}
