package com.pages;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utils.ExplicitWait;
/*----------------------------------------SigninPage-------------------------------*/
public class SigninPage 
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public SigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.ID,using="i-icon-profile")
	public WebElement ClickSignin;

	@FindBy(how = How.ID,using="signInLink")
	public WebElement Signin;

	@FindBy(how = How.CLASS_NAME, using = "modalIframe")
	public WebElement frame;

	@FindBy(how = How.ID, using = "newFbId")
	public WebElement facebook_button;

	@FindBy(how = How.ID, using = "email")
	public WebElement facebook_ValidphoneNo;

	@FindBy(how = How.ID, using ="pass")
	public WebElement facebook_password;

	@FindBy(how = How.ID, using ="loginbutton")
	public WebElement LogIn_button;

	@FindBy(how = How.XPATH, using ="//i[@class= 'icon-close']")
	public WebElement close;

	@FindBy(how = How.ID, using ="hc")
	public WebElement Profile_Element;

	@FindBy(how = How.ID, using ="Editbtn")
	public WebElement Edit_Element;

	@FindBy(how = How.ID, using ="profile-displayName")
	public WebElement Name_Element;

	@FindBy(how = How.ID, using ="male")
	public WebElement Select_gender;

	@FindBy(how = How.ID, using ="profile-mobile")
	public WebElement Enter_mobile;

	@FindBy(how = How.ID, using ="Savebtn")
	public WebElement Click_save;

	@FindBy(how=How.XPATH,using="//*[@id=\"profiledetails\"]/div[2]/div[3]/div/div[4]/span[2]")
	public WebElement Icon_close;

	@FindBy(how=How.ID,using="signOutLink")
	public WebElement Sign_Out;

	@FindBy(how=How.ID,using="signOutAllLink")
	public WebElement Sign_Out_All_Device;

	@FindBy(how=How.XPATH,using="//*[@id=\"hc\"]/ul/li[1]")
	public WebElement My_Trip;

	@FindBy(how=How.XPATH,using="//*[@id=\"hc\"]/ul/li[2]")
	public WebElement My_Wallets;

	@FindBy(how=How.XPATH,using="//*[@id=\"hc\"]/ul/li[4]")
	public WebElement Wallets;

	
	/*-------------------------------Create a method for Switch tabs---------------------------*/   
	public void SwitchTabs(String PhoneNo,String pass) throws InterruptedException
	{	
		//Action can be performed on frame element
		driver.switchTo().frame(frame);
		//Handle the current window
		String mainWindow = driver.getWindowHandle();
		//Action can be performed on facebook_button element
		facebook_button.click();
		//A set of window handles which can be used to iterate over all open windows.
		Set<String> handles = driver.getWindowHandles();
		//Use the loop  condition
		for (String childWindow : handles) {
			if (!childWindow.equals(mainWindow)) {
				driver.switchTo().window(childWindow);
				//Action can be performed on facebook_ValidphoneNo element
				ExplicitWait.checkClickableExplicitly(driver,facebook_ValidphoneNo,10);
				facebook_ValidphoneNo.sendKeys(PhoneNo);
				//Action can be performed on facebook_password element
				ExplicitWait.checkClickableExplicitly(driver,facebook_password,10);
				facebook_password.sendKeys(pass);
				//Action can be performed on LogIn_button element
				LogIn_button.click();
			}
			Thread.sleep(2900);			
		}
		//Switch to mainwindow
		driver.switchTo().window(mainWindow);
		Thread.sleep(2900);
	}
	public void Click_close()
	{
		//Action can be performed on close element
		close.click();
	}
	public void Clicksignin()
	{
		
		//Action can be performed on ClickSignin element
		ClickSignin.click();
	}
	public void Signin()
	{
		//Action can be performed on Signin element
		Signin.click();
	}
	public void Sign_out()
	{
		//Action can be performed on Sign_Out element
		Sign_Out.click();
	}
	public void Sign_out_all()
	{
		//Action can be performed on Sign_Out_All_Deviceelement
		Sign_Out_All_Device.click();
	}
	public void Update_Profile(String Name,String Number) throws InterruptedException
	{
		//Action can be performed on Profile_Element element
		ExplicitWait.checkClickableExplicitly(driver,Profile_Element,10);
		Profile_Element.click();
		//Action can be performed on Edit_Element element
		Edit_Element.click();
		//Action can be performed on Name_Element element
		ExplicitWait.checkClickableExplicitly(driver,Name_Element,10);
		Name_Element.sendKeys(Name);
		//Action can be performed on Select_gender element
		Select_gender.click();
		//Action can be performed on Enter_mobile element
		Enter_mobile.sendKeys(Number);
		//Action can be performed on Click_save element
		Click_save.click();
		//Action can be performed on Icon_close element
		//Icon_close.click();
	}
	public void Mytrips()
	{
		//Action can be performed on Mytrips element
		ClickSignin.click();
		//Action can be performed on Mytrips element
		My_Trip.click();
	}
	public void MyWallets()
	{
		//Action can be performed on Mytrips element
		ClickSignin.click();
		//Action can be performed on My Wallets element
		My_Wallets.click();
	}
	public void Wallets()
	{
		//Action can be performed on Mytrips element
		ClickSignin.click();
		//Action can be performed on Wallets element
		Wallets.click();
	}



}