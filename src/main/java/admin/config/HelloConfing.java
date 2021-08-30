package admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import admin.been.Hello;

@Configuration
public class HelloConfing {
	@Bean("hello")
   public Hello getHello() {
	   return new Hello();
   }
}
