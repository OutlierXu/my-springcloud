package com.xuhao.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceProviderUser8081Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUser8081Application.class, args);
	}
}
