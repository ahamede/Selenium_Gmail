package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.google.lib.Helper;

/**
 * Hello world!
 *
 */
public class gmailpage 
{
	public WebDriver driver;
	
	By create_account=By.xpath("//span[contains(.,'Create account')]");
	By sel1=By.xpath("//span[contains(.,'For myself')]");
	By error1=By.xpath("//div[contains(text(),'username is taken')]");
	By suggestion_select=By.xpath("//div[contains(text(),'Available')]/following::button[1]");
	By firstName=By.xpath("//input[@id='firstName']");		 
	By lasttName = By.xpath("//input[@id='lastName']");
	By username = By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@name='Passwd']");
	By confirm_password=By.xpath("//input[@name='ConfirmPasswd']");
	By next=By.xpath("//span[contains(.,'Next')]");

	public gmailpage(WebDriver driver){
		this.driver=driver;
	}

	public WebDriver basicdetails(String firstname, String lastname, String username1, String password1) throws InterruptedException{

		Helper.getElementByXpath(driver, create_account, 5).click();
		Helper.getElementByXpath(driver, sel1, 5).click();
		Helper.getElementByXpath(driver, firstName, 5).sendKeys(firstname);
		Helper.getElementByXpath(driver, lasttName, 5).sendKeys(lastname);
		Helper.getElementByXpath(driver, username, 5).sendKeys(username1);
		Helper.getElementByXpath(driver, password, 5).sendKeys(password1);
		Helper.getElementByXpath(driver, confirm_password, 5).sendKeys(password1);
		Helper.getElementByXpath(driver, next, 5).click();
		Thread.sleep(3000);
/*		WebElement err=Helper.WaitAndfindElement(driver, error1, 5);
		if(err.isDisplayed()){
			Helper.getElementByXpath(driver, suggestion_select, 5).click();
			Thread.sleep(3000);
			Helper.getElementByXpath(driver, next, 5).click();
			Thread.sleep(3000);*/


return driver;
	}

	By phone_number=By.xpath("//input[contains(@id,'phoneNumberId')]");
	By verify=By.xpath("//span[contains(.,'Verify')]");
	By code=By.id("code");
	public WebDriver enter_phone_number(String mobilenumber) throws InterruptedException{
		Helper.getElementByXpath(driver, phone_number, 5).sendKeys(mobilenumber);
		Thread.sleep(3000);
		Helper.getElementByXpath(driver, next, 5).click();

/*		driver.wait(2000);
		driver.switchTo().defaultContent();
		WebElement code1=driver.findElement(code);
		String codevalue=code1.getAttribute("value");
		System.out.println(codevalue);
				WebDriverWait wait=new WebDriverWait(driver, 20);
        WebElement clickverify;
        clickverify=wait.until(Expectedconditions.)
		Helper.getElementByXpath(driver, verify, 5).click();
		Thread.sleep(3000);*/
return driver;
	}

	By day=By.id("day");
	By month=By.id("month");
	By year=By.id("year");
	By gender=By.id("gender");
	By continue1=By.xpath("//span[.,'Yes, I'm in'']");
	By agree=By.xpath("//span[.,agree']");
	By welcome=By.xpath("//h1[contains(.,'Welcome')]");


	public void personal_details(String day1, String year1, String month1, String gender1){

		Helper.getElementByXpath(driver, day, 5).sendKeys(day1);
		Select months=new Select(driver.findElement(month));
		months.selectByVisibleText(month1);
		driver.findElement(year).sendKeys(year1);
		Select genders=new Select(driver.findElement(gender));
		genders.selectByVisibleText(gender1);
		Helper.getElementByXpath(driver, next, 5).click();
		driver.findElement(continue1).click();
		Helper.getElementByXpath(driver, agree, 5).click();
		WebElement logingmail=driver.findElement(welcome);
		if(logingmail.isDisplayed()){
			System.out.println("Login Successfful");
		}
		else{
			System.out.println("Login fails");

		}


	}

}
