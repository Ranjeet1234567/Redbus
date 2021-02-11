package com.tests;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.log4j.Log4jDemo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.Screen_Shots;
/*--------------------------------------------BaseTest-------------------------------*/
public class BaseTest 
{
	/****************Initialize the driver as public and static*************************/ 
	public static WebDriver driver;
	/****************Initialize the extent as public and static*************************/ 
	public static ExtentReports extent;
	/****************Initialize the extentTest as public and static*************************/ 
	public static ExtentTest extentTest;
	/******************Create a  file and give the path of properties file*********************/ 
	static File file = new File(
			"./Properties/configuration.properties");
	static FileInputStream fis = null;
	/****************Create a static object*****************************/
	static Properties prop = new Properties();
	static
	{
		/***********Using the try and catch block**********************************/
		try 
		{
			fis = new FileInputStream(file);

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try
		{
			prop.load(fis);

		} 
		catch (IOException el) 
		{
			el.printStackTrace();
		}
	}
	/***************Driver Initilization inside the BeforeMethod *******************************************/
	@BeforeMethod
	public void driverInitialize() throws Throwable 
	{
		/************** Access the browsername from the properties file**************/
		String browser = prop.getProperty("BrowserName");
		Log4jDemo.logge("Give the name of the browser from the properties file");
		/***************************CHROME BROWSER******************************/
		if (browser.toLowerCase().equals("chrome")) 
		{
			/************** Access the driverpath from the properties file**************/
			System.setProperty("webdriver.chrome.driver",prop.getProperty("driverPath"));
			Log4jDemo.logge("Access the path of driver from the properties file");
			/************** Access the Type of Mode from the properties file**************/
			String browserType =prop.getProperty("Mode");
			Log4jDemo.logge("Access the operation mode from the properties file");
			if (browserType.toLowerCase().equals("headless"))
			{
				ChromeOptions options = new ChromeOptions();
				options.addArguments("window-size=1920,1080");
				options.addArguments("headless");
				options.addArguments("user-agent=Chrome/88.0.4324.150");
				driver = new ChromeDriver(options);
				Log4jDemo.logge("create a object of driver");
				driver.manage().window().maximize();
				/************** Access the url from the properties file**************/
				driver.get(prop.getProperty("url"));
				Log4jDemo.logge("Access the path of url from the properties file");
			}
			else 
			{
				driver = new ChromeDriver();
				Log4jDemo.logge("Create a object of driver");
				driver.manage().window().maximize();
				/************** Access the url from the properties file**************/
				driver.get(prop.getProperty("url"));
				Log4jDemo.logge("Access the path of url from the properties file");
			}
		}
		/**********************INTERNET EXPLORER BROWSER******************************/
		else if (browser.toLowerCase() == "ie") 
		{
			/***************Access the path of INTERNET EXPLORER BROWSER from  the properties file***************/
			System.setProperty("webdriver.gecko.driver",prop.getProperty("driverpath2"));
			Log4jDemo.logge("Access the path of driver from the properties file");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			/************** Access the url from the properties file**************/
			driver.navigate().to(prop.getProperty("url"));
			Log4jDemo.logge("Access the path of url from the properties file");
		}
		/**********************Firefox BROWSER******************************/
		else if (browser.toLowerCase().equals("firefox"))
		{
			/***************Access the path of firefox from  the properties file***************/
			System.setProperty("webdriver.gecko.driver", prop.getProperty("driverpath1"));
			Log4jDemo.logge("Access the path of driver from the properties file");
			if (browser.toLowerCase() =="headless")
			{				
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				URL url = new URL("http://localhost:4444/wd/hub");
				RemoteWebDriver driver = new RemoteWebDriver(url,dc);
				driver.manage().window().maximize();
				Log4jDemo.logge("Call this method to maximize the browser");
				driver.get(prop.getProperty("url"));
				Log4jDemo.logge("Access the path of url from the properties file");
				FirefoxOptions options = new FirefoxOptions();
				options.setHeadless(true);
				Log4jDemo.logge("Check the type of mode true or false");
				driver = new FirefoxDriver(options);
				driver.manage().window().maximize();
				Log4jDemo.logge("Call this method to maximize the browser");
				driver.get(prop.getProperty("url"));
				Log4jDemo.logge("Access the path of url from the properties file");
			} 
			else 
			{
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
				Log4jDemo.logge("Access the path of url from the properties file");
			}
		} 
		else 
		{
			System.out.println("Incompatible Browser Selection");
			Log4jDemo.logge("Print the value when any browser not used");
		}
		/********************************Call the implicitly wait from the excel file***************/
		int wait = Integer.parseInt(prop.getProperty("ImplicitWait"));
		Log4jDemo.logge("Give the value of wait from the properties file");
		/*****************Call this method to manage the driver *****************/
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	/********************This Code is use For Extent Reporting*************************/
	@BeforeTest
	public void setExtent() 
	{
		extent = new ExtentReports(System.getProperty("user.dir") + prop.getProperty("reportpath"), true);
		Log4jDemo.logge("Access the path of report from the properties file");
		extent.addSystemInfo("Host Name", "ranjeetverma");
		extent.addSystemInfo("User Name", "Ranjeet Verma");
		extent.addSystemInfo("Environment", "Automation Testing");
	}
	/********************This code is use AfterTest******************************/
	@AfterTest
	public void endReport() 
	{
		extent.flush();
		Log4jDemo.logge("This method use to flush the extent value");
		extent.close();
		Log4jDemo.logge("This is call to close the extent");
	}
	/********************This code is use AfterMethod******************************/
	@AfterMethod
	public static void closeBrowser(ITestResult result) throws IOException
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			/********************to add name in extent report************************/
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName()); 
			/*********************To add error/exception ****************************/
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());	
			// extent report
			String screenshotPath = Screen_Shots.getScreenshot(driver, result.getName());
			/******************************** To add screenshot in extent*****************/	
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); 																					

		} 
		/********************This is execute when Status fail***********************/
		else if (result.getStatus() == ITestResult.SKIP) 
		{
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		} 
		/********************This is execute when Status Success***********************/
		else if (result.getStatus() == ITestResult.SUCCESS) 
		{
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
		}
		/*****Ending test and ends the current test and prepare to create html report***********/
		extent.endTest(extentTest); 
		/********************call the driver quit method********************/
		driver.quit();
		Log4jDemo.logge("This method is used to close the driver");
	}
}




