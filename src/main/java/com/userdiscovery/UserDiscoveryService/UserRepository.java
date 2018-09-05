package com.userdiscovery.UserDiscoveryService;

import java.util.List;

public interface UserRepository {

	
	List<User> getAllUsers();
	
	User validateUser(long id);
}
