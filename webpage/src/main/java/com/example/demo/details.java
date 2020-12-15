package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class details {
	@Id
	
	private String myname;
	private int rollnum;
	private int class_in;
	private String grade;
	
	public String getmyName() {
		return myname;
	}
	public void setmyName(String myname) {
		this.myname = myname;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public int getClass_in() {
		return class_in;
	}
	public void setClass_in(int class_in) {
		this.class_in = class_in;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	}
	@Override
	public String toString() {
		return "details [name=" + name + ", rollnum=" + rollnum + ", class_in=" + class_in + ", grade=" + grade
				+  "]";
	}
	
	
	

}
