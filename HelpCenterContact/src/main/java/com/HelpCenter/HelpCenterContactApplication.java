package com.HelpCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.HelpCenter.dao.userController;

@SpringBootApplication
public class HelpCenterContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpCenterContactApplication.class, args);
	}

}
