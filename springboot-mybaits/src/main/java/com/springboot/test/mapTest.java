package com.springboot.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class mapTest {
	
	public static void main(String[] args) {
		User user=new User(1,"习近平");
		Map<User,String> map=new HashMap<User,String>();
		map.put(user, "中国梦");
		for(Entry<User,String> entry:map.entrySet()){
			if(entry.getKey().getUname().equals("习近平")){
				entry.getKey().setUname("胡锦涛");
			}
		}
		
		Iterator<User> it=map.keySet().iterator();
		while(it.hasNext()){
			User u=it.next();
			System.out.println(map.get(u));
		}
	}

}
