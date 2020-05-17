package com.wmz.di08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//指明属性名
@Component("myStudent")
public class Student {
	@Value("张三")
	private String name;
	@Value("23")
	private int age;
	
	@Autowired   //byType自动注入
	@Qualifier("mySchool")   //byName自动注入,需要以上两个注解同时使用
	private School school;
	
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("=================");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("=================");
		this.age = age;
	}
	
	

}
