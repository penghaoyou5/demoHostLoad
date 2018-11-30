package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class InitClass {

	@PostConstruct
	public void init(){
		System.out.println("加载初始化的内容 init start");
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("加载初始化的内容 init end");
	}
}
