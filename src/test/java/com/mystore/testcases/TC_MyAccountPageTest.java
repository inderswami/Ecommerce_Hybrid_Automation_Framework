package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccountPage;
import com.mystore.pageobject.registeredUserAccount;


public class TC_MyAccountPageTest extends BaseClass {

	@Test(enabled=true)
	public void searchresult(){
		indexPage pg=new indexPage();
        try {
            Thread.sleep(7000);
			pg.searchbox();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


	}

	@Test(enabled=false)
	public void verifyRegistrationAndLogin()
	{
indexPage pg=new indexPage();
logger.info("***************TestCase Verify Registration *****************");
		pg.menulink();
        try {
            Thread.sleep(80000);
			pg.createamazonaccount();
			pg.enteryourname();
			pg.enterphonenumer();
			pg.enterpassword();
			pg.verifymobilenumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//
//
//		indexPage pg = new indexPage(driver);
//		pg.clickOnSignIn();
//		logger.info("Clicked on sign in link");

//		myAccountPage myAcpg = new myAccountPage(driver);
//		myAcpg.enterCreateEmailAddress("cs923@gmail.com");
//		logger.info("Email address entered in create account section.");
//
//		myAcpg.clickSubmitCreate();
//
//		logger.info("clicked on create an account button");
//
//		accountCreationDetails accCreationPg = new accountCreationDetails(driver);
//
//		accCreationPg.selectTitleMrs();
//		accCreationPg.enterCustomerFirstName("Prachi");
//		accCreationPg.enterCustomerLastName("Gupta");
//		accCreationPg.enterPassword("cs923");
//		accCreationPg.enterAddressFirstName("Prachi");
//		accCreationPg.enterAddressLastName("Gupta");
//		accCreationPg.enterAddress("18/8 worli road");
//
//		accCreationPg.enterCity("Mumbai");
//		accCreationPg.selectState("Alabama");
//
//		accCreationPg.enterPostcode("00000");
//		accCreationPg.selectCountry("United States");
//		accCreationPg.enterMobilePhone("9891778192");
//		accCreationPg.enterAlias("Home");
//
//		logger.info("entered user details on account creation page.");
//
//		accCreationPg.clickOnRegister();
//		logger.info("clicked on Register button");
//
//		registeredUserAccount regUser = new registeredUserAccount(driver);
//		String userName = regUser.getUserName();
//
//		Assert.assertEquals("Prachi Gupta", userName);
//
		logger.info("***************TestCase Verify Registration and Login ends*****************"); 

	}

	@Test(enabled = false)
	public void VerifyLogin() throws IOException, InterruptedException {

		logger.info("***************TestCase Verify Login starts*****************"); 

		indexPage pg = new indexPage(driver);
        try{
			pg.menulink();
			//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fdp%2FB0CHQKRVMQ%3Ftag%3Dgoogmantxtmob674-21%26ascsubtag%3D_k_Cj0KCQjw-_mvBhDwARIsAA-Q0Q5RSf4eFcZXswACIv35zXlGWZTQfQFWsEkKyWZFUC-uuzlPwBiceecaAkb-EALw_wcB_k_%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			Thread.sleep(9000);
			pg.clickOnSignIn();
			logger.info("Clicked on sign in link");
			logger.info("Username or email entered");
			pg.clickOnTShirtMenu();
			logger.info("Clicked on continoue button");
			System.out.println("continoue clicked");
			Thread.sleep(12000);
			pg.enterpassword();
			logger.info("Password has been entered");
			pg.signInSumbit();
			logger.info("Sign in button clicked");
		}
		catch (Exception e){
			System.out.println("Error");
		}



//		myAccountPage myAcpg = new myAccountPage(driver);
//
//		myAcpg.enterEmailAddress("cs923@gmail.com");
//		logger.info("Entered email address");
//
//		myAcpg.enterPassword("cs923");
//		logger.info("Entered password");
//
//		myAcpg.clickSignIn();
//		logger.info("Clicked on sign in link..");
//
//
//	registeredUserAccount regUser = new registeredUserAccount(driver);
//		String userName = regUser.getUserName();
//
//		if(userName.equals("Inder Swami"))
//		{
//			logger.info("VerifyLogin - Passed");
//			regUser.clickOnSignOut();
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			logger.info("VerifyLogin - Failed");
//			captureScreenShot(driver,"VerifyLogin");
//			Assert.assertTrue(false);
//
//		}

		logger.info("***************TestCase Verify Login ends*****************"); 


	}


	@Test(enabled = false)
	public void VerifySignOut() throws IOException 
	{

		logger.info("***************TestCase Verify Sign out starts*****************"); 

//		indexPage pg = new indexPage(driver);
//
//		pg.clickOnSignIn();
//		logger.info("Clicked on sign in link");
//
//		myAccountPage myAcpg = new myAccountPage(driver);
//
//		myAcpg.enterEmailAddress("cs923@gmail.com");
//		logger.info("Entered email address");
//
//		myAcpg.enterPassword("cs923");
//		logger.info("Entered password");
//
//		myAcpg.clickSignIn();
//		logger.info("Clicked on sign in link..");
//
//
//		registeredUserAccount regUser = new registeredUserAccount(driver);
//		regUser.clickOnSignOut();
//
//		if(pg.getPageTitle().equals("Login - My Store"))
//		{
//			logger.info("VerifySignOut - Passed");
//			Assert.assertTrue(true);
//		}
//
//		else
//		{
//			logger.info("VerifySignOut - Failed");
//			captureScreenShot(driver,"VerifySignOut");
//			Assert.assertTrue(false);
//		}
//
//
//		logger.info("***************TestCase Verify Sign out ends*****************");
//
//	}


}
