package com.lxz.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxz.demo.bean.UserInfo;
import com.lxz.demo.dao.UserInfoMapper;
import com.lxz.demo.dao.UserInfoMapper1;
import com.lxz.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Autowired
	private UserInfoMapper1 userInfoMapper1;
	@Override
	public void insertUserInfo(UserInfo userInfo) {

		userInfoMapper.insertUserInfo(userInfo);
	}
	@Override
	public void insertUserInfo1(UserInfo userInfo) {
		// TODO Auto-generated method stub
		userInfoMapper1.insertUserInfo(userInfo);
	}

}
