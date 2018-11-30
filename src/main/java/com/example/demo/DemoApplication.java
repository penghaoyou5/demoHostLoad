package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	static boolean start = false;

	public static void main(String[] args) {
		try {
			if (!start) {
				System.out.println("开始启动 睡眠");
				Thread.sleep(2 * 1000);
				System.out.println("结束启动睡眠 两分钟 ");
				start = true;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SpringApplication.run(DemoApplication.class, args);
	}
}
