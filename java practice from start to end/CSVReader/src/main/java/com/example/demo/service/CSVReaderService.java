package com.example.demo.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.CSVModel;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class CSVReaderService {
	public void readColumn() {
		try {
				List<CSVModel> records =
						new CsvToBeanBuilder<CSVModel>(new FileReader("C:\\ECHO_ATTENDENCE_MANAGEMENT_SERVICE\\AttendanceManagementSystem\\MiHub-20230223.csv"))
								.withType(CSVModel.class)
								.withSkipLines(16)
								.withIgnoreLeadingWhiteSpace(true)
								.withSeparator(',')
								.withThrowExceptions(false)
								.build()
								.parse();
				
				
				  for(CSVModel m : records) {
				  System.out.println(m.getDepartmentName()+"		"+m.getEmployeeName()
				  +"		"+m.getEmployeePersonnelId()+
				  "		"+m.getLeaveName()+m.getLeaveType()+"		"
				  +"		"+m.getNumberOfLeaves()+"		"+m.getEndDateOfLeaves()+"		"+m.
				  getStartDateOfLeaves()+"		"+m.getLeaveReason()); }
				  
				  System.out.println(records.size());
				 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
