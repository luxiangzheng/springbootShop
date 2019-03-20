package com.lxz.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.lxz.demo.bean.UserInfo;

@Mapper
public interface UserInfoMapper {

	@Insert(value="insert into userinfo(name) values(#{name})")
	public void insertUserInfo(UserInfo userInfo);
}
