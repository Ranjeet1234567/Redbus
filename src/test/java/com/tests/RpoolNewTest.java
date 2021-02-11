package com.tests;
import java.util.HashMap;
import org.testng.annotations.Test;
import com.log4j.Log4jDemo;
import com.pages.RpoolPage;
import com.utilsTest.RequiredExecution;
/*************************Create a RpoolNewTest class and extends the BaseTest class********/
public class RpoolNewTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("RpoolNewTestName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	static RpoolPage rp;
	@Test
	public void Rpool_New() throws Throwable
	{
		String testName="Rpool_New";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		Log4jDemo.logge("Create a object as same name of page class");
		extentTest=extent.startTest("Rpool_New");
		Log4jDemo.logge("Read the data from the excel sheet");
		rp=new RpoolPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		rp.Rpool_NewPage();
		Log4jDemo.logge("Call the Rpool_NewPage");
		rp.Assertion(testData.get("Expected Result"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
	@Test
	public void Rpool_Information() throws Throwable
	{
		String testName="Rpool_Information";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Rpool_Information");
		Log4jDemo.logge("Read the data from the excel sheet");
		rp=new RpoolPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		rp.RpoolInfromation();
		Log4jDemo.logge("Call the RpoolInfromation");
		rp.Assertion1(testData.get("Expected Result"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
}
