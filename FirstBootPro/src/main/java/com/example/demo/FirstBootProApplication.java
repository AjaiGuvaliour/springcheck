package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.controller.ControllerClass;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses=ControllerClass.class)
public class FirstBootProApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootProApplication.class, args);
	}

}

