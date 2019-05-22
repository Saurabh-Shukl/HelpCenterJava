package com.HelpCenter.Service;

import java.util.List;

import com.HelpCenter.Model.domainModel;
import com.HelpCenter.Model.userModel;
import com.HelpCenter.response.Response;

public interface userService {

	
	
	public Response adduser(userModel item) throws Exception;
	
	public List<domainModel> getUser();
}
