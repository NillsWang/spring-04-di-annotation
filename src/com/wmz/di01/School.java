package com.wmz.di01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//指明属性名
@Component("mySchool")
public class School {
	
	@Value("清华大学")
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "School [sname=" + sname + "]";
	}
	
	

}
