package com.Kleenex.BrandShop.Index;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Kleenex.Init.Common;
import com.Kleenex.Init.ITestStatus;
import com.Kleenex.Init.SeleniumInit;

public class Brandshop_Index extends SeleniumInit {
	
	
	int numOfFailure = 0;
	int logStep = 1;
	int log=0;
	int TC_ID=1;
	
	String randno1 = RandomStringUtils.randomNumeric(4);
	
	String randno  = RandomStringUtils.randomNumeric(6);
	

	@Test
	public void AddSimpleProd_HomePage() throws IOException, InterruptedException
	{
		
		
		Common.logcase("Testcase Id: TC_1");
		
		Common.logcase("Testcase Name: Add Simple Product from Home Page.");

		Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
		Common.pause(5);
		System.err.println("Hello");
		try {
			System.err.println("in try");
			 BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		
		BS_Indexpage.VerifyHomepageLogo();
		//BS_Veri = BS_Indexpage.AddtoCart();
		logStep = BS_Indexpage.HomePageSimpleProductAddtoCart(logStep);
	
if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))){
			
	logStep = BS_Indexpage.Cart_Checkout_Click_Mobile(logStep);
		}
		else
		{
			
			logStep = BS_Indexpage.Cart_Checkout_Click_FullScreen(logStep);
		}

		
		//BS_Veri = BS_Indexpage.Cart_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shopping Details.");

		Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
		Common.pause(3);
	
		BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari"+randno+"@mailinator.com");
		Common.pause(1);
		BS_Veri = BS_Indexpage.Shipping_form_FirstName();
		BS_Veri = BS_Indexpage.Shipping_form_lastName();
		BS_Veri = BS_Indexpage.Shipping_form_Company();
		BS_Veri = BS_Indexpage.Shipping_form_Street1();
		BS_Veri = BS_Indexpage.Shipping_form_Street2();
		BS_Veri = BS_Indexpage.Shipping_form_City();
		BS_Veri = BS_Indexpage.Shipping_form_State();
		BS_Veri = BS_Indexpage.Shipping_form_Postcode();
		BS_Veri = BS_Indexpage.Shipping_form_Country();
		BS_Veri = BS_Indexpage.Shipping_form_Telephone();
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		log("Verify User is getting Successfully Done 'Thank You' message.");
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		
		
	}
	
	@Test
	public void AddSimpleprod_ListPage() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_2");
		
		Common.logcase("Testcase Name: Add Simple product from list page.");

		Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		try {
			
			BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		BS_Indexpage.VerifyHomepageLogo();
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.pause(1);
		//BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
		logStep = BS_Indexpage.AddtoCart(logStep);
if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))){
			
	logStep = BS_Indexpage.Cart_Checkout_Click_Mobile(logStep);
	}
		else
		{
			
			logStep = BS_Indexpage.Cart_Checkout_Click_FullScreen(logStep);
		}
		

		
		//BS_Veri = BS_Indexpage.Cart_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shopping Details.");

		Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
		Common.pause(3);
	
		BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari"+randno+"@mailinator.com");
		Common.pause(1);
		BS_Veri = BS_Indexpage.Shipping_form_FirstName();
		BS_Veri = BS_Indexpage.Shipping_form_lastName();
		BS_Veri = BS_Indexpage.Shipping_form_Company();
		BS_Veri = BS_Indexpage.Shipping_form_Street1();
		/*BS_Veri = BS_Indexpage.Shipping_form_Street2();*/
		BS_Veri = BS_Indexpage.Shipping_form_City();
		BS_Veri = BS_Indexpage.Shipping_form_State();
		BS_Veri = BS_Indexpage.Shipping_form_Postcode();
		BS_Veri = BS_Indexpage.Shipping_form_Country();
		BS_Veri = BS_Indexpage.Shipping_form_Telephone();
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
		Common.pause(3);
		if(BS_Veri.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		
		
	}
	
	@Test
	public void AddConfigprod_DetailPage() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_3");
		
		Common.logcase("Testcase Name: Add Configurable product from Product Detail page.");

		
		Common.pause(2);
		System.err.println("Hello");
		try {
			
			 BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		//BS_Indexpage.VerifyHomepageLogo();
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.pause(1);
		BS_Veri = BS_Indexpage.ListofProduct();
		//BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
		logStep = BS_Indexpage.ClickOnRandomProduct(logStep);
		BS_Veri = BS_Indexpage.FunctionalitySelection_Color();
		BS_Veri = BS_Indexpage.FunctionalitySelection_Size();
		BS_Veri = BS_Indexpage.FunctionalitySelection_ItemQuantity();
		
		if(targetBrowser.contains("iPhoneTablet")){
			
			logStep = BS_Indexpage.AddtoCartDEtailPage(logStep);
		}
		else
		{
			
			logStep = BS_Indexpage.AddtoCart(logStep);
		}
		
if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))){
			
			logStep = BS_Indexpage.Cart_Checkout_Click_Mobile(logStep);
		}
		else
		{
			
			logStep = BS_Indexpage.Cart_Checkout_Click_FullScreen(logStep);
		}
		

		//BS_Veri = BS_Indexpage.Cart_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
		Common.pause(2);
	
		BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari"+randno+"@mailinator.com");
		Common.pause(1);
		BS_Veri = BS_Indexpage.Shipping_form_FirstName();
		BS_Veri = BS_Indexpage.Shipping_form_lastName();
		BS_Veri = BS_Indexpage.Shipping_form_Company();
		BS_Veri = BS_Indexpage.Shipping_form_Street1();
		BS_Veri = BS_Indexpage.Shipping_form_Street2();
		BS_Veri = BS_Indexpage.Shipping_form_City();
		BS_Veri = BS_Indexpage.Shipping_form_State();
		BS_Veri = BS_Indexpage.Shipping_form_Postcode();
		BS_Veri = BS_Indexpage.Shipping_form_Country();
		BS_Veri = BS_Indexpage.Shipping_form_Telephone();
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
	Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
		if(BS_Veri.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		
		
	}
	
	
	@Test
	public void AddSimpleProduct_SearchPage() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_4");
		
		Common.logcase("Testcase Name: Add Simple product from Search result page.");

		Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
		Common.pause(2);
		try {
			
			 BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		BS_Indexpage.VerifyHomepageLogo();
		logStep = BS_Indexpage.SearchBoxValue("simple product",logStep);
		Common.pause(1);
		logStep = BS_Indexpage.AddtoCart(logStep);
if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))){
			
	logStep = BS_Indexpage.Cart_Checkout_Click_Mobile(logStep);
		}
		else
		{
			
			logStep = BS_Indexpage.Cart_Checkout_Click_FullScreen(logStep);
		}
		

		//BS_Veri = BS_Indexpage.Cart_Checkout_Click();
		
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
		Common.pause(3);
	
		BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari"+randno+"@mailinator.com");
		Common.pause(1);
		BS_Veri = BS_Indexpage.Shipping_form_FirstName();
		BS_Veri = BS_Indexpage.Shipping_form_lastName();
		BS_Veri = BS_Indexpage.Shipping_form_Company();
		BS_Veri = BS_Indexpage.Shipping_form_Street1();
		/*BS_Veri = BS_Indexpage.Shipping_form_Street2();*/
		BS_Veri = BS_Indexpage.Shipping_form_City();
		BS_Veri = BS_Indexpage.Shipping_form_State();
		BS_Veri = BS_Indexpage.Shipping_form_Postcode();
		BS_Veri = BS_Indexpage.Shipping_form_Country();
		BS_Veri = BS_Indexpage.Shipping_form_Telephone();
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		//Common.logvf("Verify User is redirect on Payment Page");
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		
		
	}

	
	@Test
	public void AddSimpleProd_CreateAccount() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_5");
		
		Common.logcase("Testcase Name: Add Simple Product and create account.");

		Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		try {
			
			 BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		BS_Indexpage.VerifyHomepageLogo();
		logStep = BS_Indexpage.HomePageSimpleProductAddtoCart(logStep);
		//BS_Veri = BS_Indexpage.AddtoCart();
if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))){
			
	logStep = BS_Indexpage.Cart_Checkout_Click_Mobile(logStep);
		}
		else
		{
			
			logStep = BS_Indexpage.Cart_Checkout_Click_FullScreen(logStep);
		}
		

		//BS_Veri = BS_Indexpage.Cart_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
		Common.pause(4);
		BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari"+randno+"@mailinator.com");
		
		Common.pause(1);
		BS_Veri = BS_Indexpage.Shipping_form_FirstName();
		BS_Veri = BS_Indexpage.Shipping_form_lastName();
		BS_Veri = BS_Indexpage.Shipping_form_Company();
		BS_Veri = BS_Indexpage.Shipping_form_Street1();
		/*BS_Veri = BS_Indexpage.Shipping_form_Street2();*/
		BS_Veri = BS_Indexpage.Shipping_form_City();
		BS_Veri = BS_Indexpage.Shipping_form_State();
		BS_Veri = BS_Indexpage.Shipping_form_Postcode();
		BS_Veri = BS_Indexpage.Shipping_form_Country();
		BS_Veri = BS_Indexpage.Shipping_form_Telephone();
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		//Common.logvf("Verify User is redirect on Payment Page");
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		
		logStep = BS_Indexpage.CreateAccountClick(logStep);
		Common.pause(1);
		Common.logvf("Verify User is getting message for Create Account Send Notification.");
		Common.pause(2);
		if(BS_Veri.Create_Account_Click_After_Verification_Msg())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		Common.pause(2);
		//open mailinator
		logStep = BS_Indexpage.OpenMailinator(logStep);
		BS_Veri = BS_Indexpage.MailinatorFirstMailClick();
		BS_Veri = BS_Indexpage.Mailinator_SetPassword_Link_Click();
		BS_Veri = BS_Indexpage.SetNewPassword("abcdef@123");
		BS_Veri = BS_Indexpage.SetConfirmPassword("abcdef@123");
		BS_Veri = BS_Indexpage.SetPasswordButtonClick();
		//Update password verification message
		
		Common.logvf("Verify User is getting message for Update the password successfully.");
		if(BS_Veri.Create_Account_Update_Password_VeriMsg())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		
	}
	
	
	
	@Test
	public void BasePath_AddProduct() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_6");
		
		Common.logcase("Testcase Name:Combined Product Add to Cart and Checkout.");

		Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		try {
			
			 BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		BS_Indexpage.VerifyHomepageLogo();
		//Home page Product
		logStep = BS_Indexpage.HomePageSimpleProductAddtoCart(logStep);
		BS_Veri=BS_Indexpage.Checkout_Popup_Closebtn_Click();
		//Common.pause(5);
		//Menu click then Simple product Click from List page
		//log("Select Simple Product from List page.");
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.pause(1);
		logStep = BS_Indexpage.AddtoCart(logStep);
		BS_Veri=BS_Indexpage.Checkout_Popup_Closebtn_Click();
		//Common.pause(5);
		Common.log("Select Configurable Product from Detail page.");
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.pause(1);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		BS_Veri = BS_Indexpage.ListofProduct();
		logStep = BS_Indexpage.ClickOnRandomProduct(logStep);
		BS_Veri = BS_Indexpage.FunctionalitySelection_Color();
		BS_Veri = BS_Indexpage.FunctionalitySelection_Size();
		BS_Veri = BS_Indexpage.FunctionalitySelection_ItemQuantity();
		if(targetBrowser.contains("iPhoneTablet")){
			
			logStep = BS_Indexpage.AddtoCartDEtailPage(logStep);
		}
		else
		{
			
			logStep = BS_Indexpage.AddtoCart(logStep);
		}
		BS_Veri=BS_Indexpage.Checkout_Popup_Closebtn_Click();
		/*//BS_Veri = BS_Indexpage.AddtoCart();
		BS_Veri = BS_Indexpage.AddtoCartDEtailPage();*/
		Common.log("Select Simple Product from Search result page.");
		Common.pause(10);
		logStep = BS_Indexpage.SearchBoxValue("simple product",logStep);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		logStep = BS_Indexpage.AddtoCart(logStep);
		Common.pause(1);
		BS_Veri = BS_Indexpage.Cart_ViewCart_Click();
		
		
		BS_Veri = BS_Indexpage.Cart_ProceedSummary_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shopping Details.");

		Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
		Common.pause(3);
	
		BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari"+randno+"@mailinator.com");
		Common.pause(1);
		BS_Veri = BS_Indexpage.Shipping_form_FirstName();
		BS_Veri = BS_Indexpage.Shipping_form_lastName();
		BS_Veri = BS_Indexpage.Shipping_form_Company();
		BS_Veri = BS_Indexpage.Shipping_form_Street1();
		/*BS_Veri = BS_Indexpage.Shipping_form_Street2();*/
		BS_Veri = BS_Indexpage.Shipping_form_City();
		BS_Veri = BS_Indexpage.Shipping_form_State();
		BS_Veri = BS_Indexpage.Shipping_form_Postcode();
		BS_Veri = BS_Indexpage.Shipping_form_Country();
		BS_Veri = BS_Indexpage.Shipping_form_Telephone();
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		//Common.logvf("Verify User is redirect on Payment Page");
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
		if(BS_Veri.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(4);
		
		//Create Account 
		logStep = BS_Indexpage.CreateAccountClick(logStep);
		Common.pause(1);
		Common.logvf("Verify User is getting message for Create Account Send Notification.");
		Common.pause(4);
		if(BS_Veri.Create_Account_Click_After_Verification_Msg())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		//open mailinator
		logStep = BS_Indexpage.OpenMailinator(logStep);
		BS_Veri = BS_Indexpage.MailinatorFirstMailClick();
		BS_Veri = BS_Indexpage.Mailinator_SetPassword_Link_Click();
		BS_Veri = BS_Indexpage.SetNewPassword("abcdef@123");
		BS_Veri = BS_Indexpage.SetConfirmPassword("abcdef@123");
		BS_Veri = BS_Indexpage.SetPasswordButtonClick();
		//Update password verification message
		
		Common.logvf("Verify User is getting message for Update the password successfully.");
		Common.pause(3);
		if(BS_Veri.Create_Account_Update_Password_VeriMsg())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
	}


/***************************************************************************************************************************************/
	
	//Scenario @@ 2 Login
	
	
	@Test
	public void Login_BasePath_Checkout() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_7");
		
		Common.logcase("Testcase Name: Login Before Shopping and Checkout.");

		Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		BS_Indexpage.verifyUrLOpened();
		Common.logstep("Step " + (logStep++) + " : Enter correct credentials");
		BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
		BS_Veri = BS_Indexpage.Bs_Login_Password();
		System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
		Common.logstep("Step " + (logStep++) + " : Click on 'Sign in' button.");
		logStep = BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
		System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
		BS_Indexpage.verifyLogin();
			 BS_Veri = BS_Indexpage.PopUpBox();
		
		//Home page Product
		/*BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
		Common.pause(4);*/
		//Menu click then Simple product Click from List page
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.logstep("Select Simple Product from List page.");
		Common.pause(1);
		logStep = BS_Indexpage.AddtoCart(logStep);
		Common.pause(1);
		
		logStep = BS_Indexpage.Cart_Checkout_Click(logStep);
		Common.pause(1);
		
		Common.logcase("Fill up the Shopping Details.");

		Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
		Common.pause(1);
	
	
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		Common.pause(4);
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		Common.pause(4);
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
		Common.pause(3);
		if(BS_Veri.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(4);
	}
		
		
		//Checkout time Login
		
		@Test
		public void CheckoutTime_BasePath_Login() throws IOException
		{
			
			
			Common.logcase("Testcase Id: TC_8");
			
			Common.logcase("Testcase Name: Login During the Checkout.");

			Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
			Common.pause(2);
			System.err.println("Hello");
								
			try {
				
				 BS_Veri = BS_Indexpage.PopUpBox();
			} catch (Exception e) {
				System.err.println("No Any Popup Generated");
			}
			BS_Indexpage.VerifyHomepageLogo();
			Common.logstep("Step " + (logStep++) + " :Select Product");
			//Home page Product
			/*BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
			Common.pause(4);*/
			//Menu click then Simple product Click from List page
			logStep = BS_Indexpage.ClickMenu(logStep);
			Common.logstep("Select Simple Product from List page.");
			Common.pause(1);
			logStep = BS_Indexpage.AddtoCart(logStep);
			Common.pause(2);
			
			logStep = BS_Indexpage.Cart_Checkout_Click(logStep);
			Common.pause(1);
			
			Common.logcase("Fill up the Shopping Details.");

			Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
			Common.pause(2);
		// kinnari131188490@mailinator.com
			BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari165774@mailinator.com");
			Common.pause(3);
			BS_Veri = BS_Indexpage.CheckOut_Passowrd();
			Common.pause(1);
			logStep = BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
			Common.pause(8);
			
			logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
			logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
			//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
			//log("Verify User is redirect on Payment Page");
			if(BS_Veri.Shipping_form_NextPageVerification())
			{
				logStatus(ITestStatus.PASSED);
			}
			else
			{
				logStatus(ITestStatus.FAILED);
			}
			Common.pause(4);
			logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
			
			BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
			logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
			Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
			if(BS_Veri.Shipping_form_NextPageSuccessVerification())
			{
				logStatus(ITestStatus.PASSED);
			}
			else
			{
				logStatus(ITestStatus.FAILED);
			}
			
			Common.pause(4);
			
		}
			
			/*************************************************************************************************************************/
			
			
			//Scenario @@ 3 For NEw Users 
			
			
			@Test
			public void NewUserCreate_BeforeCheckout() throws IOException
			{
				
				
				Common.logcase("Testcase Id: TC_9");
				
				Common.logcase("Testcase Name: New Account creation before Shopping and Checkout.");

				Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
				Common.pause(2);
				BS_Indexpage.verifyUrLOpened();
				Common.logstep("Step " + (logStep++) + " : Fill up the Valid details for new account creation.");
				BS_Veri = BS_Indexpage.Shipping_form_FirstName();
				BS_Veri = BS_Indexpage.Shipping_form_lastName();
				BS_Veri = BS_Indexpage.Shipping_form_DOB();
				BS_Veri = BS_Indexpage.CreateAccount_form_email("kinnari"+randno+"@mailinator.com");
				BS_Veri = BS_Indexpage.SetNewPassword("abcdef@123");
				BS_Veri = BS_Indexpage.SetConfirmPassword("abcdef@123");
				BS_Veri = BS_Indexpage.SetPasswordButtonClick();
				//Verification of New user register
				Common.logvf("Verify New User is register");
				if(BS_Veri.Create_Account_NewUser_Register_VeriMsg())
				{
					logStatus(ITestStatus.PASSED);
				}
				else
				{
					logStatus(ITestStatus.FAILED);
				}
				
				
				try {
					
					 BS_Veri = BS_Indexpage.PopUpBox();
				} catch (Exception e) {
					System.err.println("No Any Popup Generated");
				}
				//Home page Product
				//Menu click then Simple product Click from List page
				logStep = BS_Indexpage.ClickMenu(logStep);
				Common.log("Select Simple Product from List page.");
				Common.pause(1);
				logStep = BS_Indexpage.AddtoCart(logStep);
				Common.pause(2);
				
				logStep = BS_Indexpage.Cart_Checkout_Click(logStep);
				Common.pause(1);
				
				Common.logcase("Fill up the Shipping Details.");

				Common.logstep("Step " + (logStep++) + " :Shopping Form for Personal Details.");
				Common.pause(2);
			
				
				BS_Veri = BS_Indexpage.Shipping_form_Company();
				BS_Veri = BS_Indexpage.Shipping_form_Street1();
				/*BS_Veri = BS_Indexpage.Shipping_form_Street2();*/
				BS_Veri = BS_Indexpage.Shipping_form_City();
				BS_Veri = BS_Indexpage.Shipping_form_State();
				BS_Veri = BS_Indexpage.Shipping_form_Postcode();
				BS_Veri = BS_Indexpage.Shipping_form_Country();
				BS_Veri = BS_Indexpage.Shipping_form_Telephone();
				logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
				logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
				//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
				//log("Verify User is redirect on Payment Page");
				Common.pause(4);
				if(BS_Veri.Shipping_form_NextPageVerification())
				{
					logStatus(ITestStatus.PASSED);
				}
				else
				{
					logStatus(ITestStatus.FAILED);
				}
				
				logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
				logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
				Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
				Common.pause(3);
				if(BS_Veri.Shipping_form_NextPageSuccessVerification())
				{
					logStatus(ITestStatus.PASSED);
				}
				else
				{
					logStatus(ITestStatus.FAILED);
				}
				
				Common.pause(4);
				
			
			}
			
			// NEW Scenarios ***********************************************************************************
			
			
						@Test
						public void Account_MyOrder_VerifyCount() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_10");
							
							Common.logcase("Testcase Name: To verify after Place order it will Listed on My Order Page.");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
							BS_Veri = BS_Indexpage.PopUpBox();
							
							
							logStep = BS_Indexpage.Account_MyOrder_Click(logStep);
							
							int before_total_Size = BS_Indexpage.Account_MyOrder_GetTotal();
							//BS_Veri = BS_Indexpage.OrderSize();
							logStep = BS_Indexpage.ClickMenu(logStep);
							Common.pause(1);
							
							//BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
							logStep = BS_Indexpage.AddtoCart(logStep);
							Common.logstep("Step " + (logStep++) + " :Click on 'Checkout' button from dialog-box.");
							if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))){
								
								logStep = BS_Indexpage.Cart_Checkout_Click_Mobile(logStep);
							}
							else
							{
								
								logStep = BS_Indexpage.Cart_Checkout_Click_FullScreen(logStep);
							}
							
							logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
							logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
							//Common.logvf("Verify User is redirect on Payment Page");
							Common.pause(4);
							if(BS_Veri.Shipping_form_NextPageVerification())
							{
								logStatus(ITestStatus.PASSED);
							}
							else
							{
								logStatus(ITestStatus.FAILED);
							}
							
							logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
							
							BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
							logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
							Common.logvf("Verify User is getting Successfully Done 'Thank You' message.");
							Common.pause(3);
							if(BS_Veri.Shipping_form_NextPageSuccessVerification())
							{
								logStatus(ITestStatus.PASSED);
							}
							else
							{
								logStatus(ITestStatus.FAILED);
							}
							Common.logstep("Step " + (logStep++) + " :Redirect to 'My Order' Page , to verify 'Placed order is added into list .");
							//BS_Veri = BS_Indexpage.MoveToHomePage();
							Common.pause(1);
							
							if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
								
								logStep = BS_Indexpage.Account_MyOrder_Click(logStep);
							}
							else
							{
								
								logStep = BS_Indexpage.HomePage_UserIcon(logStep);
								logStep = BS_Indexpage.User_MyOrder_Click(logStep);
							}
							int after_total_Size = BS_Indexpage.Account_MyOrder_GetTotal();
							Common.logvf("Verify Placed order is Added into 'My order' List.");
							if (after_total_Size == (before_total_Size+1)) {
								logStatus(ITestStatus.PASSED);

							} else {
								logStatus(ITestStatus.FAILED);
								Assert.assertTrue(false, "Placed order has not listed on 'My Order' page.");
							}
							//BS_Veri = BS_Indexpage.Verify_PlaceOrder_Size();
							
							
				
						}
						
						//View ORDER Scenario
						@Test
						public void Account_MyOrder_ViewOrder() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_11");
							
							Common.logcase("Testcase Name: Functionality of 'View Order' of My Order Page.");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials and click on 'Sign In' button.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
								 BS_Veri = BS_Indexpage.PopUpBox();
							
							logStep = BS_Indexpage.Account_MyOrder_Click(logStep);
							int ordersize = BS_Indexpage.User_MyOrder_GetOrderTOTALSIZE();
							if(ordersize==0)
							{
								logStep = BS_Indexpage.ClickMenu(logStep);
								Common.pause(1);
								Common.logstep("Step " + (logStep++) + " :Select Product");
								//BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
								logStep = BS_Indexpage.AddtoCart(logStep);
								if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))){
									
									logStep = BS_Indexpage.Cart_Checkout_Click_Mobile(logStep);
								}
								else
								{
									
									logStep = BS_Indexpage.Cart_Checkout_Click_FullScreen(logStep);
								}
								
								logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
								logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
								//log("Verify User is redirect on Payment Page");
								Common.pause(4);
								if(BS_Veri.Shipping_form_NextPageVerification())
								{
									logStatus(ITestStatus.PASSED);
								}
								else
								{
									logStatus(ITestStatus.FAILED);
								}
								
								logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
								BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
								logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
								log("Verify User is getting Successfully Done 'Thank You' message.");
								Common.pause(3);
								if(BS_Veri.Shipping_form_NextPageSuccessVerification())
								{
									logStatus(ITestStatus.PASSED);
								}
								else
								{
									logStatus(ITestStatus.FAILED);
								}
								logStep = BS_Indexpage.Account_MyOrder_Click(logStep);
							}
							Common.logstep("Step " + (logStep++) + " :Fetch Exisitng Details of the Order.");
							BS_Veri = BS_Indexpage.User_MyOrder_GetOrderID();
							BS_Veri = BS_Indexpage.User_MyOrder_GetOrderAmount();
							logStep = BS_Indexpage.User_MyOrder_ViewOrderClick(logStep);
							Common.logstep("Step " + (logStep++) + " :Verify 'View Order' page order Details.");
							BS_Veri = BS_Indexpage.Verify_OrderID();
							BS_Veri = BS_Indexpage.Verify_OrderAmount();
							BS_Veri = BS_Indexpage.User_MyOrder_ViewOrder_Status();
						
						}

						//Add to cart Update quantity 
						@Test
						public void Account_MiniCart_UpdateDetails() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_12");
							
							Common.logcase("Testcase Name: Functionality to Update Quanitity of 'Mini Cart' of Add to Cart Page.");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials and click on 'Sign In' button.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
								 BS_Veri = BS_Indexpage.PopUpBox();
								 logStep = BS_Indexpage.ClickMenu(logStep);
									Common.pause(1);
									//BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
									logStep = BS_Indexpage.AddtoCart(logStep);
									Common.pause(4);
									logStep = BS_Indexpage.HomePage_MiniCartIcon_Click(logStep);
							
							Common.pause(3);
							logStep = BS_Indexpage.MiniCart_FetchCurrentData(logStep);
							int BeforeUpdate_ProductPrice = BS_Indexpage.ConvertStringTOInterger_PRICE();
							//BS_Veri = BS_Indexpage.SaveCurrentPrice();
							Common.logstep("Step " + (logStep++) + " :Update the Product Quantity.");
							BS_Veri = BS_Indexpage.MiniCart_UpdateQuantity();
							logStep = BS_Indexpage.MiniCart_UpdateButtonClick(logStep);
							int AfterUpdate_ProductPrice  = BS_Indexpage.ConvertStringTOInterger_PRICE();
							//BS_Veri = BS_Indexpage.SaveNewPrice();
							Common.logvf("Verify Product price is update as per the new quantity");
							if(AfterUpdate_ProductPrice>BeforeUpdate_ProductPrice)
							{
								logStatus(ITestStatus.PASSED);
							}
							else
							{
								logStatus(ITestStatus.FAILED);
							}
							//BS_Veri = BS_Indexpage.MiniCart_verifyAmount();
						}

						
						
						//Add to cart remove quantity
						@Test
						public void Account_MiniCart_RemoveProduct() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_13");
							
							Common.logcase("Testcase Name: Functionality to Remove Product from 'Mini Cart'.");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials and click on 'Sign In' button.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
								 BS_Veri = BS_Indexpage.PopUpBox();
								 logStep = BS_Indexpage.ClickMenu(logStep);
									Common.pause(1);
									//BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
									logStep = BS_Indexpage.AddtoCart(logStep);
									Common.pause(4);
							logStep = BS_Indexpage.HomePage_MiniCartIcon_Click(logStep);
							Common.pause(3);
							
							int minicart_Product = BS_Indexpage.MiniCart_Product_Size();
							Common.logstep("Step " + (logStep++) + " :Click on 'Remove' button.");
							BS_Veri = BS_Indexpage.MiniCartRemoveProductClick();
							if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
								
								BS_Veri = BS_Indexpage.MiniCartCloseBtn();
								
							}
							BS_Veri = BS_Indexpage.MiniCartRemoveProductConfirmation_OK();
							//Common.refresh(driver);
						Common.pause(3);
							Common.log("Before Remove total available product was:<b>"+minicart_Product+"</b>.");
							int after_deleteminicart_Product = BS_Indexpage.MiniCart_Product_Size();
							//logStep = BS_Indexpage.HomePage_MiniCartIcon_Click(logStep);
							//BS_Veri = BS_Indexpage.Minicart_RemoveProduct_Verification(minicart_Product,after_deleteminicart_Product);
							 Common.logvf("Verify Product is removed or not");
							 if(after_deleteminicart_Product<minicart_Product){
								 logStatus(ITestStatus.PASSED);
							 }
							 else
							 {
								 logStatus(ITestStatus.FAILED);
									Assert.assertTrue(false, " 'Remove' product from minicart functionality is not working. After deleting the product minicart counter remains same.");
							 }
						
						}

						
						//Add New Card information for  Store payment Information
						@Test
						public void Account_StorePayment_AddNewCardInfo() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_14");
							
							Common.logcase("Testcase Name: Functionality to Add New Card information for Store Payment. ");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials and click on 'Sign In' button.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
								 BS_Veri = BS_Indexpage.PopUpBox();
								 if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
										
									 logStep = BS_Indexpage.Menu_accountDashboard_sub_Mobile(logStep);
										
									}	 
								 
								 
							logStep = BS_Indexpage.Menu_account_StorePayment_click(logStep);			
							int beforeStorePaymetnSize = BS_Indexpage.StorePayment_Size();
							logStep = BS_Indexpage.StorePayment_AddNewCard(logStep);
							Common.logstep("Step " + (logStep++) + " : Enter correct new Details.");
							BS_Veri = BS_Indexpage.StorePayment_FirstName();
							BS_Veri = BS_Indexpage.StorePayment_LastName();
							BS_Veri = BS_Indexpage.StorePayment_Company();
							BS_Veri = BS_Indexpage.StorePayment_StreetAdd();
							BS_Veri = BS_Indexpage.StorePayment_city();
							BS_Veri = BS_Indexpage.StorePayment_State();
							BS_Veri = BS_Indexpage.StorePayment_ZipCode();
							BS_Veri = BS_Indexpage.StorePayment_Telephone();
							BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
							BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
							BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
							BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
							BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
							BS_Veri = BS_Indexpage.StorePayment_SaveCard_Btn_Click();
							Common.logvf("Verify the 'Success message'.");
							if(BS_Veri.Change_Email_Success_VeriMsg())
							{
								logStatus(ITestStatus.PASSED);
							}
							else
							{
								logStatus(ITestStatus.FAILED);
							}
							Common.log("Before add Store payment size was: <b>"+beforeStorePaymetnSize+"</b>.");
							int afterAddSize = BS_Indexpage.StorePayment_Size();
							Common.logvf("Verify newly added details are stored in 'Store Payment Method' Table.");
							
							//BS_Veri = BS_Indexpage.Menu_account_StorePayment_click();
							//BS_Veri = BS_Indexpage.StorePayment_Verify_CardDetails();
							if(afterAddSize>beforeStorePaymetnSize)
							{
								logStatus(ITestStatus.PASSED);
							}
							else
							{
								logStatus(ITestStatus.FAILED);
							}
							
						
						
						}

						//Delete Store payment Information
						@Test
						public void Account_StorePayment_DeleteInfo() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_15");
							
							Common.logcase("Testcase Name: To verify 'Delete' functionality of Store Payment Information. ");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials and click on 'Sign In' button.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
								 BS_Veri = BS_Indexpage.PopUpBox();
								 if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
										
									 logStep = BS_Indexpage.Menu_accountDashboard_sub_Mobile(logStep);
										
									}	 
								 
							
							logStep = BS_Indexpage.Menu_account_StorePayment_click(logStep);		
							int BeforeStorePaymentSize = BS_Indexpage.StorePayment_Size();
							
							logStep = BS_Indexpage.StorePayment_Delete_BtnClick(logStep);
							Common.log("Before 'Delete' Store payment size was: <b>"+BeforeStorePaymentSize+"</b>.");
							int AfterStorePaymentSize = BS_Indexpage.StorePayment_Size();
							Common.logvf("Verify 'Store Payment method' Size is Decrease.");
								if(AfterStorePaymentSize<BeforeStorePaymentSize)
								{
									logStatus(ITestStatus.PASSED);
									
								}
								else
								{
									logStatus(ITestStatus.FAILED);
									Assert.assertTrue(false, "'Delete card' functionality is not working");
									
								}
							//BS_Veri = BS_Indexpage.StorePayment_Size_Verify();
						
						
						}
						//WISHLSIT 
						@Test
						   
						   public void wishlist() throws IOException
						   {
						    
						    
						    Common.logcase("Testcase Id: TC_16");
						    
						    Common.logcase("Testcase Name: To verify 'Wishlist' functionality.");
						    
						    Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
						    Common.pause(2);
						    BS_Indexpage.verifyUrLOpened();
						    
						    
						    Common.logstep("Step " + (logStep++) + " : Enter correct credentials.");
						    BS_Indexpage.Bs_Login_EmailID();
						    
						    BS_Indexpage.Bs_Login_Password();
						    
						    logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
						    
						    BS_Indexpage.verifyLogin();
						    
						    logStep= BS_Indexpage.myWishListClick(logStep);
						    
						    int totalWishListProducts = BS_Indexpage.totalWishListProducts();
						    
						    System.err.println("before wish list number -----------:-"+totalWishListProducts);
						    
						       System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
						       
						       BS_Veri = BS_Indexpage.PopUpBox();
						       
						       //Common.logstep("Step " + (logStep++) + " : Click on 'Men' menu.");
						       logStep = BS_Indexpage.ClickMenu(logStep);
						       
						       Common.pause(1);
						       Common.logstep("Step " + (logStep++) + " :Select Product");
						       BS_Veri = BS_Indexpage.ListofProduct();

						       logStep = BS_Indexpage.ClickOnRandomProduct(logStep);
						       
						       logStep = BS_Indexpage.FunctionalitySelection_Color(logStep);
						       
						    logStep = BS_Indexpage.Select_Size(logStep);
						       
						       logStep = BS_Indexpage.addTiWishListLableClick(logStep);

						       BS_Indexpage. Create_Account_NewUser_Register_VeriMsg();
						       
						     //  BS_Indexpage.myWishListClick();
						    
						       Common.log("Total number of Wishlist items before:-"+totalWishListProducts);
						    int totalWishListProductsAfter = BS_Indexpage.totalWishListProducts();
						    Common.logvf("Verify selected item has been added to 'My wishlist'.");
						    if(totalWishListProductsAfter>totalWishListProducts){
						     logStatus(ITestStatus.PASSED);
						       }
						       else
						       {
						        logStatus(ITestStatus.FAILED);
						        Assert.assertTrue(false, "Selected item has not been added to 'My Wishlist'.");
						       }
						    
						    String CounterBefore=BS_Indexpage.AddtoCartCounter();
						    Common.log("Current Add to Cart Counter(Before adding all items to Cart):-<b>" + CounterBefore + "</b>");
						    
						    logStep = BS_Indexpage.addToCartWishList(logStep);
						    String CounterAfter=BS_Indexpage.AddtoCartCounter();
						    
						    Common.log("Current Add to Cart Counter(After adding all items to Cart):-<b>" + CounterAfter + "</b>");
						    Common.logvf("Verify all wish list items has been added to cart.");
						    if(Integer.valueOf(CounterAfter)>Integer.valueOf(CounterBefore)){
						     logStatus(ITestStatus.PASSED);
						       }
						       else
						       {
						        logStatus(ITestStatus.FAILED);
						        Assert.assertTrue(false, "Add all to cart button functionality is not working.");
						       }
						    
						    
						    
						    
						      
						   
						   }
						
						//DElete product from wishlist
						@Test
						   
						   public void wishlist_delete() throws IOException
						   {
						    
						    
						    Common.logcase("Testcase Id: TC_17");
						    
						    Common.logcase("Testcase Name: To verify 'Delete' functionality of 'Wishlist'.");
						    
						    Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
						    Common.pause(2);
						    BS_Indexpage.verifyUrLOpened();
						    
						    
						    Common.logstep("Step " + (logStep++) + " : Enter correct credentials.");
						    BS_Indexpage.Bs_Login_EmailID();
						    
						    BS_Indexpage.Bs_Login_Password();
						    
						    logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
						    
						    BS_Indexpage.verifyLogin();
						    
						    logStep= BS_Indexpage.myWishListClick(logStep);
						    
						    int totalWishListProducts = BS_Indexpage.totalWishListProducts();
						   int  totalWishListProductsAfter=0;
						    System.err.println("before wish list number -----------:-"+totalWishListProducts);
						    
						       System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
						       
						       BS_Veri = BS_Indexpage.PopUpBox();
						       if(totalWishListProducts<1)
						       {
						       //Common.logstep("Step " + (logStep++) + " : Click on 'Men' menu.");
						       logStep = BS_Indexpage.ClickMenu(logStep);
						       
						       Common.pause(1);
						       Common.logstep("Step " + (logStep++) + " :Select Product");
						       BS_Veri = BS_Indexpage.ListofProduct();

						       logStep = BS_Indexpage.ClickOnRandomProduct(logStep);
						       
						       logStep = BS_Indexpage.FunctionalitySelection_Color(logStep);
						       
						    logStep = BS_Indexpage.Select_Size(logStep);
						       
						       logStep = BS_Indexpage.addTiWishListLableClick(logStep);

						       BS_Indexpage. Create_Account_NewUser_Register_VeriMsg();
						       
						     //  BS_Indexpage.myWishListClick();
						    
						       Common.log("Total number of Wishlist items before:-"+totalWishListProducts);
						    totalWishListProductsAfter = BS_Indexpage.totalWishListProducts();
						    Common.logvf("Verify selected item has been added to 'My wishlist'.");
						    if(totalWishListProductsAfter>totalWishListProducts){
						     logStatus(ITestStatus.PASSED);
						       }
						       else
						       {
						        logStatus(ITestStatus.FAILED);
						        Assert.assertTrue(false, "Selected item has not been added to 'My Wishlist'.");
						       }
						       
						       }
						       else
						       {
						       totalWishListProductsAfter = BS_Indexpage.totalWishListProducts();
						       }
						       //Delete product
						    	logStep = BS_Indexpage.RemoveBtnClick(logStep);
						    	Common.log("Total number of Wishlist items before:-"+totalWishListProductsAfter);
						       int afterDeleteWishListProducts = BS_Indexpage.totalWishListProducts();
						       
						       Common.logvf("Verify selected item has been deleted from 'My wishlist'.");
						       if(afterDeleteWishListProducts<totalWishListProductsAfter)
						       {
						    	   logStatus(ITestStatus.PASSED);
						       }
						       else
						       {
						    	   logStatus(ITestStatus.FAILED);
							        Assert.assertTrue(false, "Selected item has not been deleted from 'My Wishlist'.");
						       }
						
						   }
						//Change Email ID 
						@Test
						public void Account_ChangeEmailID() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_18");
							
							Common.logcase("Testcase Name:To verify functionality of change the EmailID. ");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials and click on 'Sign In' button.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
								 BS_Veri = BS_Indexpage.PopUpBox();
								 
							//Common.logstep("Step " + (logStep++) + " :Change Email ID and Enter New one.");
							if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
								
								logStep = BS_Indexpage.Menu_accountDashboard_sub_Mobile(logStep);
								
							}
							
							logStep = BS_Indexpage.Menu_accountInformation(logStep);		
							Common.logstep("Step " + (logStep++) + " :Change Email ID and Enter New one.");
							BS_Veri = BS_Indexpage.Menu_accountChange_Email();
							BS_Veri = BS_Indexpage.CreateAccount_form_email("kinnariNew"+randno+"@mailinator.com");
							
							BS_Veri = BS_Indexpage.Menu_accountEnterPassword("abcdef@123");
							BS_Veri = BS_Indexpage.Menu_SaveBtn();
							Common.logvf("Verify the 'change Email-Id' successful message generate.");
							if(BS_Veri.Change_Email_Success_VeriMsg())
							{
								logStatus(ITestStatus.PASSED);
							}
							else
							{
								logStatus(ITestStatus.FAILED);
							}
							BS_Veri = BS_Indexpage.Menu_ChangeEmailVerification();
							Common.pause(3);
							if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
								
								logStep = BS_Indexpage.Menu_accountDashboard_sub_Mobile(logStep);
								
							}	
							logStep = BS_Indexpage.Menu_accountInformation(logStep);	
							Common.logstep("Step " + (logStep++) + " :Again change the 'Email-Id' and set existing one.");
							BS_Veri = BS_Indexpage.Menu_accountChange_Email();
							BS_Veri = BS_Indexpage.CreateAccount_form_email("kinnari165774@mailinator.com");
							BS_Veri = BS_Indexpage.Menu_accountEnterPassword("abcdef@123");
							BS_Veri = BS_Indexpage.Menu_SaveBtn();
							
							
						
						}
						
						//Change Email ID 
						@Test
						public void Account_ChangePassword() throws IOException
						{
							
							
							Common.logcase("Testcase Id: TC_19");
							
							Common.logcase("Testcase Name: Functionality to change the Password. ");

							Common.logstep("Step " + (logStep++) + " : Open URL is: <a>" + testUrl + "</a>");
							Common.pause(2);
							BS_Indexpage.verifyUrLOpened();
							Common.logstep("Step " + (logStep++) + " : Enter correct credentials and click on 'Sign In' button.");
							BS_Veri = BS_Indexpage.Bs_Login_EmailID();  // Static Email ID:-  kinnari12223@mailinator.com
							BS_Veri = BS_Indexpage.Bs_Login_Password();
							logStep= BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
							BS_Indexpage.verifyLogin();
							//BS_Veri = BS_Indexpage.Bs_Login_SignInButtonClick();
							System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
							
								 BS_Veri = BS_Indexpage.PopUpBox();
								 if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
										
									 logStep = BS_Indexpage.Menu_accountDashboard_sub_Mobile(logStep);
										
									}	 
								 
							logStep = BS_Indexpage.Menu_accountInformation(logStep);					
							Common.logstep("Step " + (logStep++) + " :Change Password and Enter New one.");
							BS_Veri = BS_Indexpage.Menu_account_Change_Password();
							BS_Veri = BS_Indexpage.Menu_accountEnterPassword("abcdef@123");
							BS_Veri = BS_Indexpage.SetNewPassword("baps@123");
							BS_Veri = BS_Indexpage.SetConfirmPassword("baps@123");
							
							BS_Veri = BS_Indexpage.Menu_SaveBtn();
							Common.logvf("Verify the 'change Password' successful message generate.");
							if(BS_Veri.Change_Email_Success_VeriMsg())
							{
								logStatus(ITestStatus.PASSED);
							}
							else
							{
								logStatus(ITestStatus.FAILED);
							}
							if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
								
								logStep = BS_Indexpage.Menu_accountDashboard_sub_Mobile(logStep);
								
							}	
							logStep = BS_Indexpage.Menu_accountInformation(logStep);	
							Common.logstep("Step " + (logStep++) + " :Again change the 'Password' and set existing one.");
							BS_Veri = BS_Indexpage.Menu_account_Change_Password();
							BS_Veri = BS_Indexpage.Menu_accountEnterPassword("baps@123");
							BS_Veri = BS_Indexpage.SetNewPassword("abcdef@123");
							BS_Veri = BS_Indexpage.SetConfirmPassword("abcdef@123");
							
							BS_Veri = BS_Indexpage.Menu_SaveBtn();
							
						}
			}

						