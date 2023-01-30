package com.BikkadIT.AutoWiringModes.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary // BYTYPE
public class OracleReportDaoImpl implements ReportDaoI  {

	@Override
	public void generateReport() {
		System.out.println("Report generations using Oracle");
		
	}

}
