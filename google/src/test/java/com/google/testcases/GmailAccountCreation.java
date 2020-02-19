package com.google.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.lib.BrowserFactory;
import com.google.lib.ExtentReportManager;
import com.google.lib.Utility;
import com.google.pages.gmailpage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GmailAccountCreation extends ExtentReportManager{

	public static WebDriver driver;
	public static ExtentTest logger;


	@BeforeMethod
	@Parameters({ "Browser" , "Url"})
	public static void setup(String browser, String url) {
		String DRIVER_PATH =System.getProperty("user.dir")+"\\resources\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
	}

	@Test
	@Parameters({"Firstname" , "Lastname" , "Username1" , "Password1" , "Mobilenumber" })	
	public void createaccount(String firstname, String lastname, String username1, String password1, String mobilenumber)  throws Throwable {

		gmailpage g = PageFactory.initElements(driver, gmailpage.class);
		g.basicdetails(logger, firstname, lastname, username1, password1);
		g.enter_phone_number(logger,mobilenumber);

	}


	@AfterMethod
	public void tearDownReport(ITestResult result) {

	
		driver.quit();

	}




}
