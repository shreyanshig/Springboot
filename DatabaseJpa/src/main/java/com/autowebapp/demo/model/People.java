package com.autowebapp.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class People
{
	@Id
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString()
	{
		return "People [pid"+pid+",pname"+pname+"]";
	}
}
