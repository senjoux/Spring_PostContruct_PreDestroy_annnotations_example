package com.tn.ham.example;


/**
*
* @author Hamza
*/

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Pays {
	private String msg;
	
	@PostConstruct
	public void init_the_message(){
		msg="Bonjour ma Tunisie ";
		System.out.println("succes of message inialization first");
	}
	
	
	@PreDestroy
	public void  do_some_clean_up(){
		System.out.println("reset of bean properties, do some clean up ... etc");
		
		//example 
		msg="";
	}


	public String getMsg() {
		return msg;
	}
	
	
	
}
