package com.example.myweb._03datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created with IDEA
 * Author : wangfei
 * Date :  2018/5/31
 * Time : 11:14
 * Describe :
 */
@SpringBootApplication
public class AppConfig {
//
//	@Bean
//	@ConfigurationProperties(prefix = "db")
//	public DataSource dataSource(){
//		DruidDataSource ds = new DruidDataSource();
//		return ds;
//	}

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}
