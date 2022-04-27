package com.spring.cloudfunctions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringCloudFunctionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionsApplication.class, args);
	}

	
//	curl -H "Content-Type text/plain" http://localhost:8080/function -d "message"
	@Bean
	public Function<String, String> function(){
        return value -> new StringBuilder(value).reverse().toString();
	}
	
	
//	curl -H "Content-Type text/plain" http://localhost:8080/consume -d "message"
	@Bean 
	public Consumer<String> consume(){
		return input -> System.out.println("Input "+ input);
	}
	
	
//	curl -H "Content-Type text/plain" http://localhost:8080/supply
	@Bean 
	public Supplier<String> supply(){
		return () -> "Hello";
	}

}
