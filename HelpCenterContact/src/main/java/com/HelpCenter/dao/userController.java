package com.HelpCenter.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.HelpCenter.Model.domainModel;
import com.HelpCenter.Model.userModel;
import com.HelpCenter.Service.userService;
import com.HelpCenter.response.Response;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("v1") 
public class userController {

	private static final Logger logger = LoggerFactory.getLogger(userController.class);
	
	@Autowired
	userService userService;
	
	@PostMapping(value = "/create")
	public Response adduser(@RequestBody userModel userModel1, HttpServletRequest request)
			throws Exception {
		logger.info("adduser: Received request URL:" + request.getRequestURL().toString()
				+ ((request.getQueryString() == null) ? "" : "?" + request.getQueryString().toString()));

		return userService.adduser(userModel1);
	}
	@GetMapping(value="/User")
	public @ResponseBody List<domainModel> getUser(HttpServletRequest request)throws Exception{
		logger.info("getUser:Recived Request:"+request.getRequestURL().toString()
				+((request.getQueryString()==null)? "": "?"  + request.getQueryString().toString()) );
		
		return userService.getUser();
		
		
		
	}

}
