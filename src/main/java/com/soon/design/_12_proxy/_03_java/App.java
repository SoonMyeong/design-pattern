package com.soon.design._12_proxy._03_java;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

    @Bean
    public ApplicationRunner applicationRunner(GameService gameService) {
        return args -> {
            gameService.startGame(); //인터페이스인 경우엔 ProxyInJava 파일 처럼 다이나믹프록시가 생성되는데,
                                    // 인터페이스가 아닌경우엔 (현재 ) CGLib 를 사용하여 가짜 빈을 등록 한다.
        };
    }
}
