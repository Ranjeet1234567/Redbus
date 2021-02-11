package com.tests;
import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.log4j.Log4jDemo;
import com.pages.SigninPage;
import com.utilsTest.RequiredExecution;
/*---------------------------------SigninTest---------------------------------*/
//Using extends keyword to access the properties from the BaseTest Class
public class SigninTest extends BaseTest
{
	//Create a variable as name of sheetname and access the sheetname from the peopertuies file
	private String sheetName=prop.getProperty("SigninpageSheetName");
	//Create a variable as name of reader and access the  from the peopertuies file
	ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
	//Create a static object with same name of page class
	static SigninPage signinpage;
	/*-------------------------Create a Valid_Signin_Page ()-----------------*/
	@Test

	public void Valid_Signin_Page() throws Throwable
	{
		String testName="Vaild_SigninPage";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		extentTest=extent.startTest("Valid_Signin_Page");
		Log4jDemo.logge("Call the extentTest for Valid_Signin_Page");
		Thread.sleep(3000);
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Click_close method");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}
	/*-------------------------Create a Invalid_Signin_Page()-----------------*/
	@Test
	public void Invalid_Signin_Page() throws Throwable
	{
		String testName="Invalid_Signin_Page";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"), testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		extentTest=extent.startTest("Invalid_Signin_Page");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Signin method");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}
	/*-------------------------Create a Valid_Update_Profile()-----------------*/
	@Test
	public void Valid_Update_Profile() throws Throwable
	{
		String testName="Valid_Update_Profile";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		extentTest=extent.startTest("Valid_Update_Profile");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Click_close method");
		//call the all method from the page class of SigninPage
		Thread.sleep(2000);
		signinpage.Clicksignin();
		signinpage.Update_Profile(testData.get("UpdateName"),testData.get("UpdateMobileNum"));
		Log4jDemo.logge("Call the SwitchTabs method and get the Updatedata from the excel sheet");

		String title=driver.getTitle();
		//Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		//Log4jDemo.logge("Get the data from the Excel sheet");
	}
	/*-------------------------Create a Invalid_Update_Profile()-----------------*/
	@Test
	public void Invalid_Update_Profile() throws Throwable
	{
		String testName="InValid_Update_Profile";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		extentTest=extent.startTest("Invalid_Update_Profile");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Click_close method");
		//call the all method from the page class of SigninPage
		signinpage.Update_Profile(testData.get("UpdateName"),testData.get("UpdateMobileNum"));
		Log4jDemo.logge("Call the SwitchTabs method and get the Updatedata from the excel sheet");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}

	/*-------------------------Create a Sign_Out()-----------------*/
	@Test
	public void Sign_Out()throws Throwable
	{
		String testName="Sign_Out";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Sign_Out");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Click_close method");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Sign_out();
		Log4jDemo.logge("Call the Sign_out method");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}
	/*-------------------------Create a Sign_Out_All_Device()-----------------*/
	@Test
	public void Sign_Out_All_Device()  throws Throwable
	{
		String testName="Sign_Out_All_Device";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Sign_Out_All_Device");
		Log4jDemo.logge("Creating a new object as same name of class");
		signinpage=new SigninPage(driver);
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Click_close method");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Sign_out_all();
		Log4jDemo.logge("Call the Sign_out_all method");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}
	/*-------------------------Create a My_Trip()--------------------------------*/
	@Test
	public void My_Trip() throws Throwable
	{
		String testName="My_Trip";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("My_Trip");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Click_close method");
		//call the all method from the page class of SigninPage
		signinpage.Mytrips();
		Log4jDemo.logge("Call the Mytrips method");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}
	/*-------------------------Create a My_Wallets()--------------------------------*/
	@Test
	public void My_Wallets() throws Throwable
	{
		String testName="My_Wallets";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("My_Wallets");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		Log4jDemo.logge("Call the SwitchTabs method and get the data from the excel sheet");
		signinpage.Click_close();
		Log4jDemo.logge("Call the Click_close method");
		//call the all method from the page class of SigninPage
		signinpage.MyWallets();
		Log4jDemo.logge("Call the MyWallets method");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}
	/*-------------------------Create a Wallets()--------------------------------*/
	@Test
	public void Wallets() throws Throwable
	{
		String testName="Wallets";
		Log4jDemo.logge("Creating a variable as TestName");
		HashMap<String,String>testData=new HashMap<String,String>();
		Log4jDemo.logge("Creating a HasMap to store data");
		testData=reader.getRowTestData(sheetName,testName);
		Log4jDemo.logge("Call the reader excel file to access the sheetname and testName");
		RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
		Log4jDemo.logge("Read the value of execution from the excel sheet");
		extentTest=extent.startTest("Wallets");
		signinpage=new SigninPage(driver);
		Log4jDemo.logge("Creating a new object as same name of class");
		//call the all method from the page class of SigninPage
		signinpage.Clicksignin();
		Log4jDemo.logge("Call the Clicksignin method");
		signinpage.Signin();
		Log4jDemo.logge("Call the Signin method");
		signinpage.SwitchTabs(testData.get("EmailId"),testData.get("Password"));
		signinpage.Click_close();
		Log4jDemo.logge("Call the Signin method");
		//call the all method from the page class of SigninPage
		signinpage.Wallets();
		Log4jDemo.logge("Call the Wallets method");
		String title=driver.getTitle();
		Log4jDemo.logge("Create a title variable to get the title of page for asseration");
		Assert.assertEquals(title,testData.get("Expected Title"));
		Log4jDemo.logge("Get the data from the Excel sheet");
	}
}