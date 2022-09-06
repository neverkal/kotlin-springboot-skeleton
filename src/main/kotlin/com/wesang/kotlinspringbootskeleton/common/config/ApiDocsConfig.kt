package com.wesang.kotlinspringbootskeleton.common.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApiDocsConfig {
    @Bean
    fun handleOpenApi(): OpenAPI? {
        return OpenAPI()
            .info(
                Info().title("Book Library API")
                    .description("도서 관리 API")
                    .version("v1")
                    .license(License().name("Apache 2.0").url("http://springdoc.org"))
            )
    }
}
