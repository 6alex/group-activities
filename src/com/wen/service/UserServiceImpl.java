package com.wen.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wen.dao.UserMapper;
import com.wen.po.User;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	UserMapper um;
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User u = um.login(user);
		return u;
	}

}
