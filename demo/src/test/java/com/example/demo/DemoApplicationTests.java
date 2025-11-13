package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Enable full stack trace
        System.out.println("Context loading...");
    }

    @Test
    void contextLoadsWithDebug() {
        try (ConfigurableApplicationContext context = 
             new SpringApplicationBuilder(DemoApplication.class)
                 .profiles("test")
                 .run()) {
        }
    }
}