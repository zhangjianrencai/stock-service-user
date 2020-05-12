package com.stock.service.impl;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stock.entity.User;
import com.stock.service.UserService;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	
	private User generateUser() {
		User user = new User();
		user.setEmail("1025962108@qq.com");
		user.setMobileNumber("15680709872");
		user.setPassword("12345678");
		user.setUserName("Jam");
		user.setUserType('0');
		return user;
	}

	@Test
    @Transactional
    @Rollback
	public void testSave() throws Exception {
		User User = this.generateUser();
		User savedUser = userService.save(User);
		Assert.assertEquals(savedUser.getEmail(), "1025962108@qq.com");
		Assert.assertEquals(savedUser.getMobileNumber(), "15680709872");
		Assert.assertEquals(savedUser.getPassword(), "12345678");
		Assert.assertEquals(savedUser.getUserName(), "Jam");
		Assert.assertEquals(savedUser.getUserType(), '0');
	}

}
