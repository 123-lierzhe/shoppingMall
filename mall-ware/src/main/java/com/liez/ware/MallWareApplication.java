package com.liez.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Auther liez
 * @Date 21:17 2021/9/6
 */
@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
public class MallWareApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallWareApplication.class);
	}
}
