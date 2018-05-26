package com.tangp.sringBoot01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
	@Autowired
	private DiscoveryClient discoverClient;

	@RequestMapping("/hello")
	public String index() {
		List<ServiceInstance> list = discoverClient.getInstances("hello-server");
		for (ServiceInstance server : list) {
			System.out.println(
					"host:" + server.getHost() + "port:" + server.getPort() + "serverid:" + server.getServiceId());
		}
		return "Hello world";
	}

	@RequestMapping("/book")
	public String book() {
		return name + ":" + author + "====" + allmsg;
	}
}
