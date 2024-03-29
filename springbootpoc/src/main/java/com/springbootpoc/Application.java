package com.springbootpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
//	
//	@Bean // Serialize message content to json using TextMessage
//	public MappingJackson2MessageConverter jacksonJmsMessageConverter() {
//	    MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//	    converter.setTargetType(MessageType.TEXT);
//	    converter.setTypeIdPropertyName("_type");
//	    return converter;
//	}	
}
