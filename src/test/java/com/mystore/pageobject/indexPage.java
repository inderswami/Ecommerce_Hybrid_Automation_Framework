package com.mystore.pageobject;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class indexPage {
	//1. create object of webdriver

//	public Pricelist(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	}
	WebDriver driver;

	//constructor
	public indexPage(WebDriver driver)
	{
//		ldriver = rdriver;
////this.driver=driver;
//		PageFactory.initElements(rdriver, this);
		this.driver = driver;
		PageFactory.initElements(driver, this);


	}


	//identify webelements

	@FindBy(xpath = "//*[@class='nav-line-2 ']")
	WebElement menulink;

	@FindBy(xpath = "//a[contains(text(),'Start here.')]")
	WebElement signinhere;

	@FindBy(xpath = "//*[@type='email']")
	WebElement signIn;
	
	@FindBy(xpath="(//*[@id='continue'])[1]")
	WebElement tshirtMenu;

	@FindBy(xpath="//*[@id='ap_password']")
	WebElement password;

	@FindBy(xpath="//*[@id='signInSubmit']")
	WebElement sigInSubmit;

	@FindBy(xpath="//*[@id='createAccountSubmit']")
	WebElement createamazonaccount;

	@FindBy(xpath="//*[@type='text']")
	WebElement yourname;

	@FindBy(xpath="//*[@type='tel']")
	WebElement phone;

	@FindBy(xpath="//*[@type='password']")
	WebElement createpassword;

	@FindBy(xpath="//*[@type='submit']")
	WebElement verifymobilenumber;

    ////a[@data-nav-role='signin']//span[@class='nav-icon nav-arrow']
    @FindBy(xpath="//a[@data-nav-role='signin']//span[@class='nav-icon nav-arrow']")
    WebElement temp1;

    @FindBy(xpath="//div[@id='nav-flyout-ya-newCust']//a[contains(text(),'Start here.')]")
    WebElement temp2;

@FindBy(xpath="(//*[@class='nav-input nav-progressive-attribute'])[1]")
WebElement searchbox;

	@FindBy(xpath="//*[@type='submit']")
	WebElement searchboxclick;

	@FindBy(xpath = "//a[@data-nav-role='signin']//span[@class='nav-icon nav-arrow']")
	WebElement menuDownArrowlink_Avi;
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	WebElement createAccountLine_Avi;

@FindBy(xpath = "(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")
WebElement clickonsearchitem;
//(//*[@name='submit.add-to-cart'])[1]

	@FindBy(xpath = "(//*[@name='submit.add-to-cart'])[1]")
	WebElement addtocartfromproductpage;

	//(//*[@class='nav-line-2'])[3]

	@FindBy(xpath = "(//*[@class='nav-line-2'])[3]")
	WebElement cartpage;

	@FindBy(xpath = "(//*[@class='nav-line-2'])[2]")
	WebElement orderpage;

	@FindBy(xpath = "(//*[@type='button'])[2]")
	WebElement addtocartfromsearchpage;
	//

	@FindBy(xpath = "//*[@name='proceedToRetailCheckout']")
	WebElement proceedtobuy;

	//
	@FindBy(xpath = "(//*[@class='a-button-input'])[2]")
	WebElement addressconfirm;
//
@FindBy(xpath = "//*[@class='editNameIcon']")
WebElement editprofile;

	public indexPage() {

	}
public void editprofile(){

	editprofile.click();
}

public void swtitchtoeditprofilepop(){
	driver.switchTo().alert();
	driver.findElement(By.xpath("//*[@id='editProfileNameInputId']")).sendKeys("inder1");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.findElement(By.xpath("//input[@aria-labelledby='editProfileContinueButton-announce']"));
    try {
        Thread.sleep(3000);
		String updatedname=driver.findElement(By.xpath("//*[@class='profile-name desktop']")).getText();
		System.out.println("Updatedname"+"::"+updatedname);

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

	public void selectpaymentmethod(){
		//WebElement radiobutton=driver.findElement(By.xpath("(//*[text()='Net Banking'])[1]"));
		//radiobutton.click();
		WebElement radiobutton=driver.findElement(By.xpath("(//*[text()='ICICI Bank Credit Card'])[1]"));
		radiobutton.click();
		WebElement cvv=driver.findElement(By.xpath("(//*[@type='password'])[1]"));
		cvv.sendKeys("test1");
		//WebElement selectElement = driver.findElement(By.name("HDFC Bank"));
		//Select select = new Select(selectElement);

	}
public void profile(){
	driver.get("https://www.amazon.in/slc/hub?disablePicker=1&shoppingAs=1&ref=sl_ph_navpicker&encodedActorId=AAAAAAAAAQCnLNxV0AA8DH2Hvq0pCGxLQQAAAAAAAAD1CrTAJbolPXhRFDMO4JLaoTjnavdTRll%2BmwJ1fHejVZLD3J5iNE0e4qTITPAW55J8eoDeEtAnSBQgA8XUcSjSTg%3D%3D&qap=");

}


	public void addressconfirm(){
		addressconfirm.click();
	}
	public void proceedtobuy(){
		proceedtobuy.click();

	}


	public void addtocartfromsearchpage(){

		addtocartfromsearchpage.click();
	}
	public void movelement(){
//		Actions actions = new Actions(driver);
//	actions.moveToElement(addtocartfromproductpage).perform();
		  try {
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  // Execute JavaScript to scroll to the element
			  js.executeScript("arguments[0].scrollIntoView(true);", addtocartfromproductpage);
			  Thread.sleep(2000);
			  addtocartfromproductpage.click();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

	public void opencartpage(){
		cartpage.click();

	}
	public void openoderpage(){
		orderpage.click();

	}


public void addtocartfromproductpage(){
		addtocartfromproductpage.click();
}

public void refreshpage(){
	driver.navigate().refresh();

}


	public void clickonsearchitem(){
		clickonsearchitem.click();

	}

	public void searchbox() {
		searchbox.sendKeys("Mobile");
	}

	public void searchboxclick(){
		//searchboxclick.click();
        try {
            Thread.sleep(5000);
			searchboxclick.sendKeys(Keys.ENTER);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


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

		//menulink.click();
//		Actions actions = new Actions(ldriver);
//		actions.moveToElement(menulink).perform();
		//signinhere.click();
		//WebElement ele=ldriver.findElement(By.xpath("//a[@data-nav-role='signin']//span[@class='nav-icon nav-arrow']"));
//		Actions actions = new Actions(ldriver);
//
//		// Perform the mouse hover action
//		actions.moveToElement(temp1).perform();
//		//ldriver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a[contains(text(),'Start here.')]"));
//temp2.click();
		//ldriver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		try{
			Thread.sleep(10000);
			//BaseClass.driver
			//driver.findElement(By.xpath("//a[@data-nav-role='signin']//span[@class='nav-icon nav-arrow']")).click();
			menuDownArrowlink_Avi.click();
		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public void clickOnSignIn() {
			signIn.sendKeys("inder.swami@gmail.com");
	}
	
	public String getPageTitle()
	{
		return(driver.getTitle());
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

	public void createNewAccountLink(){

		//menulink.click();
		try{
			Thread.sleep(4000);
			//driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
			createAccountLine_Avi.click();
		}catch(Exception e){
			e.printStackTrace();
		}


	}





}
