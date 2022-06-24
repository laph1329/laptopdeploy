package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * configuracion Swagger para la genereacion de la dcuemntacion de las apirest
 * http://localhost:8081/swagger-ui/
 */
@Configuration
public class SwaggerConfig {
//    @Bean
//    public Docket getDocket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("public-apis")
//                .apiInfo(apiDetails())
//                .select()
//                .build();
////                .apis(RequestHandlerSelectors.any())
////                .paths(PathSelectors.any())
//
//    }
//    public ApiInfo apiDetails(){
//        return new ApiInfoBuilder().title("doc de apis")
//                .description("documentación en general")
//                .version("1")
//                .build();
//    }
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails(){
        return new ApiInfo("Spring Boot Laptops",
                "api rest docs",
                "1.0",
                "https://www.google.com",
                new Contact("luis padilla",
                        "https://www.google.com","laph@gmail.com"),
                "MIT",
                "https://www.google.com",
                Collections.emptyList());
    }
}
