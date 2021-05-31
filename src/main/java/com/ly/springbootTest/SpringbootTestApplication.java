package com.ly.springbootTest;

import com.ly.springbootTest.service.MyTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootTestApplication.class, args);

		MyTestService myTestService = context.getBean(MyTestService.class);

		myTestService.test();

		context.close();

	}

}
