package com.xuhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceHystrixDashboard1301Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHystrixDashboard1301Application.class, args);
	}
}
