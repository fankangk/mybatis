package com.fankk.model;

public class UserPO {
   
	   String  name;
	   String  password;
	   String  role;
	   String  permissions;
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "UserPO{" +
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				", role='" + role + '\'' +
				", permissions='" + permissions + '\'' +
				'}';
	}


}
