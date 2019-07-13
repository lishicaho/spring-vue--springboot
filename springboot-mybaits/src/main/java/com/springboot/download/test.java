package com.springboot.download;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.springboot.demo.User;

public class test {
	/*
	 * 1.下载 2.contains 3.四大特性 4.创建视图 5.各种判断 6.vue页面的写法 7.获取申请 报销流程节点 8.退回 9.
	 */
	@Test
	public void test5() {
		List<String> list = new ArrayList<String>();
		list.add("1");

		if (list != null && list.size() > 0) {
			System.out.println("yes");
		}

		String s = "4";
		if (StringUtils.isNotBlank(s)) {
			System.out.println("5");
		}
		if (StringUtils.isNotEmpty(s)) {
			System.out.println("6");
		}
		int i = 1;
		if (i == 1) {
			System.out.println("7");
		}

	}
	
	@Test
	public void test22(){
		List<User> list =new ArrayList<User>();
		//map
		User user1=new User();
		user1.setId(1);
		user1.setName("李1");
		user1.setPassword("123");
		user1.setPhone("123");
		list.add(user1);
		User user2=new User();
		user2.setId(2);
		user2.setName("李2");
		user2.setPassword("123");
		user2.setPhone("123");
		list.add(user2);
		List<Map> listMap=list.stream().map(e->{
			Map map=new HashMap();
			map.put("id", e.getId());
			map.put("name", e.getName());
			return map;
		}).collect(Collectors.toList());
		
		List<String>listMap2=list.stream().map(User::getName).collect(Collectors.toList());
		
		// filter
		List listUser=list.stream().filter(e->e.getId().equals(1)).collect(Collectors.toList());
		Map<String,List<User>> listGroup=list.stream().collect(Collectors.groupingBy(User::getName));
		System.out.println("end");
	}
	
		
	
	}