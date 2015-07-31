package com.tn.ham.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
*
* @author Hamza
*/


@ComponentScan(basePackages = "com.tn.ham.example")
@Configuration
public class PostConstruct_n_PreDestroy_sample {
	
	public static void main(String args[]){
		ApplicationContext context=new AnnotationConfigApplicationContext(PostConstruct_n_PreDestroy_sample.class);
		Pays p=context.getBean(Pays.class);
		System.out.println(" message value now is ----->  "+p.getMsg());
		((ConfigurableApplicationContext)context).close();
	
	}
}
