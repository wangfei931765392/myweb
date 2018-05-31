package com.example.myweb._02configurationproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * Author : wangfei
 * Date :  2018/5/18
 * Time : 14:53
 * Describe :
 */
@Data
//@Component
//@ConfigurationProperties(prefix = "db")
public class MyDruidDataSource {
	public String username;

	public String password;

	public String url;

	public String driverClassName;
}
