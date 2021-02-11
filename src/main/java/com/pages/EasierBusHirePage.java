package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
/*----------------------------------------EasierBusHirePage------------------------------*/
public class EasierBusHirePage 
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public EasierBusHirePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.XPATH,using="//*[@id=\"redBus Bus Hire\"]")
	public WebElement BusHire;

	@FindBy(how=How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[5]/div[1]/div[2]/div/div/div[2]/div/div[1]/div")
	public WebElement Easy_Payment;

	@FindBy(how=How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[5]/div[1]/div[2]/div/div/div[2]/div/div[2]/div")
	public WebElement Easy_Booking;

	@FindBy(how=How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[5]/div[1]/div[2]/div/div/div[2]/div/div[3]/div")
	public WebElement Fare_Transparency;

	@FindBy(how=How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[5]/div[1]/div[2]/div/div/div[1]")
	public WebElement Assertion;


	public void EasierBus_Data()
	{
		BusHire.click();
		Easy_Payment.click();
		Easy_Booking.click();
		Fare_Transparency.click();
	}
	public void Assertion(String ExpectedResult)
	{
		String ActualResult =Assertion.getText().trim();
		Assert.assertEquals(ActualResult, ExpectedResult);

	}
}
