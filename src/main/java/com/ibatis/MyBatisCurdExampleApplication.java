package com.ibatis;

import com.ibatis.models.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MappedTypes(User.class)
@MapperScan("com.ibatis.mapper")
public class MyBatisCurdExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisCurdExampleApplication.class, args);
	}

}
