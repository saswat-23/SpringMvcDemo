package com.saswat23.springmvcdemo;

public class Student {
	
	private int sid;
	private String sname;
	private int smarks;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	
	@Override
	public String toString() { 
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
}
