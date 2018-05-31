package com.example.myweb._02configurationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created with IDEA
 * Author : wangfei
 * Date :  2018/5/18
 * Time : 14:49
 * Describe :
 */
@SpringBootApplication
public class AppConfig {

	@Bean
	@ConfigurationProperties(prefix = "db")
	public MyDruidDataSource myDruidDataSource(){
		return new MyDruidDataSource();
	}

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}
