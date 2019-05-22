package com.HelpCenter.dao;

import java.util.List;

import com.HelpCenter.domain.domainUser;
import com.HelpCenter.domain.userDomain;
import com.HelpCenter.response.Response;

public interface userDao {
	
	public  Response adduser(userDomain itemDomain) throws Exception ;

	public List<domainUser> getUser();
		
}
