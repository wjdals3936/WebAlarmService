package com.pjm.alarmdemo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/** Swagger 환경 설정 **/

@Configuration // 환경(설정)에 관한 일을 함
@EnableSwagger2 // swagger를 활성화 시키겠습니다(enable)
public class SwaggerConfiguration {
    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pjm.alarmdemo1"))
                // 어디부터 어디까지 component-scan 역할
                // 이 부분 꼭 바꿔야 해!!!!!!!!!!!!!
                .paths(PathSelectors.any())
                .build();
    }

    /** ui에 뿌려주는 부분 **/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Open API Test with Swagger")
                .description("설명")
                .version("1.0.0")
                .build();
    }
}