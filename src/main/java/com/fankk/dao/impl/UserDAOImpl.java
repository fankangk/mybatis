package com.fankk.dao.impl;

import javax.annotation.Resource;

import com.fankk.dao.UserDAO;
import com.fankk.model.UserPO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository("userdao")
public class UserDAOImpl implements UserDAO {

	
	@Resource
	private SqlSession sqlSession;
	

	@Override
	public List<UserPO> checkByName(String name) {
		
		return sqlSession.selectList("UserMap.checkByName",name);
	}
}
