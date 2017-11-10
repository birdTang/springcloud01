package com.tangp.sringBoot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${book.name}")
	private String name;
	@Value("${book.author}")
	private String author;
	@Value("${book.all}")
	private String allmsg;
	@RequestMapping("/hello")
	public String index() {
		return "Hello world";
	}
	
	@RequestMapping("/book")
	public String book() {
		return name+":"+author +"===="+allmsg;
	}
}
