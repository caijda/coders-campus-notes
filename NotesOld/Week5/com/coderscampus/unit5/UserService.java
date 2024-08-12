package com.coderscampus.unit5;

public class UserService {

	public User createUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
	
	public UserPOJO createUserPOJO(String[] stringInput) {
		UserPOJO user = new UserPOJO(null,null,null);
		user.setUsername(stringInput[0]);
		user.setPassword(stringInput[1]);
		user.setName(stringInput[2]);
		return user;
	}
	
	public String[] parseText(String input) {
		String[] array = input.split(",");
		return array;
	}
}
