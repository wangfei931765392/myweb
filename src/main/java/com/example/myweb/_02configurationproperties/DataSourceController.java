package com.example.myweb._02configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IDEA
 * Author : wangfei
 * Date :  2018/5/18
 * Time : 14:56
 * Describe :
 */
@Controller
public class DataSourceController {

	@Autowired
	private MyDruidDataSource myDruidDataSource;

	@ResponseBody
	@RequestMapping("/dataSource")
	public String dataSourcePage(){
		System.out.println(myDruidDataSource);
		return "dataSource123";
	}
}
