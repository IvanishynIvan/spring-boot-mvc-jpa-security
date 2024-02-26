package com.ivanishyn.springboot.demosecurity.service;

import com.ivanishyn.springboot.demosecurity.entity.User;
import com.ivanishyn.springboot.demosecurity.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
