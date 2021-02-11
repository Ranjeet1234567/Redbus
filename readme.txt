-----------------------------------First we create a project as Name RanjeetVermaFinalAssignment-----------------------
#There is Three Resource Folder
1.src/main/java
2.src/test/java
3.src/main/resources

--------------------------------------------- Resource-src/main/java----------------------------------------------------------------------------
#In this resources there is three package:-
 i:-com.log4j
 ii:-com.pages
 iii:-com.utils

---------------------------------------------Package-:com.log4j----------------------------------------------------------------
#In this package there is one java class 
Log4jDemo.java:-This java class use to log the error and messages into the log file.

----------------------------------------Package-: com.page--------------------------------------------------------------------
#In this package there is 12 java class
AwardsRecogintionPage:-In this java class  we create various method and find locator/WebElement for AwardRecognitionPage
BusHireOperatorPage:-In this java class  we create various method and find locator/WebElement for information became a bus operator
BusHireOfferPage:-In this java class  we create various method and find locator/WebElement for check the bus offer for booking
BusHirePage:-In this java class  we create various method and find locator/WebElement for  check the process of booking ticket
CallBackPage:-In this java class  we create various method and find locator/WebElement for check the information to  request a callback, submit your details here.
ConveniencePage:-In this java class  we create various method and find locator/WebElement for Enter your mobile number below to download the redBus mobile app.
EasierBusHirePage:-In this java class  we create various method and find locator/WebElement for check easy booking,easy payment  and Fare Transparency
ManagedBookingPage:-In this java class  we create various method and find locator/WebElement for check cancel,reschedule, show my ticket and sms operation
ReadGuidlinesPage:-In this java class  we create various method and find locator/WebElement for check the guidline that need during the travel
RpoolPage:-In this java class  we create various method and find locator/WebElement for check 
SigninPage:-In this java class  we create various method and find locator/WebElement for check the infromation that need for login page
TripDetailsPage:-In this java class  we create various method and find locator/WebElement for check the information that need during book ticket.

-----------------------------------------------------------------Package-com.utils--------------------------------------------------------------------------------------------------------
#In this package there is two java class :-
1-ExplicitWait-In this page give the code that need to call all class
2-Screen_Shots-In this page give information for the screenshot.

-------------------------------------------------------------------------Resource-  src/test/java------------------------------------------------------------------------------------
In this resource we have two package :
1-com.test
2-com.utilTest

--------------------------------------------------------------------------------------------Package-com.test--------------------------------------------------------------------------
In this package we have 14 test class:-
1-AwardsRecoginitionTest-In this page we call the all method from the page file of this and perform the operation.
2.BaseTest- In this test we first write code for the access of data from properties file ,we write the code for driver ,screenshot,extentreport and driver quit.
3.BusHireOfferTest:-In this page we call all method from the page class and executed.
4.BusHireOperatorTest:-In this page we call all method from the page class and executed.
5-BusHireTest:-In this page we call all method from the page class and executed.
6-CallBackTest:-In this page we call all method from the page and perform operation for the call back.
7-ConvenienceTest;-In this page we call all method from the page class and executed.
8-EasierBusHireTest:-In this page we call all method from the page class and perform operation.
9-ManagedBookingTest:-In this test there is 4 another testcase:-
-Invalid_Cancel
-Invalid_ReSchedule
-Invalid_Show_MyTicket
-Invalid_Email_SMS
10-ReadExcelSheet-In this class we write the code for access the data from the excel sheet.
11-ReadGuidlineTest- In this page we call all method from the page class and perform operation. 
12-RpoolNewTest:-  
# In this Page have two testcase:
-Rpool_New
-Rpool_Information
13-SigninTest-:
# In this Page there is various testcase:
-ValidSignin
-InvalidSingin
-ValidUpdateProfile
-InvalidUpdateProfile
-Signout
-Sign_Out_All_Device
-Trip
-Wallets
-WalletsHistory  
14-TripDetailsTest:-In this page we call all method from the page class and perform operation. 

------------------------------------------------------------------------Package Com.utilsTest------------------------------------------------------------------------------
In this package we have one class RequiredExecution  that use for  check the execution type.

 ----------------------------------------------------------- Resource-src/main/resources---------------------------------------------------------------------------------
In this resources we have to create one log4j2.properties file for the logger.

------------------------------------------------------------Create a ExcelSheetData--------------------------------------------------------------------------------------

Create a Excel_data.xlsx file for write the data in excel sheet.

#FailedTestScreenshot: In this file we store the screen shot when the test case fail.
#logs:-In this txt file auto generate the propertieslogs.log
#Properties file:-In this file we create a configuration.properties file for give the location of the file and driver.
#report:-It is auto generate report when we run the test case .
#Resource:-In this folder we add the driver that use .
#pom.xml:-In this file we write all dependency that need for execution the testcase.
#testng.xml:-In this xml file write the code in for run all testcase in one hit.
#docker-compose.yml-In this yml file write the code that execute the test case parallel.
#Abc.bat file-This bat file use to run the all testcase in one click .
#jAR file-Supportedfile-In this file we add dependency for screen shot and Explicitwait.



