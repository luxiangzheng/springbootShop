package com.lxz.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lxz.demo.bean.UserInfo;
import com.lxz.demo.service.UserInfoService;

import ch.qos.logback.classic.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringbootShopApplicationTests {

	private final static Logger logger = (Logger) LoggerFactory.getLogger(MySpringbootShopApplicationTests.class);
	@Autowired
	private UserInfoService userInfoServer;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testInsertUserInfo(){
		UserInfo userInfo = new UserInfo();
		userInfo.setName("张永利***");
		logger.info(userInfo.getName());
		userInfoServer.insertUserInfo1(userInfo);
	}
}
