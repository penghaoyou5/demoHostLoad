package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRequesController {

	//localhost:6093/testhotload
	@RequestMapping("testhotload")
	private String RequestTest(){
		SecondCladd.todString();
		StringBuilder sb = new StringBuilder();
		sb.append("before host load");

		sb.append("\n");

//		sb.append("after host load  NO ERROR???");
//		sb.append(FDSFDFDFDSF)
		SecondCladd.todString();

		sb.append("\n");
		sb.append("逻辑后重新实验");

		return sb.toString();
	}
}
