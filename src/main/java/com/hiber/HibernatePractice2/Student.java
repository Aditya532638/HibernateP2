package com.hiber.HibernatePractice2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int rollNo;
	private String name;
	private String address;
	private String hobby;
	
	public Student() {
		
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Student(int rollNo, String name, String address, String hobby) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", hobby=" + hobby + "]";
	}

}
