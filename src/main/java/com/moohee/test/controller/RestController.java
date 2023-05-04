package com.moohee.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.moohee.test.dto.MemberDto;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "/test")
	public String test() {
		return "welcome test!!";
	}
	
	@RequestMapping(value = "/member")
	public MemberDto member() {
		
		MemberDto dto = new MemberDto();
		dto.setName("홍길동");
		dto.setId("tiger");
		dto.setPw("12345");
		dto.setAge(17);
		
		return dto;
	}

}
