package com.ibatis.mapper;

import com.ibatis.models.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	 List<User> findAll();

	@Insert("insert into user(name,salary) values(#{name},#{salary})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
			before = false, resultType = Integer.class)
	void insert(User user);
}
