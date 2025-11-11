package com.senai.backend.prova.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Exemplo API",
        version = "1.0",
        description = "API para o sistema de locação de carros "
    )
)
public class Swagger {
    
}
