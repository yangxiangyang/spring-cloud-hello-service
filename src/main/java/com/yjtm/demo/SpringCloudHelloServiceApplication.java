package com.yjtm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @author yangxiangyang
 * 2018年9月28日 描述：@EnableDiscoveryClient让服务使用eureka服务器实现服务注册和发现
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHelloServiceApplication.class, args);
	}
}
