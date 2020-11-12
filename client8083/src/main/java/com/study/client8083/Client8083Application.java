package com.study.client8083;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author cuijixu
 */
@SpringBootApplication
@EnableZuulProxy
public class Client8083Application {

	public static void main(String[] args) {
		SpringApplication.run(Client8083Application.class, args);
	}

}
