package com.wmz.di08;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/wmz/di08/applicationContext.xml")
public class MyTest {
	//@Autowired
	//@Required("myStudent")
	@Resource(name="myStudent")
	private Student student;
	
	@Test
	public void test01() {
		
		System.out.println(student);
			
	}
	
}
