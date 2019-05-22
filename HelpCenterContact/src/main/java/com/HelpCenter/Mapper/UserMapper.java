package com.HelpCenter.Mapper;

import org.springframework.stereotype.Component;

import com.HelpCenter.Model.userModel;
import com.HelpCenter.domain.userDomain;



@Component
public class UserMapper extends AbstractModelMapper<userModel,userDomain>{
	
	@Override
	public Class<userModel> entityType(){
		return userModel.class;
	}
   @Override 
   public Class<userDomain> modelType()
   {
	   return userDomain.class;
   }
}
