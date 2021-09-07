package com.liez.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther liez
 * @Date 21:14 2021/9/6
 */
@MapperScan("com.liez.product.dao")
@SpringBootApplication
public class MallProductApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class);
	}
}
