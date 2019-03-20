package com.lxz.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.lxz.demo.bean.UserInfo;
/**
 * 基于配置的mapper
 * @author lu
 *
 */
@Mapper
public interface UserInfoMapper1 {

	public void insertUserInfo(UserInfo userInfo);
}
