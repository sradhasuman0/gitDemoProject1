package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class details {
	@Id
	

	private String yourname;

	private int rollnum;
	private int class_in;
	private String grade;
	

	public String getyourName() {
		return name;
	}
	public void setyourName(String yourname) {
		this.yourname = yourname;

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
		return "details [name=" + yourname + ", rollnum=" + rollnum + ", class_in=" + class_in + ", grade=" + grade
				+  "]";
	}
	
	
	

}
