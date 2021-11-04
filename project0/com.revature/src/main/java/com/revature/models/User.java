package com.revature.models;

public class User {
	
	private int id;
	private String name;
	private String username;
	private String password;
	private Role role;
	
	




	public User(String name, String username, String password) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.username = username;
		this.password = password;
	}



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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}





	
	
	
	

	
	


	

}
