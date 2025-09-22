package com.sparta.myselectshop.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfig  {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.connectTimeout(Duration.ofMillis(5000)).readTimeout(Duration.ofMillis(5000)) // 5초
                .build();

        // 강의에서 다룬 아래 .setConnectTimeout과 .setReadTimeout는 DEPRECATED 되었습니다. 위에 작성된 최신 버전의 코드로 대체합니다.
        //.setConnectTimeout(Duration.ofSeconds(5))
        //.setReadTimeout(Duration.ofSeconds(5))
        //.build();
    }
}