package com.liez.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Auther liez
 * @Date 21:14 2021/9/6
 */
@MapperScan("com.liez.product.dao")
@EnableDiscoveryClient
@RefreshScope
@SpringBootApplication
public class MallProductApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class);
	}
}
