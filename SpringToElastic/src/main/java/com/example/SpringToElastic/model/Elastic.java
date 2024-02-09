package com.example.SpringToElastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName = "employee")
public class Elastic {

	@Id
	private String id;
	private String fname;
	private String lname;
	public Elastic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Elastic(String id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Elastic [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
