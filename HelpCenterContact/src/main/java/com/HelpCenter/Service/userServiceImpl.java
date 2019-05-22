package com.HelpCenter.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HelpCenter.Mapper.UserMapper;
import com.HelpCenter.Mapper.domainMapper;
import com.HelpCenter.Model.domainModel;
import com.HelpCenter.Model.userModel;
import com.HelpCenter.dao.userDao;
import com.HelpCenter.domain.domainUser;
import com.HelpCenter.domain.userDomain;
import com.HelpCenter.response.Response;

@Service
public class userServiceImpl implements userService {
	@Autowired
	private userDao userDao;
	
	@Autowired
     private domainMapper domaMapper;
	private static final Logger logger = LoggerFactory.getLogger(userServiceImpl.class);

	@Override
	public Response adduser(userModel item) throws Exception {

		try {

			ModelMapper mapper = new ModelMapper();
			userDomain userDomain = new userDomain();

			mapper.map(item, userDomain);
			return userDao.adduser(userDomain);
		} catch (Exception e) {
			logger.info("Exception in add user Service: " + e.getMessage());
			return null;
		}

	}

	@Override
	public List<domainModel> getUser() {
		List<domainUser> domainUser = userDao.getUser();
		return domaMapper.entityList(domainUser);
	}
}
