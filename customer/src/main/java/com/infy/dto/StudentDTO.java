package com.infy.dto;

public class StudentDTO {
	
	private int rollno;
	private String name;
	private String stream;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "StudentDTO [rollno=" + rollno + ", name=" + name + ", stream=" + stream + "]";
	}
	

}
