package com.sunym.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sunym.bean.User;
import com.sunym.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	public void save(User user) {

	}

	public void update(User user) {

	}

	public List<User> listUser(String filter) {
		List<User> list = new ArrayList<User>();
		list.add(new User());
		return list;
	}

	public void deleteByPrimarykey(String userId) {

	}
}
