package com.ffk.entity;

import java.io.Serializable;

public class User implements Serializable{
	
	private int id;
	private String name;
	private String pwd;
	private String phone;
	
	public User(){
		
	}
	public User(int id, String name, String pwd, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
	}
	public User(String name, String pwd, String phone) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
	}
	/** 
	 * @return id 
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/** 
	 * @return name 
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	 * @return pwd 
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/** 
	 * @return phone 
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof User) {
			User o = (User) obj;
			return this.id == o.id;
		}
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+","+name+","+pwd+","+phone;
	}
	
	
}
