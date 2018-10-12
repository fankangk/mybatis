package com.fankk;

import com.fankk.dao.UserDAO;
import com.fankk.model.UserPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisDemoApplicationTest extends BaseTestApplication1{


	@Autowired
	UserDAO userDAO;

	@Test
	public void contextLoads() {

		List<UserPO> list= userDAO.checkByName("fan");
		for(UserPO user : list){
			System.out.println(user.toString());
		}
	//	System.out.println(userPO.getName());
	}

}
