package com.cx.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.user.dao.UserMapper;
import com.cx.user.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper ; 
	
	
	public boolean createUser(User user) {
		int insert = userMapper.insert(user);
		if(insert > 0) {
			return true ;
		}
		return false ;
	}
	
	

	public boolean updateUser(User user) {
		int updateByPrimaryKey = userMapper.updateByPrimaryKey(user);
		if(updateByPrimaryKey  > 0 ) {
			return true ;
		}
		return false ;
	}
	
	public User findUser(Integer userId) {
		User selectByPrimaryKey = userMapper.selectByPrimaryKey(userId);
		return selectByPrimaryKey ;
	}

	
	
	public boolean deUser(Integer userId) {
		int deleteByPrimaryKey = userMapper.deleteByPrimaryKey(userId);
		if(deleteByPrimaryKey > 0) {
			return true ;
		}
		return false ;
	}
}
