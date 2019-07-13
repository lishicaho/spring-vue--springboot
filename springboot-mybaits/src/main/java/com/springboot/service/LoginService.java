package com.springboot.service;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.MyResult;
import com.springboot.demo.User;
import com.springboot.mapper.UserMapper;

@Service
public class LoginService {
	
	@Autowired
	 private UserMapper userMapper;

	public Boolean login(String userNmae, String password) {
		Boolean bl=userMapper.login(userNmae,password);
		return bl;
	}

	public MyResult userLogin(User user) {
		User u=userMapper.userLogin(user);
		MyResult result=new MyResult();
		if(ObjectUtils.isNotEmpty(user)){
			result.setCode(0);
			result.setMsg("登陆成功");
			result.setObject(user);
		}else{
			result.setCode(1);
			result.setMsg("登陆失败");
		}
		return result;
	}

}
