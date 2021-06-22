package com.jt.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JtServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtServiceRegistryApplication.class, args);
	}

}
