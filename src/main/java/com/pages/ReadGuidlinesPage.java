package com.pages;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
/*----------------------------------------ReadGuidlinesPage------------------------------*/
public class ReadGuidlinesPage
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public ReadGuidlinesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.XPATH,using="//*[@id=\"redBus Bus Hire\"]")
	public WebElement BusHire;

	@FindBy(how = How.XPATH,using="//*[@id=\"reactContentMount\"]/div/div[5]/div[1]/div[6]/div/div/div/div[3]/div/div/div[3]")
	public WebElement Click_ReadGuidlines;

	@FindBy(how = How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div[3]/div/button")
	public WebElement click_Delhi;

	@FindBy(how = How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div[2]")
	public WebElement asseration;

	public void ReadGuid_Data()
	{
		BusHire.click();
		Click_ReadGuidlines.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		click_Delhi.click();
	}
	public void Assertion(String ExpectedResult)
	{
		String ActualResult = asseration.getText().trim();
		Assert.assertEquals(ActualResult, ExpectedResult);

	}
}
