package com.example.myweb._03datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


/**
 * Created with IDEA
 * Author : wangfei
 * Date :  2018/5/18
 * Time : 17:14
 * Describe :
 */
@RestController
public class DataSourceController {
	@Autowired
	private DataSource dataSource;

	@RequestMapping("/druiddDataSource")
	public String dataSourcePaga() throws Exception{
		System.out.println(dataSource.getConnection());
		System.out.println(dataSource);
		return "hello dataSource";
	}
}
