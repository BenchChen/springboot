package com.cx;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cx.user.model.User;
import com.cx.user.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private UserService service ;
	
	/**
	 * Test insert
	 */
	@Test
	public void createUser() {
		User userModel = new User();
		userModel.setAge(1);
		userModel.setCreateTime(new Date().getTime());
		userModel.setUserName("作者");
		service.createUser(userModel);
	}

	/**
	 * Test update
	 */
	@Test
	public void updateUser() {
		User userModel = new User();
		userModel.setUserId(2);
		userModel.setAge(15);
		userModel.setCreateTime(new Date().getTime());
		userModel.setUserName("作者");
		boolean createUser = service.updateUser(userModel);
		System.err.println(createUser);
	}
	/**
	 * Test delete
	 */
	@Test
	public void delUser() {
		boolean deUser = service.deUser(3);
		System.err.println(deUser);
	}

	/**
	 * Test find user by id 
	 */
	@Test
	public void findUser() {
		User findUser = service.findUser(2);
		System.err.println(findUser);
	}
	
	
	
	
}
