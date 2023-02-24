package com.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LibapiApplication extends SpringBootServletInitializer  {
    public static void main(String[] args) {
        SpringApplication.run(LibapiApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	// TODO Auto-generated method stub
    	return builder.sources(LibapiApplication.class);
    }
    
}
