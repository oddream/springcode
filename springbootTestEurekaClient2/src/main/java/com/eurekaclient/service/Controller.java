package com.eurekaclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaclient.service.inter.IClient1;

@RestController
public class Controller {

	@Autowired
	IClient1 client1;

	@RequestMapping("/local/{name}")
	public String getSentence(@PathVariable String name) {
		return "(i'm client2) : " + client1.helloService(name);
	}
}