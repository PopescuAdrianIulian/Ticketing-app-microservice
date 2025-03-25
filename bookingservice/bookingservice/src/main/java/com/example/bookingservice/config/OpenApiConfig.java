package com.example.bookingservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI inventoryServiceApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Booking Service API")
                        .description("Booking Service API for Ticketing app using microservice architecture")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Popescu Adrian Iulian")
                                .url("https://github.com/PopescuAdrianIulian")));
    }
}