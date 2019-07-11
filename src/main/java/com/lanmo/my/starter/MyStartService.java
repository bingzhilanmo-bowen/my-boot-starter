package com.lanmo.my.starter;

public class MyStartService {

	private String name;

	private Integer age;

	public MyStartService(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String getMyInfo(){
		return "name:"+name+",age:"+age;
	}

	public String getChildInfo(String childName){
		return childName+"`S  father name is :" +name;
	}

}
