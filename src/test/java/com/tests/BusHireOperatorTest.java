package com.tests;
import java.util.HashMap;
import org.testng.annotations.Test;
import com.log4j.Log4jDemo;
import com.pages.BusHireOperatorPage;
import com.utilsTest.RequiredExecution;
/*************************Create a BusHireOperatorTest class and extends the BaseTest class********/
public class BusHireOperatorTest extends BaseTest
{	
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("BusHireOperatorTestName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet("./ExcelSheetData/Excel_data.xlsx");
	/*-------------------------Create a Bus_Hire_Operator()-----------------*/
	@Test
	public void Bus_Hire_Operator() throws Throwable
	{
		String testName="Bus_Hire_Operator";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		BusHireOperatorPage bhop=new  BusHireOperatorPage (driver);
		Log4jDemo.logge("Create a object as same name of page class");
		extentTest=extent.startTest("Bus_Hire_Operator");
		Log4jDemo.logge("Call the extent value for the report");
		bhop.BusHire();
		Log4jDemo.logge("Call the BusHire");
		bhop.signUp_BusHireOperator(testData.get("CompanyName"),testData.get("OperatorName"),testData.get("CityName"),testData.get("Mobile Number"),testData.get("Alternate Mobile Number"),testData.get("Email ID"),testData.get("Alternate Email ID"),testData.get("Full Address"),testData.get("Enter PAN Number"),testData.get("Enter GSTIN Number"));
		Log4jDemo.logge("Call the signUp_BusHireOperator and access data value frtom the excel sheet");
		bhop.Assertion(testData.get("Expected Result"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
		
	}
}