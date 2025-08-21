package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	
    @RequestMapping("/")
    String home() {
    	LOGGER.info("Home called " + new Date().toGMTString());
        return "Hello World Testing Change 1234";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}