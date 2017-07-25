package com.example.SpringbootDemo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.SpringbootDemo.Entity.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM users WHERE name = #{name}")
    User getByName(@Param("name") String name);
}
