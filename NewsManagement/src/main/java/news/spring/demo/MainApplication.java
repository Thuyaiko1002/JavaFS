package news.spring.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication giúp bạn tự động cấu hình Spring, 
//và tự động quét (Scan) toàn bộ project để tìm ra các thành phần Spring (Controller, Bean, Service,...)
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
//
//	@EnableSwagger2
//	public class SwaggerConfig {
//		@Bean
//		public Docket api() {
//			return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
//					.paths(PathSelectors.any()).build();
//		}
//	}

}
