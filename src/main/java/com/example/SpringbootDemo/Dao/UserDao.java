package com.example.SpringbootDemo.Dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.example.SpringbootDemo.Entity.User;


@Component
public class UserDao {
	
	private SqlSession sqlSession;
	
	public UserDao(SqlSession sqlSession)
	{
		this.sqlSession = sqlSession;
	}
	
	public User selectUserByName(String name)
	{
		String statement = "com.example.SpringbootDemo.userMapper.getUser";
		User user = sqlSession.selectOne(statement, name);
		System.out.println(user);	
		return user;
	}
}
