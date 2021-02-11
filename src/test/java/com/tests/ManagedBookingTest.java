package com.tests;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.log4j.Log4jDemo;
import com.pages.ManagedBookingPage;
import com.utilsTest.RequiredExecution;
/*-------------------------------ManagedBookingTest----------------------------*/
//Using extends keyword to access the properties from the BaseTest Class
public class ManagedBookingTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("ManagementBookingSheetName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	//Create a static object with same name of page class
	static  ManagedBookingPage bp;
	/*-------------------------Create a Invalid_Cancel()-----------------------------*/
	@Test
	public void Invalid_Cancel() throws Throwable
	{
		String testName="Invalid_Cancel";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		extentTest=extent.startTest("Invalid_Cancel");
		Log4jDemo.logge("Call the extent value for the report");
		bp=new ManagedBookingPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		//call the all method from the page class of ManagedBookingPage
		bp.Manage_Booking();
		Log4jDemo.logge("Call the Manage_Booking");
		bp.Cancel_Booking(testData.get("TicketNumber"),testData.get("EmailId"));
		Log4jDemo.logge("Call the Cancel_Booking and access data from the excel sheet");
		String title = driver.getTitle();
		Log4jDemo.logge("Create a variable to access the title of given page");
		System.out.println(title);
		Log4jDemo.logge("Print the title od page");
		Assert.assertEquals(title,testData.get("Expected Tittle"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
	/*-------------------------Create a Invalid_ReSchedule()---------------------------*/	
	@Test
	public void Invalid_ReSchedule() throws Throwable
	{
		String testName="Invalid_ReSchedule";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		extentTest=extent.startTest("Invalid_ReSchedule");
		Log4jDemo.logge("Call the extent value for the report");
		bp=new ManagedBookingPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		//call the all method from the page class of ManagedBookingPage
		bp.Manage_Booking();
		Log4jDemo.logge("Call the Manage_Booking");
		System.out.println("TicketNumber : "+testData.get("TicketNumber")+"EmailID : "+testData.get("EmailId"));
		bp.Reschedule(testData.get("TicketNumber"),testData.get("EmailId"));
		Log4jDemo.logge("Call the Cancel_Booking and access data from the excel"); 
		String title = driver.getTitle();
		Log4jDemo.logge("Print the title od page");
		System.out.println(title);
		Assert.assertEquals(title,testData.get("Expected Tittle"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
	/*-------------------------Create a Invalid_Show_MyTicket() ---------------------------*/	
	@Test
	public void Invalid_Show_MyTicket() throws Throwable
	{
		String testName="Invalid_Show_MyTicket";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		extentTest=extent.startTest("Invalid_Show_MyTicket");
		Log4jDemo.logge("Call the extent value for the report");
		bp=new ManagedBookingPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		//call the all method from the page class of ManagedBookingPage
		bp.Manage_Booking();
		Log4jDemo.logge("Call the Manage_Booking");
		bp.Show_Ticket(); 
		Log4jDemo.logge("Call the Show_Ticke");
		bp.Show_My_Ticket(testData.get("TicketNumber"),testData.get("EmailId"));
		Log4jDemo.logge("Call the Cancel_Booking and access data from the excel");
		String title = driver.getTitle();
		Log4jDemo.logge("Print the title od page");
		System.out.println(title);
		Assert.assertEquals(title,title,testData.get("Expected Tittle"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
	/*-------------------------Create a Invalid_Email_SMS()-------------------------*/	
	@Test
	public void Invalid_Email_SMS() throws Throwable
	{
		String testName="Invalid_Email_SMS";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Read the data from the excel sheet");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Invalid_Email_SMS");
		Log4jDemo.logge("Call the extent value for the report");
		bp=new ManagedBookingPage(driver);
		Log4jDemo.logge("Create a object as same name of page class");
		//call the all method from the page class of ManagedBookingPage
		bp.Manage_Booking();
		Log4jDemo.logge("Call the Manage_Booking");
		bp.Click_Email();
		Log4jDemo.logge("Call the Manage_Booking");
		bp.Show_My_Ticket(testData.get("TicketNumber"),testData.get("EmailId"));
		Log4jDemo.logge("Call the Cancel_Booking and access data from the excel");
		String title = driver.getTitle();
		Log4jDemo.logge("Print the title od page");
		System.out.println(title);
		Assert.assertEquals(title,title,testData.get("Expected Tittle"));
		Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
	}
}
