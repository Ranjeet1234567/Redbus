package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
/************************************************RpoolPage*****************************/
public class RpoolPage 
{
	WebDriver driver;
	public RpoolPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(how = How.ID,using="cars")
	public WebElement Rpool_New;

	@FindBy(how = How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div/div[3]/div/div[1]")
	public WebElement Howit_Work;

	@FindBy(how = How.XPATH,using="//*[@id=\"howItWorks\"]/div/div/div[1]/span[2]")
	public WebElement Offerride;

	@FindBy(how = How.XPATH,using="//*[@id=\"howItWorks\"]/div/div/div[2]/div[1]/div[1]/div[2]")
	public WebElement Activate_Account;

	@FindBy(how = How.XPATH,using="//*[@id=\"howItWorks\"]/div/div/div[2]/div[1]/div[2]")
	public WebElement Request_A_ride;

	@FindBy(how = How.XPATH,using="//*[@id=\"howItWorks\"]/div/div/div[2]/div[1]/div[3]")
	public WebElement Choosegfrom_Ride;

	@FindBy(how = How.XPATH,using="//*[@id=\"howItWorks\"]/div/div/div[2]/div[1]/div[4]")
	public WebElement Pay_Point;

	@FindBy(how=How.LINK_TEXT,using="What is rPool")
	public WebElement What_rpool;

	@FindBy(how=How.LINK_TEXT ,using="Corporate+")
	public WebElement Corporate;


	@FindBy(how=How.LINK_TEXT ,using="Why rPool")
	public WebElement Why_rPool;

	@FindBy(how=How.LINK_TEXT ,using="rPool for RWAs")
	public WebElement rPool_RWAs;

	@FindBy(how=How.LINK_TEXT ,using="Customer Review")
	public WebElement Customer_Review;

	@FindBy(how=How.LINK_TEXT ,using="FAQs")
	public WebElement FAQs;

	@FindBy(how=How.XPATH ,using="//*[@id=\"howItWorks\"]/div/div/h2")
	public WebElement asser;

	@FindBy(how=How.XPATH ,using="//*[@id=\"faqs\"]/div/h2")
	public WebElement asseration;
	
	public void Rpool_NewPage() throws InterruptedException 
	{
		Rpool_New.click();
		Howit_Work.click();
		Offerride.click();
		Activate_Account.click();
		Request_A_ride.click();
		Choosegfrom_Ride.click();
		Pay_Point.click();
	}
	public void Assertion(String ExpectedResult)
	{
		String ActualResult = asser.getText().trim();
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	public void RpoolInfromation() throws InterruptedException
	{
		Rpool_New.click();
		What_rpool.click();
		Corporate.click();
		Why_rPool.click();
		rPool_RWAs.click();
		Customer_Review.click();
		FAQs.click();
	}
	public void Assertion1(String ExpectedResult)
	{
		String ActualResult = asseration.getText().trim();
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
}
