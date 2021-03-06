package com.wmz.di05;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//指明属性名
@Component("myStudent")
public class Student {
	@Value("张三")
	private String name;
	@Value("23")
	private int age;
	
	@Resource(name = "mySchool")
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
	
	@PostConstruct
	public void afterInit() {
		System.out.println("初始化之后");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("销毁之前");
	}
	
}
