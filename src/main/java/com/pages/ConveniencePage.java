package com.pages;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/*----------------------------------------ConveniencePage ------------------------------*/
public class ConveniencePage 
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public ConveniencePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.ID, using="smsTXTBOX")
	public WebElement TextBox;

	@FindBy(how = How.XPATH, using="//*[@id=\"sendLinkButton\"]")
	public WebElement SendLink;

	//	@FindBy(how = How.ID, using="failure")
	//	public WebElement ErrorMessage;

	@FindBy(how = How.XPATH, using="//*[@id=\"platforms_div\"]/section/div/div[1]/div[1]")
	public WebElement Assertion;


	public void EnterNo(String Number) 
	{
		TextBox.sendKeys(Number);
	}
	public void SendLink() 
	{
		SendLink.click();    
	}
	public void Assertion(String ExpectedMessage) 
	{
		String ActualMessage = Assertion.getText().trim();
		//System.out.println(ActualMessage);
		assertEquals(ActualMessage, ExpectedMessage);
	}
}
