package com.tests;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import com.log4j.Log4jDemo;
import com.pages.BusHirePage;
import com.utilsTest.RequiredExecution;
/*---------------------------------BusHireTest---------------------------------*/
//Using extends keyword to access the properties from the BaseTest Class
public class BusHireTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("InvalidCancellationTestName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	//Create a static object with same name of page class
	static BusHirePage bp;
	/*-------------------------Create a Invalid_Cancellation()-----------------*/	
	@Test
	public void Invalid_Cancellation() throws Throwable
	{
		String testName="Invalid_Cancellation";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Invalid_Cancellation");
		Log4jDemo.logge("Call the extent value for the report");
		bp=new BusHirePage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		bp.bushire_Data(testData.get("TicketNumber"),testData.get("MobileNumber"));
		Log4jDemo.logge("Call the bushire_Data and access data from the excel sheet");
		bp.Assertion(testData.get("Expected Result"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
}


