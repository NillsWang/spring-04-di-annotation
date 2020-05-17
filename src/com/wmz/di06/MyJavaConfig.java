package com.wmz.di06;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //表示当前类将作为Spring容器来使用
public class MyJavaConfig {
	
	@Bean("mySchool")
	public School mySchoolCreator() {
		return new School("北京大学");
	}
	
	@Bean(name="myStudent", autowire=Autowire.BY_TYPE)
	public Student myStudentCreator() {
		return new Student("李四", 24);
	}

}
