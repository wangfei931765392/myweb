package com.example.myweb._01hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

//@SpringBootApplication
public class MywebApplication {

	public static void main(String[] args) {
		System.out.println(String.valueOf(args[0]));
		System.out.println(Arrays.toString(args));
		SpringApplication.run(MywebApplication.class, args);
	}
}
