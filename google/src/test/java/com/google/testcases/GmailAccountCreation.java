package com.google.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.lib.BrowserFactory;
import com.google.pages.gmailpage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GmailAccountCreation {

	static WebDriver driver;
	public static ExtentTest logger;
	public static ExtentReports report;

	// Initializing the setup
	@BeforeTest
	@Parameters({ "Browser", "Url" })
	public static void setup(String browser, String url) {
		
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		logger = report.startTest("GmailAccountCreation");
		driver = BrowserFactory.startBrowser(browser, url);
	}

	@Test
	@Parameters({ "Firstname", "Lastname", "Username1", "Password1", "Mobilenumber" })
	public void createaccount(String firstname, String lastname, String username1, String password1,
			String mobilenumber) throws Throwable {

		gmailpage g = PageFactory.initElements(driver, gmailpage.class);

		// Enter the basic details
		g.basicdetails(firstname, lastname, username1, password1);

		// Enter phone number
		g.enter_phone_number(mobilenumber);
		logger.log(LogStatus.INFO, "Account Created Successfully");
	}

	@AfterMethod
	public void tearDownReport() {
		driver.quit();
		report.endTest(logger);

	}

}
