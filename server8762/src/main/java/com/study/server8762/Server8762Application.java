package com.study.server8762;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cuijixu
 */
@SpringBootApplication
@EnableEurekaServer
public class Server8762Application {

	public static void main(String[] args) {
		SpringApplication.run(Server8762Application.class, args);
	}

}
