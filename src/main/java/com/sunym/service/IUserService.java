package com.sunym.service;

import java.util.List;

import com.sunym.bean.User;

public interface IUserService {
	public void save(User user);
	
	public void update(User user);
	
	public List<User> listUser(String filter);
	
	public void deleteByPrimarykey(String userId);
	
}
