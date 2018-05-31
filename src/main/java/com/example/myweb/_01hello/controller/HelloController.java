package com.example.myweb._01hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IDEA
 * Author : wangfei
 * Date :  2018/5/17
 * Time : 17:13
 * Describe :
 */
@Controller
public class HelloController {

	@Autowired
	private ApplicationArguments applicationArgument;


	@RequestMapping("/")
	@ResponseBody
	public String helloPage(){
		System.out.println(applicationArgument.getNonOptionArgs());
		return "springboot-05";
	}
}
