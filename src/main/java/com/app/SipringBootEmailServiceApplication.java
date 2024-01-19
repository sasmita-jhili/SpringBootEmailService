package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.service.MailService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class SipringBootEmailServiceApplication implements CommandLineRunner {
	@Autowired
	private MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(SipringBootEmailServiceApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		mailService.mailMsgService("satyabratblg5@gmail.com", "I Love You", "Love mail");
		
	}

}
