package com.wmz.di07;

public class School {
	
	private String sname;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String sname) {
		super();
		this.sname = sname;
	}

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
