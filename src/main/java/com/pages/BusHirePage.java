package com.pages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
/*----------------------------------------BusHirePage ---------------------------------*/
public class BusHirePage 
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public BusHirePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.XPATH,using="//*[@id=\"redBus Bus Hire\"]")
	public WebElement BusHire;

	@FindBy(how = How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[1]/div/div/div/div[2]/div[1]/div/img")
	public WebElement ManageBooking;
	
	@FindBy(how = How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[2]")
	public WebElement Cancel_Trip;
 
	@FindBy(how = How.ID,using="Bookid")
	public WebElement Book_Id;
 
	@FindBy(how = How.ID,using="phoneNum")
	public WebElement Phone_Number;

	@FindBy(how = How.ID,using="veribtn")
	public WebElement Verify;
	
	@FindBy(how = How.ID,using="DataErr")
    public WebElement asser;
	
	public void bushire_Data(String Id, String PhoneNumber)
	{
		//Action can be performed on BusHire element
		BusHire.click();
		//Action can be performed on ManageBooking element
		ManageBooking.click();
		//Action can be performed on Cancel_Trip element
		Cancel_Trip.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
		Book_Id.sendKeys(Id);
		Phone_Number.sendKeys(PhoneNumber);
		Verify.click();
		}
	public void Assertion(String ExpectedResult)
    {
        String ActualResult = asser.getText().trim();
        Assert.assertEquals(ActualResult, ExpectedResult);
   
    }
	
}
