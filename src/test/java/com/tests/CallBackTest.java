package com.tests;
import java.util.HashMap;
import org.testng.annotations.Test;
import com.log4j.Log4jDemo;
import com.pages.CallBackPage;
import com.utilsTest.RequiredExecution;
/*************************Create a CallBackTest class and extends the BaseTest class********/
public class CallBackTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("CallBackTestName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	/********************************Create Call_BackTest()****************************/
	@Test
	public void Call_BackTest()
	{
		String testName="Call_BackTest";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Call_BackTest");
		CallBackPage cbp=new CallBackPage(driver);
		Log4jDemo.logge("Create a object as same name of Class Page");
		cbp.ClickBusHire();	
		Log4jDemo.logge("Call the ClickBusHire method");
		cbp.ClickCommute();
		Log4jDemo.logge("Call the ClickCommute method");
		cbp.Assertion(testData.get("Expected Result"));
		Log4jDemo.logge("Call the asseration method");	
	}
}
