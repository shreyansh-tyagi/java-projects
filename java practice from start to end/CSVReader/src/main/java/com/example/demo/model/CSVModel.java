package com.example.demo.model;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CSVModel {
	@CsvBindByName(column = "Reporting Unit", required = true)
	private String departmentName;
	
	@CsvBindByName(column = "Employee Name", required = true)
	private String employeeName;
	
	@CsvBindByName(column = "Reference No", required = true)
	private String employeePersonnelId;
	
	@CsvBindByName(column = "Days Lost", required = true)
	private double numberOfLeaves;
	
	
	  @CsvBindByName(column = "Absent From", required = true) 
	  private String startDateOfLeaves;
	  
	  @CsvBindByName(column = "Absent To", required = true) 
	  private String endDateOfLeaves;
	 
	
	@CsvBindByName(column = "Absence Group", required = true)
	private String leaveName;
	
	@CsvBindByName(column = "Absence Type", required = true)
	private String leaveType;
	
	  @CsvBindByName(column = "Absence Reason")
	  private String leaveReason;
	 
}
