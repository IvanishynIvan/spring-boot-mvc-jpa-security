package com.ivanishyn.springboot.demosecurity.dao;

import com.ivanishyn.springboot.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
