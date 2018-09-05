package com.userdiscovery.UserDiscoveryService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserService implements UserRepository{

	private Map<Long,User> usermap=new HashMap<Long,User>();
	
	public UserService()
	{
		User user=new User();
		user.setId(1001);
		user.setName("Optimus Prime");
		usermap.put((long) 1001, user);
		user=new User();
		user.setId(1002);
		user.setName("Bumble Bee");
		usermap.put((long) 1002, user);
		user=new User();
		user.setId(1003);
		user.setName("Iron Hide");
		usermap.put((long) 1003, user);
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return new ArrayList<User>(usermap.values());
	}

	@Override
	public User validateUser(long id) {
		// TODO Auto-generated method stub
		return usermap.get(id);
	}
	
}
