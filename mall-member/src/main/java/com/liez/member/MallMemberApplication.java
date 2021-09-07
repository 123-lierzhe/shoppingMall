package com.liez.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther liez
 * @Date 20:27 2021/9/6
 */
@MapperScan("com.liez.member.dao")
@SpringBootApplication
public class MallMemberApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallMemberApplication.class, args);
	}

}
