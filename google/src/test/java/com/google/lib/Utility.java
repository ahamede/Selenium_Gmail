package com.google.lib;

import org.openqa.selenium.remote.ErrorCodes;
import org.testng.asserts.SoftAssert;

public class Utility {


	public ErrorCodes errCol = new ErrorCodes();
	public static SoftAssert sAssert = new SoftAssert();
	public static String DRIVER_PATH;
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
