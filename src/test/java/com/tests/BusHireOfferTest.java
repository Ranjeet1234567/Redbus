package com.tests;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.log4j.Log4jDemo;
import com.pages.BusHireOfferPage;
import com.utilsTest.RequiredExecution;
	/*---------------------------------BusHireOfferTest---------------------------------*/
	//Using extends keyword to access the properties from the BaseTest Class
	public class BusHireOfferTest extends BaseTest
	{
		//Create a variable as name of sheetname and access the sheetname from the peopertuies file
		private String sheetName=prop.getProperty("BusHireOfferTestName");
		//Create a variable as name of reader and access the  from the peopertuies file
		ReadExcelSheet reader=new ReadExcelSheet(prop.getProperty("ExcelSheetPath"));
		/*-------------------------Create a BusHire _Offerpage()-----------------*/	
		@Test
		public void BusHire_Offer()
		{
			String testName="BusHire_Offer";
			Log4jDemo.logge("Creating a variable as TestName");
			HashMap<String,String>testData=new HashMap<String,String>();
			Log4jDemo.logge("Create a HashMap for the access the data row and column from  excel file");
			testData=reader.getRowTestData(sheetName,testName);	 
			Log4jDemo.logge("Read the data from the excel sheet");
			RequiredExecution.tocheckExecutionRequired(testData.get("Execution"),testName);
			Log4jDemo.logge("Read the value of execution from the excel sheet");
			BusHireOfferPage bop=new BusHireOfferPage(driver);
			Log4jDemo.logge("Create a object as same name of page class");
			extentTest=extent.startTest("BusHire_Offer");
			Log4jDemo.logge("Call the extent value for the report");
			//Call the BusHireOffer_Data method to access the data
			bop.BusHireOffer_Data();
			Log4jDemo.logge("Call the BusHireOffer_Data");
			//Use the Asseration
			bop.Assertion(testData.get("Expected Result"));
			Log4jDemo.logge("Call the Assertion method and get the data from the excel sheet");
			
		}
}
