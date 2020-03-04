package com.controller;

import com.config.DemoConfig;
import com.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoController {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);

		System.out.println(annotationConfigApplicationContext.getBean(DemoService.class));
	}
}
