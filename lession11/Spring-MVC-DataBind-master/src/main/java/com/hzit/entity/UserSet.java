package com.hzit.entity;

import java.util.HashSet;
import java.util.Set;

public class UserSet {
	private Set<User> users = new HashSet<User>();

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public UserSet(){  
        users.add(new User());  
        users.add(new User());  
        users.add(new User());  
    }
}
