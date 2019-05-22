package com.HelpCenter.dao;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.HelpCenter.domain.domainUser;
import com.HelpCenter.domain.userDomain;
import com.HelpCenter.response.Response;

@Repository
public class userDaoImpl implements userDao {
	public static final Logger logger = LoggerFactory.getLogger(userDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Response adduser(userDomain itemDomain)throws Exception {
		Response response = (Response) CommonUtils.getResponseObject("now i added   an user es ");

		try {
			String query = "INSERT INTO useinfo(name,email,description,domain) VALUES(?,?,?,?)";
			int result = jdbcTemplate.update(query, new Object[] {itemDomain.getName(),itemDomain.getEmail(),itemDomain.getDescription(),itemDomain.getDomain()});
			if (result == 1) {
				response.setStatus(StatusCode.SUCCESS.name());
				response.setData(itemDomain);
				return response;
			} else {
				response.setStatus(StatusCode.ERROR.name());
				return response;
			}
		}

		catch (Exception e) {
			logger.error("Exception in  userDao:Adduser" + e.getMessage());
			response.setStatus(StatusCode.ERROR.name());
			response.setErrors(e.getMessage());
		}

		return response;
	}
	public List<domainUser>getUser(){
		try {
			String sql ="select * from domain ";
			return jdbcTemplate.query(sql, new Object[] {},new BeanPropertyRowMapper<domainUser>(domainUser.class));
		}catch(Exception e) {
			logger.error("Exception",e);
		}
		return null;
		
	}

}
