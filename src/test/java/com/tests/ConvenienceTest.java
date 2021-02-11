package com.tests;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.log4j.Log4jDemo;
import com.pages.ConveniencePage;
import com.utilsTest.RequiredExecution;
public class ConvenienceTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("ConvenienceTestName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	/********************************Create Convenience_Test()****************************/
	@Test
	public void Convenience_Test()
	{
		String testName="Convenience_Test";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Convenience_Test");
		Log4jDemo.logge("Call the extent value for the report");
		ConveniencePage cp=new ConveniencePage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		cp.EnterNo(testData.get("Enter Number"));
		Log4jDemo.logge("Call the Enter and access data from the excel sheet");
		cp.SendLink();
		Log4jDemo.logge("Call the SendLink method");
		cp.Assertion(testData.get("Expected Result"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
}
