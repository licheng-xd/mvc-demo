package com.lchml.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApp implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplicationBuilder(DemoApp.class)
                .web(WebApplicationType.SERVLET).build();
        app.run(args);
    }

}
