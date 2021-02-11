package com.pages;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.utils.ExplicitWait;
/*----------------------------------------CallBackPage-------------------------------*/
public class CallBackPage
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public CallBackPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.XPATH,using ="//a[contains(text(),'BUS HIRE')]")
	public WebElement busHire;

	@FindBy(how = How.CLASS_NAME, using ="_37v4jd2t38Bgz56yFS_OXA")
	public WebElement CommuteButton;

	@FindBy(how = How.ID, using ="rcommute_request_call_back")
	public WebElement Asseration;

	public void ClickBusHire() 
	{
		ExplicitWait.checkClickableExplicitly(driver,busHire,10);
		busHire.click();
	}
	public void ClickCommute() 
	{
		ExplicitWait.checkClickableExplicitly(driver,CommuteButton,10);
		CommuteButton.click();
	}
	public void Assertion(String ExpectedResult)
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		String ActualResult = Asseration.getText().trim();
		Assert.assertEquals(ActualResult, ExpectedResult);

	}
}
