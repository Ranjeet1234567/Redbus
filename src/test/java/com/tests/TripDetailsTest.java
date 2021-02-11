package com.tests;
import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.log4j.Log4jDemo;
import com.pages.TripDetailsPage;
import com.utilsTest.RequiredExecution;
/*************************Create a TripDetailsTest class and extends the BaseTest class********/
public class TripDetailsTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("TripDetailSheetName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	//Create a variable as static for calling
	static TripDetailsPage tdp;
	/********************************Create Trip_Details()****************************/
	@Test
	public void Trip_Details()throws Throwable
	{
		String testName="Trip_Details";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName); 
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Trip_Details");
		Log4jDemo.logge("Call the extent value for the report");
		tdp=new TripDetailsPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		Thread.sleep(30000);
		tdp.Trip_Details(testData.get("From"),testData.get("To"));
		Log4jDemo.logge("Call the Trip_Details and access the data from the excel sheet");
		tdp.SelectDate(testData.get("Year"),testData.get("Date"));
		Log4jDemo.logge("Call the SelectDate and access the data from the excel sheet");
		//Call the Search method to access the data
		tdp.Search();
		Log4jDemo.logge("Call the Search");
		//Call the Sortbus method to access the data
		tdp.Sortbus();
		Log4jDemo.logge("Call the Sortbus");
		//Find the title of the page that use
		String title = driver.getTitle();
		//Use the Asseration
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}

}