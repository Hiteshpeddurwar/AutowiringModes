package com.BikkadIT.AutoWiringModes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.AutoWiringModes.Service.ReportServiceImpl;

@SpringBootApplication
public class AutoWiringModesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutoWiringModesApplication.class, args);
		
		ReportServiceImpl bean = context.getBean(ReportServiceImpl.class);
		bean.gernerateReport();
	}

}
