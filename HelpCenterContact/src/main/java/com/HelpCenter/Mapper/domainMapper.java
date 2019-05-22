package com.HelpCenter.Mapper;

import org.springframework.stereotype.Component;

import com.HelpCenter.Model.domainModel;
import com.HelpCenter.domain.domainUser;

@Component
public class domainMapper extends AbstractModelMapper<domainModel,domainUser> {

	@Override
	public Class<domainModel> entityType(){
		return domainModel.class;
	}
   @Override 
   public Class<domainUser> modelType()
   {
	   return domainUser.class;
   }
	
}
