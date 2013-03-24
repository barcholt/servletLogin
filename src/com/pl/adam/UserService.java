package com.pl.adam;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	User a = new User("jerzy", "haslo", "Jerzy", "504 000 996");
	User b = new User("marian", "haslo", "Marian", "504 000 997");
	User c = new User("tomasz", "haslo", "Tomasz", "504 000 998");
	User d = new User("katarzyna", "haslo", "Katarzyna", "504 000 999");
	List<User> users = new ArrayList<User>();
	
 public UserService () {
	 users.add(a);
	 users.add(b);
	 users.add(c);
	 users.add(d);
	 

	 
 }
	
	public Boolean Authenticate (String login, String password) {
		Boolean bo = false;
		for (User z: users){
			if (z.login.equals(login)){
				bo= true;
				
			}
			else {
				bo= false;
			}
		}
		return bo;
	}
	
	public User getUser(String login) {
		User us=new User();
		
		for (User z: users){
			if (z.login.equals(login)){
				us = z;
			}
			else {
				us = null;
			}
		}
		return us;
			
	}
	
}
