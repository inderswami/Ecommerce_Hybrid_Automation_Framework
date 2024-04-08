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

	@FindBy(xpath="(//*[@id='createAccountSubmit']")
	WebElement createamazonaccount;

	@FindBy(xpath="(//*[@type='text']")
	WebElement yourname;

	@FindBy(xpath="(//*[@type='tel']")
	WebElement phone;

	@FindBy(xpath="(//*[@type='password']")
	WebElement createpassword;

	@FindBy(xpath="(//*[@type='submit']")
	WebElement verifymobilenumber;


@FindBy(xpath="(//*[@class='nav-input nav-progressive-attribute'])[1]")
WebElement searchbox;

	@FindBy(xpath="(//*[@class='nav-input nav-progressive-attribute'])[2]")
	WebElement searchboxclick;

	public indexPage() {

	}

	public void searchbox() {
		searchbox.sendKeys("Mobile");
	}

	public void searchboxclick(){
		searchboxclick.click();

	}

		public void verifymobilenumber(){
		verifymobilenumber.click();

	}
public void createpassword(){
		createpassword.sendKeys("Testbond@123");

}

	public void enterphonenumer(){
		phone.sendKeys("7827808511");

	}


	public void enteryourname(){
	yourname.sendKeys("Inder");

}
	//identify action on webelement
	public void createamazonaccount(){
		createamazonaccount.click();

	}
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
