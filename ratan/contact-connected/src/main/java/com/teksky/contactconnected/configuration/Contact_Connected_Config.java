package com.teksky.contactconnected.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Contact_Connected_Config {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.teksky.payment"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    @SuppressWarnings("unused")
    private ApiInfo buildApiInfo() {
        return new ApiInfo("Payment Services Documentation" , "This Service will collect all the payments",
                "1.0.0", "some Terms url", "Team Name", "Teksky", "TekskyUrl");
    }
}