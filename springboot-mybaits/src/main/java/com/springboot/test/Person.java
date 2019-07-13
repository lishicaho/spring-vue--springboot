package com.springboot.test;

public class Person {
	
	 private String name;
	 private int age;
	
	 //构造方法
	public Person(String n,int a){
	 name = n; age = a;
	}
	public Person(){
		super();
		}
	
	
	static void main(String[] args){
	Person p = new Person("张三",14);//这就是作用
	
	Person a=new Person();
	}
}
