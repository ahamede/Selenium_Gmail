package com.google.lib;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ErrorCodes;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Utility {


	public ErrorCodes errCol = new ErrorCodes();
	private static FileWriter fWriter = null;
	private static BufferedWriter writer = null;
	private static String timestamp;
	private static String reportPath;
	public static SoftAssert sAssert = new SoftAssert();
	public static String DRIVER_PATH;
	private static StringBuffer verificationErrors;
	public static String reportpath;
	public static String time;

	public Utility() {
		try {
			if (System.getProperty("webdriver.path").isEmpty() || System.getProperty("webdriver.path").equals(null)) {
				DRIVER_PATH = Utility.class.getClassLoader().getResource("chromedriver(2.19).exe").getFile();
			} else {
				DRIVER_PATH = System.getProperty("webdriver.path");
			}
		} catch (Exception e) {
			DRIVER_PATH = Utility.class.getClassLoader().getResource("chromedriver(2.19).exe").getFile();
		}

		System.out.println("Driver picked from path: " + DRIVER_PATH);
		// this.sAssert = new SoftAssert();
	}

	

	

	// **********************************************************************************

	

	// *********************************************************************************



	
	

	// *******************************************************************************************************************************************************

	

	// *********************************************************************************************************************************

	

	// ********************************************************************************************************************************

	

	// ********************************************************************************************************************************


}
