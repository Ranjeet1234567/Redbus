package com.pages;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
/*----------------------------------------BusHireOperatorPage -------------------------------*/
public class BusHireOperatorPage 
{
	static WebDriver driver;
	public BusHireOperatorPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(how = How.LINK_TEXT, using = "BUS HIRE")
	public WebElement Bushire;
	
	@FindBy(how = How.XPATH, using = "//div[@class='_3VcoR-iRCX0iy6hxaxf6ER']")
	public WebElement scrollElement;

	@FindBy(how = How.XPATH, using = "//div[@class='_254VH5WNgWgjclgRRPngBJ']")
	public WebElement BecomeAnOperator;
	
	@FindBy(how = How.ID, using = "Name")
	public WebElement CompanyName;

	@FindBy(how = How.ID, using = "OperatorName")
	public WebElement operatorName ;

	@FindBy(how = How.ID, using = "City")
	public WebElement City;

	@FindBy(how = How.ID, using = "PrimaryPhNumber")
	public WebElement MobileNumber;

	@FindBy(how = How.ID, using = "AlternatePhNumber")
	public WebElement Alternate_MobileNumber;

	@FindBy(how = How.ID, using = "EmailAddress")
	public WebElement emailid;

	@FindBy(how = How.ID, using = "AlternateEmailAddress")
	public WebElement Alternate_emailId;

	@FindBy(how = How.ID, using = "OperatorAddress")
	public WebElement  FullAddress;

	@FindBy(how = How.ID, using = "PAN")
	public WebElement PAN_Number;

	@FindBy(how = How.ID, using = "GSTIN")
	public WebElement GSTIN_Number;
	
    @FindBy(how = How.XPATH, using = "//div[@id='submitFormDetails']")
	public WebElement Submit_button;
  
    
    @FindBy(how = How.XPATH, using ="//*[@id=\"reactContentMount\"]/div/div[5]/div[1]/div[10]/div/div/div[1]")
   	public WebElement Assertion;
    
	public void BusHire() throws InterruptedException {
		Bushire.click();
		//ExplicitWait(scrollElement);
		 scroll(scrollElement);
	}
	public void scroll(WebElement element)
	{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        // js.executeScript("window.scroll(0,)");
    }
 
	public void signUp_BusHireOperator(String name,String operatorname,String city,String no,String AlternateNo,String email,String alternate_id,String Address,String panNo,String GstinNo) throws InterruptedException{
		String mainWindow = driver.getWindowHandle();
		//ExplicitWait(BecomeAnOperator);
		BecomeAnOperator.click();
		Set<String> handles = driver.getWindowHandles();
		for(String childWindow : handles) {
			if(!childWindow.equals(mainWindow)) {
				driver.switchTo().window(childWindow);
				CompanyName.sendKeys(name);
				operatorName.sendKeys(name);
				City.sendKeys(city);
				MobileNumber.sendKeys(no);
				Alternate_MobileNumber.sendKeys(AlternateNo);
				emailid.sendKeys(email);
				Alternate_emailId.sendKeys(alternate_id);
				FullAddress.sendKeys(Address);
				PAN_Number.sendKeys(panNo);
				GSTIN_Number.sendKeys(GstinNo);
				Submit_button.click();
			}
		}
		driver.switchTo().window(mainWindow);
	}
	public void Assertion(String ExpectedResult)
    {
        String ActualResult = Assertion.getText().trim();
        Assert.assertEquals(ActualResult, ExpectedResult);
   
    }

}
