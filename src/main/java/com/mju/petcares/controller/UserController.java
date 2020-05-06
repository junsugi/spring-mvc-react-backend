package com.mju.petcares.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.mju.petcares.dto.UserDTO;


@RestController
@RequestMapping("/api")
public class UserController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registUser(@RequestBody UserDTO user) {
		System.out.println(user.getUsername() + " "+user.getPassword());	
		return "home";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@RequestBody UserDTO user) {
		System.out.println("아이디 : " + user.getUserId());
		System.out.println("비밀번호 : " + user.getPassword());
		System.out.println("이름 : " + user.getUsername());
		System.out.println("핸드폰번호 : " + user.getPhoneNum());
		System.out.println("주소 : " + user.getAddress());
		return "home";
	}
	
	//@JsonView(UserDTO.class)
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public UserDTO main() {
		System.out.println("---------들어왔당---------");
		UserDTO user = new UserDTO();
		user.setUserId("test");
		user.setPassword("12345");
		
		return user;
	}
}
