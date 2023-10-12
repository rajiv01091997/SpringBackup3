package com.globallogic;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class EmployeeDepartmentApplication {
//	@Bean
//    public ModelMapper mapping()
//	{
//		return new ModelMapper();
//	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDepartmentApplication.class, args);
	}

}
