package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any()) // 모든 RequestMapping URI 추출
                // .apis(RequestHandlerSelectors.basePackage("com")) // 패키지 기준 추출
                .paths(PathSelectors.ant("/**")) // 경로 패턴 URI만 추출
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "TEST REST API ", //title
                "스프링부트 test 프로젝트", //description
                "v3", //version
                "서비스 약관 URL", //termsOfServiceUrl
                "linked2ev", //contactName
                "License", //license
                "localhost:8888"); //licenseUrl
    }

}
