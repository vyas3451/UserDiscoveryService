package com.userdiscovery.UserDiscoveryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/users")
	public User[] all()
	{
		List<User> users=userRepository.getAllUsers();
		return users.toArray(new User[users.size()]);
	}
	
	@RequestMapping("/users/{id}")
	public User validateAccount(@PathVariable("id") long id)
	{
		User user=userRepository.validateUser(id);
		return user;
		
	}
}
