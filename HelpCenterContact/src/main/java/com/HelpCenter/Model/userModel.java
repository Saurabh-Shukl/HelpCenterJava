package com.HelpCenter.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class userModel {
	private String name;
	private String email;
	private String description;
	private String domain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	

}
