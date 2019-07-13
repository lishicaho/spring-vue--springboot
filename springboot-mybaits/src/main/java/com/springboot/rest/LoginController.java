package com.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.demo.MyResult;
import com.springboot.demo.User;
import com.springboot.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public Boolean login(@RequestParam String userNmae,@RequestParam String password){
		Boolean bl=loginService.login(userNmae,password);
		return bl;
		
	}
	
	@PostMapping("/user/login")
	 @ResponseBody
	public MyResult userLogin(@RequestBody User user){
		MyResult result=loginService.userLogin(user);
		
		return result;
		
	}
	
	

}
