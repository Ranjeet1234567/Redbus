package com.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.log4j.Log4jDemo;
import com.pages.ReadGuidlinesPage;
import com.utilsTest.RequiredExecution;
/*************************Create a ReadGuidlinesTest class and extends the BaseTest class********/
public class ReadGuidlinesTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("ReadGuidlinesTestName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	@Test
	public void Read_Guidlines()
	{
		String testName="Read_Guidlines";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Read_Guidlines");
		Log4jDemo.logge("Call the extent value for the report");
		ReadGuidlinesPage rgp=new ReadGuidlinesPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		rgp.ReadGuid_Data();
		Log4jDemo.logge("Call the ReadGuid_Data");
		rgp.Assertion(testData.get("Expected Result"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");

	}
}
