package com.fankk.dao;


import com.fankk.model.UserPO;

import java.util.List;

public interface UserDAO {
	List<UserPO> checkByName(String name);
}
