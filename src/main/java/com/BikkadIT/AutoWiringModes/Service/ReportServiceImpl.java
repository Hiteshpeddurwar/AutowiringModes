package com.BikkadIT.AutoWiringModes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.BikkadIT.AutoWiringModes.Dao.OracleReportDaoImpl;
import com.BikkadIT.AutoWiringModes.Dao.ReportDaoI;


@Service
public class ReportServiceImpl {

	@Autowired
	@Qualifier("oracleReportDaoImpl") // Using qualifier annotation
private ReportDaoI reportDaoI;
	
	
	public void gernerateReport() {
		
		reportDaoI.generateReport();
		
	}
	
	
}
