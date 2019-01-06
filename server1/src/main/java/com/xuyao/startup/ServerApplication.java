package com.xuyao.startup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableCircuitBreaker
@EnableFeignClients(basePackages={"com.xuyao.feign","com.codingapi.tx"})
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.xuyao.service")
@MapperScan("com.xuyao.dao")
@EnableTransactionManagement
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
