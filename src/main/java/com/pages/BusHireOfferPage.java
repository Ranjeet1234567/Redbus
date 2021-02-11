package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
/*----------------------------------------BusHireOfferPage -------------------------------*/
public class BusHireOfferPage 
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public BusHireOfferPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.XPATH,using="//*[@id=\"redBus Bus Hire\"]")
	public WebElement BusHire;
	
	@FindBy(how = How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[1]/div/div/div/div[2]/div[2]/div/img[2]")
	public WebElement Signin;
	
	@FindBy(how = How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]")
	public WebElement Offer;

	@FindBy(how = How.XPATH,using="//*[@id=\"app\"]/div/div[1]/span")
	public WebElement Asseration;

	public void BusHireOffer_Data()
	{
		//Action can be performed on BusHire element
		BusHire.click();
		//Action can be performed on Signin element
	      Signin.click();
	    //Action can be performed on Signin element
	      Offer.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
				
	}
	public void Assertion(String ExpectedResult)
	{
		String ActualResult = Asseration.getText().trim();
		Assert.assertEquals(ActualResult, ExpectedResult);

	}
}
