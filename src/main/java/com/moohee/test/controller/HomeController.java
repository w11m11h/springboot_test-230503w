package com.moohee.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moohee.test.dto.MemberDto;

@Controller
public class HomeController {

	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello";
	}
	
}
