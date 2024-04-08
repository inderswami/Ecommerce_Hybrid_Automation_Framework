package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public indexPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		

		PageFactory.initElements(rdriver, this);
	}


	//identify webelements

	@FindBy(xpath = "//*[@class='nav-line-2 ']")
	WebElement menulink;

	@FindBy(xpath = "//*[@type='email']")
	WebElement signIn;
	
	@FindBy(xpath="(//*[@id='continue'])[1]")
	WebElement tshirtMenu;

	@FindBy(xpath="(//*[@id='ap_password']")
	WebElement password;

	@FindBy(xpath="(//*[@id='signInSubmit']")
	WebElement sigInSubmit;
	//identify action on webelement
	public void menulink(){

		menulink.click();

	}


	public void clickOnSignIn() {
			signIn.sendKeys("inder.swami@gmail.com");
	}
	
	public String getPageTitle()
	{
		return(ldriver.getTitle());
	}
	
	public void clickOnTShirtMenu()
	{
		tshirtMenu.click();
	}

	public void enterpassword(){
		password.sendKeys("Testbond@123");

	}
	public void signInSumbit()
	{
		sigInSubmit.click();
	}

}
