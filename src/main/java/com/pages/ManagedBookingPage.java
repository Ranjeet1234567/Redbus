package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/*----------------------------------------ManagedBookingPage-------------------------------*/
public class ManagedBookingPage 
{
	//Initialize the driver
	WebDriver driver;
	//Create a Constructor with same name of class
	public ManagedBookingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	/*------------------------------Get the Element that need for test case---------------*/
	@FindBy(how = How.XPATH,using="//*[@id=\"manageHeaderdd\"]/div[2]")
	public WebElement ManageBooking;

	@FindBy(how = How.XPATH,using="//*[@id=\"hmb\"]/div[2]/ul/li[2]")
	public WebElement CancelBooking;

	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/div/input")
	public WebElement EnterTicketNo;

	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/input")
	public WebElement EnterEmailId;

	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div[2]/div")
	public WebElement SelectPassenger;

	@FindBy(how=How.XPATH,using="//*[@id=\"hmb\"]/div[2]/ul/li[3]")
	public WebElement ReSchedule;

	@FindBy(how=How.XPATH,using="//*[@id=\"searchTicket\"]")
	public WebElement ReScheduleTicketNo;

	@FindBy(how=How.XPATH,using="//*[@id=\"searchEmail\"]")
	public WebElement ReScheduleEmailId;

	@FindBy(how=How.XPATH,using="//*[@id=\"ticketSearch\"]")
	public WebElement Search;

	@FindBy(how=How.XPATH,using="//*[@id=\"hmb\"]/div[2]/ul/li[4]")
	public WebElement ShowMyTicket;

	@FindBy(how=How.XPATH,using="//*[@id=\"searchTicketTIN\"]")
	public WebElement EnterMyTicket;

	@FindBy(how=How.XPATH,using="//*[@id=\"searchTicketEmail\"]")
	public WebElement EnterMyTicketEmail;

	@FindBy(how=How.XPATH,using="//*[@id=\"ticketSearch\"]")
	public WebElement ClickSubmit;

	@FindBy(how=How.XPATH,using="//*[@id=\"hmb\"]/div[2]/ul/li[5]")
	public WebElement ClickEmail;

	public void Manage_Booking()
	{
		//Action can be performed on ManageBooking element
		ManageBooking.click() ;
	}
	public void Cancel_Booking(String TicketNumber,String EmailId)
	{
		//Action can be performed on CancelBooking element
		CancelBooking.click();
		//Action can be performed on EnterTicketNo element
		EnterTicketNo.sendKeys(TicketNumber);
		//Action can be performed on EnterEmailId element
		EnterEmailId.sendKeys(EmailId);
		//Action can be performed on SelectPassenger element
		SelectPassenger.click();
	}
	public void Reschedule(String TicketNo,String Email)
	{
		//Action can be performed on ReSchedule element
		ReSchedule.click();
		//Action can be performed on ReScheduleTicketNo element
		ReScheduleTicketNo.sendKeys(TicketNo);
		//Action can be performed on ReScheduleEmailId element
		ReScheduleEmailId.sendKeys(Email);
		//Action can be performed on Search element
		Search.click();
	}

	public void Show_My_Ticket(String TicketNo,String Email)
	{
		//Action can be performed on EnterMyTicket element
		EnterMyTicket.sendKeys(TicketNo);
		//Action can be performed on EnterMyTicketEmail element
		EnterMyTicketEmail.sendKeys(Email);
		//Action can be performed on ClickSubmit element
		ClickSubmit.click();
	}
	public void Show_Ticket() 
	{
		//Action can be performed on ShowMyTicket element
		ShowMyTicket.click();
	}
	public void Click_Email()
	{
		//Action can be performed on ClickEmail element
		ClickEmail.click();
	}
}
