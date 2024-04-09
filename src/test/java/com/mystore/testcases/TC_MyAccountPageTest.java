package com.mystore.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccountPage;
import com.mystore.pageobject.registeredUserAccount;


public class TC_MyAccountPageTest extends BaseClass {

	@Test(enabled = true)
	public void VerifyLogin() throws IOException, InterruptedException {

		logger.info("***************TestCase Verify Login starts*****************");

		indexPage pg = new indexPage(driver);
		try {
			pg.menulink();
			//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fdp%2FB0CHQKRVMQ%3Ftag%3Dgoogmantxtmob674-21%26ascsubtag%3D_k_Cj0KCQjw-_mvBhDwARIsAA-Q0Q5RSf4eFcZXswACIv35zXlGWZTQfQFWsEkKyWZFUC-uuzlPwBiceecaAkb-EALw_wcB_k_%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			Thread.sleep(9000);
			pg.clickOnSignIn();
			System.out.println("Sign in link has been clicked");
			System.out.println("Username or email has been entered");
			logger.info("Clicked on sign in link");
			logger.info("Username or email has been entered");
			pg.clickOnTShirtMenu();
			logger.info("Clicked on continoue button");
			System.out.println("continoue button has been clicked");
			Thread.sleep(10000);
			pg.enterpassword();
			System.out.println("Password has been Entered");
			logger.info("Password has been entered");
			pg.signInSumbit();
			System.out.println("Sign In button has been clicked");
			logger.info("Sign in button clicked");
		} catch (Exception e) {
			System.out.println("Not able to login");
		}
		//WebElement userName = driver.findElement(By.xpath("(//*[contains(text(),'inder')])[1]"));
		//Assert.assertTrue(userName,"inder");
		try{
			String title=driver.getTitle();
			//System.out.println(title);
			Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",title);
			logger.info("User has logged in sucessfuly");
			System.out.println("Sucessfully login");
			pg.openoderpage();
			System.out.println("Order page has been opened");
			pg.profile();
			System.out.println("Profile section has been opened");
            }
		catch (Exception e){
			System.out.println("Login failed");
		}


	}

	@Test(enabled = true)
	public void verifyRegistrationAndLogin() {
		//indexPage pg1 = new indexPage(driver);
		//indexPage pg = new indexPage(driver);
		indexPage pg = new indexPage(BaseClass.driver);
		logger.info("***************TestCase Verify Registration *****************");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		try {
			pg.menulink();
			Thread.sleep(8000);
			pg.createamazonaccount();
			System.out.println("Create new account on amazon has been initiated");
			pg.enteryourname();
			System.out.println("Name has been Entered");
			pg.enterphonenumer();
			System.out.println("Phone number has been Entered");
			pg.enterpassword();
			System.out.println("Password has been Entered");
			pg.verifymobilenumber();
			System.out.println("Clicked on verify mobile number");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Please verify the otp send to Registered mobile number");
		System.out.println("Need to verify the OTP details to register sucesssfuly and detials entered should not existing at Amazon DB");
	}

	@Test(enabled = true)
	public void searchresult() {
		indexPage pg = new indexPage(driver);
		try {
			Thread.sleep(7000);
			pg.searchbox();
			System.out.println("Search Item Name has been Entered");
			pg.searchboxclick();
			System.out.println("Clicked on search button");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Search Items has been dispalyed");

	}
	@Test(enabled = true)
	public void additemstocart() {
		indexPage pg = new indexPage(driver);
        try {
            VerifyLogin(); //login method
			searchresult();//Search method
			Thread.sleep(12000);
			pg.addtocartfromsearchpage();

//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(20,500)");
            //pg.addtocartfromproductpage();//add product to cart
			System.out.println("Product added to cart page");
			//pg.refreshpage();//page is refreshed
			//System.out.println("Page is refreshed");
			pg.opencartpage();// open cart page
			System.out.println("Cart page has been opened");
			pg.proceedtobuy();
			Thread.sleep(4000);
			System.out.println("ProceedTobuy has been clicked");
			//pg.proceedtobuy();
			//Thread.sleep(3000);
			pg.addressconfirm();
			Thread.sleep(4000);
			System.out.println("Clicke on Address to be confirmed");
             Thread.sleep(5000);
             pg.selectpaymentmethod();
			System.out.println("Payment method has been selected");
			System.out.println("Need details to proceed further");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }




}

