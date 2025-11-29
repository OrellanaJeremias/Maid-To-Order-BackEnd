package com.seedOrder.Maid_To_Order_Backend.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Cambia por la IP del emulador si quieres
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
