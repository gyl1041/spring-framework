package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com")
@Configuration
public class DemoConfig {
	public void sayHello() {
		System.out.println("Hello!!!!!");
	}
}
