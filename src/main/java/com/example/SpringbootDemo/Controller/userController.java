package com.example.SpringbootDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootDemo.Dao.UserDao;
import com.example.SpringbootDemo.Entity.User;
import com.example.SpringbootDemo.Mapper.UserMapper;

@RestController
public class userController {
	
	@Autowired
	UserMapper usermapper;
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/getUser1")
	public User userMapperTest()
	{		
		return usermapper.getByName("Lucy");
	}
	
	@RequestMapping("/getUser2")
	public User userDaoTest()
	{		
		return userDao.selectUserByName("Jay");
	}
	
	@RequestMapping("/greeting")
	public String userGreeting()
	{		
		return "Hello";
	}
}
