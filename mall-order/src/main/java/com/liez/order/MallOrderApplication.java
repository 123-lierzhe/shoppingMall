package com.liez.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Auther liez
 * @Date 21:03 2021/9/6
 */
@MapperScan("com.liez.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class MallOrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallOrderApplication.class);
	}
}
