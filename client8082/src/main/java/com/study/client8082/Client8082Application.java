package com.study.client8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cuijixu
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Client8082Application {

	public static void main(String[] args) {
		SpringApplication.run(Client8082Application.class, args);
	}

}
