package com.lxz.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lxz.demo.bean.UserInfo;
import com.lxz.demo.service.UserInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringbootShopApplicationTests {

	@Autowired
	private UserInfoService userInfoServer;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testInsertUserInfo(){
		UserInfo userInfo = new UserInfo();
		userInfo.setName("卢祥征");
		userInfoServer.insertUserInfo(userInfo);
	}
}
