package com.springrest.restsample;

import com.springrest.restsample.filters.HeaderFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestsampleApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<HeaderFilter> headerFilter(){

		FilterRegistrationBean<HeaderFilter> registrationBean = new FilterRegistrationBean<>();

		registrationBean.setFilter(new HeaderFilter());
		registrationBean.addUrlPatterns("/*");

		return registrationBean;
	}
}
