package com.springboot.test;

public class User {
	
	private Integer uid;
	
	private String uname;

	public User(Integer uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public int hashCode(){
		final int permit=31;
		int result=1;
		result=permit*result+(uid==null?0:uid.hashCode());
		//result=permit*result+(uname==null?0:uname.hashCode());
		return result;
	}

}
