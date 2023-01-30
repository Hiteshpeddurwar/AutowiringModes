package com.BikkadIT.AutoWiringModes.Dao;

import org.springframework.stereotype.Repository;

// @Repository("reportDaoI") // BYNAME
@Repository
public class MySqlReportDaoImpl implements ReportDaoI {

	@Override
	public void generateReport() {
		System.out.println("Report generations using MySQL");
	}

}
