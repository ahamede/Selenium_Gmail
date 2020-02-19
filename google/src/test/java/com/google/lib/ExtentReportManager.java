package com.google.lib;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportManager {
	
	
		public static ExtentReports report;
			
			@BeforeTest
			public void setUpReport() throws Throwable {

				String htmlFile = "C:\\EP_FLP\\Automation_Report\\EP_FLP_Final_Report";
				 report = new ExtentReports(htmlFile+".html",false);
				
				 
			}
			
			@AfterTest
			public void tearDown() {
		    	
		    	report.flush();
		    	
		    	
				
			}
			 

}
