package com.xyz;

import java.util.HashMap;

public class Question {
	private int id;  
	private String name,username;  
	private HashMap<String,String> answers;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public HashMap<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(HashMap<String, String> answers) {
		this.answers = answers;
	}
	public Question() {}  
	public Question(String name, String username, HashMap<String, String> answers) {  
	    super();  
	    this.name = name;  
	    this.username = username;  
	    this.answers = answers;  
	}  

}
