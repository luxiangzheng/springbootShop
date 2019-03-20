package com.lxz.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxz.demo.bean.UserInfo;
import com.lxz.demo.dao.UserInfoMapper;
import com.lxz.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper; 
	@Override
	public void insertUserInfo(UserInfo userInfo) {

		userInfoMapper.insertUserInfo(userInfo);
	}

}
