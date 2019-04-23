package com.chixing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootApplication：有以下三个注解的功能
 *
 * 	@EnableAutoConfiguration：启用Spring Boot的自动配置机制
 * 	@ComponentScan：@Component在应用程序所在的包上启用扫描（请参阅最佳实践）
 * 	@Configuration：允许在上下文中注册额外的bean或导入其他配置类
 */
 @SpringBootApplication
 @MapperScan(value = "com.chixing.dao")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
