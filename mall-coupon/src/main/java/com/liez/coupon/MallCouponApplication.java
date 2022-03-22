package com.liez.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
@MapperScan(value = "com.liez.coupon.dao")
public class MallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallCouponApplication.class, args);
	}

}
