
package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class details {
	@Id
	private String name;

	private int rollnum;
	private int class_in;
	private String grade;
	public details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "details [name=" + name + ", rollnum=" + rollnum + ", class_in=" + class_in + ", grade=" + grade + "]";
	}
	public details(String name, int rollnum, int class_in, String grade) {
		super();
		this.name = name;
		this.rollnum = rollnum;
		this.class_in = class_in;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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