package admin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import admin.been.Hello;
import admin.config.HelloConfing;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfing.class);
	  Hello hello = (Hello)context.getBean("hello");
	  hello.setMessages("This is working");
	  System.out.println(hello.getMessages());
	  
  }
}
