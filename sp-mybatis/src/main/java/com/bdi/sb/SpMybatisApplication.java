package com.bdi.sb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdi.sb.dao")
public class SpMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpMybatisApplication.class, args);
	}

}
