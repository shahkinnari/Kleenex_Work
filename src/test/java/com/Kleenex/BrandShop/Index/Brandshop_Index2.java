package com.Kleenex.BrandShop.Index;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Kleenex.Init.Common;
import com.Kleenex.Init.ITestStatus;
import com.Kleenex.Init.SeleniumInit;

public class Brandshop_Index2 extends SeleniumInit {
	
	
	int numOfFailure = 0;
	int logStep = 1;
	int log=0;
	int TC_ID=
			1;
	int randno  = Common.generateRandomNumber(4);
	
	
	@Test
	public void BasePath_AddProduct() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_1");
		
		Common.logcase("Testcase Name: Add Simple Product from Home Page.");

		Common.logstep("Step " + (logStep++) + " : Open url is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		try {
			
			 BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		Common.logstep("Step " + (logStep++) + " :Select Product");
		//Home page Product
		logStep = BS_Indexpage.HomePageSimpleProductAddtoCart(logStep);
		Common.pause(5);
		//Menu click then Simple product Click from List page
		log("Select Simple Product from List page.");
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.pause(1);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		logStep = BS_Indexpage.AddtoCart(logStep);
		Common.pause(5);
		log("Select Configurable Product from Detail page.");
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.pause(1);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		BS_Veri = BS_Indexpage.ListofProduct();
		logStep = BS_Indexpage.ClickOnRandomProduct(logStep);
		BS_Veri = BS_Indexpage.FunctionalitySelection_Color();
		BS_Veri = BS_Indexpage.FunctionalitySelection_Size();
		BS_Veri = BS_Indexpage.FunctionalitySelection_ItemQuantity();
		logStep = BS_Indexpage.AddtoCart(logStep);
		log("Select Simple Product from Search result page.");
		Common.pause(10);
		logStep = BS_Indexpage.SearchBoxValue("Simple Product",logStep);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		logStep = BS_Indexpage.AddtoCart(logStep);
		Common.pause(1);
		BS_Veri = BS_Indexpage.Cart_ViewCart_Click();
		
		
		logStep = BS_Indexpage.Cart_Checkout_Click(logStep);
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shpping Form for Personal Details.");
		Common.pause(2);
	
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
		log("Verify User is redirect on Payment Page");
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		Common.logcase(" Fill up the Payment Details.");
		Common.logstep("Step " + (logStep++) + " :Shpping Form for Payment Details.");
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		log("Verify User is getting Successfully Done 'Thank You' message.");
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
		log("Verify User is getting message for Create Account Send Notification.");
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
		
		log("Verify User is getting message for Update the password successfully.");
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
		
		
		Common.logcase("Testcase Id: TC_1");
		
		Common.logcase("Testcase Name: Login Before Shopping and Checkout.");

		Common.logstep("Step " + (logStep++) + " : Open url is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		
		BS_Veri = BS_Indexpage.Bs_Login_EmailID();
		BS_Veri = BS_Indexpage.Bs_Login_Password();
		logStep = BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
		
		try {
			
			 BS_Veri = BS_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		Common.logstep("Step " + (logStep++) + " :Select Product");
		//Home page Product
		/*BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
		Common.pause(4);*/
		//Menu click then Simple product Click from List page
		log("Select Simple Product from List page.");
		logStep = BS_Indexpage.ClickMenu(logStep);
		Common.pause(1);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		logStep = BS_Indexpage.AddtoCart(logStep);
		Common.pause(2);
		/*log("Select Configurable Product from Detail page.");
		BS_Veri = BS_Indexpage.ClickMenu();
		Common.pause(1);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		BS_Veri = BS_Indexpage.ListofProduct();
		BS_Veri = BS_Indexpage.ClickOnRandomProduct();
		BS_Veri = BS_Indexpage.FunctionalitySelection_Color();
		BS_Veri = BS_Indexpage.FunctionalitySelection_Size();
		BS_Veri = BS_Indexpage.FunctionalitySelection_ItemQuantity();
		BS_Veri = BS_Indexpage.AddtoCart();
		log("Select Simple Product from Search result page.");
		Common.pause(4);
		BS_Veri = BS_Indexpage.SearchBoxValue("Simple Product");
		Common.logstep("Step " + (logStep++) + " :Select Product");
		BS_Veri = BS_Indexpage.AddtoCart();
		Common.pause(2);
		BS_Veri = BS_Indexpage.Cart_ViewCart_Click();
		
		*/
		logStep = BS_Indexpage.Cart_Checkout_Click(logStep);
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shpping Form for Personal Details.");
		Common.pause(2);
	
	/*	BS_Veri = BS_Indexpage.Shipping_form_emailID();
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
		BS_Veri = BS_Indexpage.Shipping_form_Telephone();*/
		logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
		logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		log("Verify User is redirect on Payment Page");
		if(BS_Veri.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		Common.logcase(" Fill up the Payment Details.");
		Common.logstep("Step " + (logStep++) + " :Shpping Form for Payment Details.");
		logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
		/*BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();*/
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
		log("Verify User is getting Successfully Done 'Thank You' message.");
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
			
			
			Common.logcase("Testcase Id: TC_2");
			
			Common.logcase("Testcase Name: Login During the Checkout.");

			Common.logstep("Step " + (logStep++) + " : Open url is: <a>" + testUrl + "</a>");
			Common.pause(2);
			System.err.println("Hello");
								
			try {
				
				 BS_Veri = BS_Indexpage.PopUpBox();
			} catch (Exception e) {
				System.err.println("No Any Popup Generated");
			}
			Common.logstep("Step " + (logStep++) + " :Select Product");
			//Home page Product
			/*BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
			Common.pause(4);*/
			//Menu click then Simple product Click from List page
			log("Select Simple Product from List page.");
			logStep = BS_Indexpage.ClickMenu(logStep);
			Common.pause(1);
			Common.logstep("Step " + (logStep++) + " :Select Product");
			logStep = BS_Indexpage.AddtoCart(logStep);
			Common.pause(2);
			/*log("Select Configurable Product from Detail page.");
			BS_Veri = BS_Indexpage.ClickMenu();
			Common.pause(1);
			Common.logstep("Step " + (logStep++) + " :Select Product");
			BS_Veri = BS_Indexpage.ListofProduct();
			BS_Veri = BS_Indexpage.ClickOnRandomProduct();
			BS_Veri = BS_Indexpage.FunctionalitySelection_Color();
			BS_Veri = BS_Indexpage.FunctionalitySelection_Size();
			BS_Veri = BS_Indexpage.FunctionalitySelection_ItemQuantity();
			BS_Veri = BS_Indexpage.AddtoCart();
			log("Select Simple Product from Search result page.");
			Common.pause(4);
			BS_Veri = BS_Indexpage.SearchBoxValue("Simple Product");
			Common.logstep("Step " + (logStep++) + " :Select Product");
			BS_Veri = BS_Indexpage.AddtoCart();
			Common.pause(2);
			BS_Veri = BS_Indexpage.Cart_ViewCart_Click();
			
			*/
			logStep = BS_Indexpage.Cart_Checkout_Click(logStep);
			Common.pause(1);
			
			Common.logcase("Fill up the Shipping Details.");

			Common.logstep("Step " + (logStep++) + " :Shpping Form for Personal Details.");
			Common.pause(2);
		
			BS_Veri = BS_Indexpage.Shipping_form_emailID("kinnari131188490@mailinator.com");
			Common.pause(3);
			BS_Veri = BS_Indexpage.CheckOut_Passowrd();
			Common.pause(1);
			logStep = BS_Indexpage.Bs_Login_SignInButtonClick(logStep);
			Common.pause(8);
			/*BS_Veri = BS_Indexpage.Shipping_form_FirstName();
			BS_Veri = BS_Indexpage.Shipping_form_lastName();
			BS_Veri = BS_Indexpage.Shipping_form_Company();
			BS_Veri = BS_Indexpage.Shipping_form_Street1();
			BS_Veri = BS_Indexpage.Shipping_form_Street2();
			BS_Veri = BS_Indexpage.Shipping_form_City();
			BS_Veri = BS_Indexpage.Shipping_form_State();
			BS_Veri = BS_Indexpage.Shipping_form_Postcode();
			BS_Veri = BS_Indexpage.Shipping_form_Country();
			BS_Veri = BS_Indexpage.Shipping_form_Telephone();*/
			logStep = BS_Indexpage.Shipping_form_ShippingMethod(logStep);
			logStep = BS_Indexpage.Shipping_form_NextBtn(logStep);
			//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
			log("Verify User is redirect on Payment Page");
			if(BS_Veri.Shipping_form_NextPageVerification())
			{
				logStatus(ITestStatus.PASSED);
			}
			else
			{
				logStatus(ITestStatus.FAILED);
			}
			Common.logcase(" Fill up the Payment Details.");
			Common.logstep("Step " + (logStep++) + " :Shpping Form for Payment Details.");
			logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
			/*BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
			BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
			BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
			BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();*/
			BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
			logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
			log("Verify User is getting Successfully Done 'Thank You' message.");
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
				
				
				Common.logcase("Testcase Id: TC_1");
				
				Common.logcase("Testcase Name: New Account creation before Shopping and Checkout.");

				Common.logstep("Step " + (logStep++) + " : Open url is: <a>" + testUrl + "</a>");
				Common.pause(2);

				BS_Veri = BS_Indexpage.Shipping_form_FirstName();
				BS_Veri = BS_Indexpage.Shipping_form_lastName();
				BS_Veri = BS_Indexpage.Shipping_form_DOB();
				BS_Veri = BS_Indexpage.CreateAccount_form_email("kinnari"+randno+"@mailinator.com");
				BS_Veri = BS_Indexpage.SetNewPassword("abcdef@123");
				BS_Veri = BS_Indexpage.SetConfirmPassword("abcdef@123");
				BS_Veri = BS_Indexpage.SetPasswordButtonClick();
				//Verification of New user register
				log("Verify New User is register");
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
				Common.logstep("Step " + (logStep++) + " :Select Product");
				//Home page Product
				//Menu click then Simple product Click from List page
				log("Select Simple Product from List page.");
				logStep = BS_Indexpage.ClickMenu(logStep);
				Common.pause(1);
				Common.logstep("Step " + (logStep++) + " :Select Product");
				logStep = BS_Indexpage.AddtoCart(logStep);
				Common.pause(2);
				/*log("Select Configurable Product from Detail page.");
				BS_Veri = BS_Indexpage.ClickMenu();
				Common.pause(1);
				Common.logstep("Step " + (logStep++) + " :Select Product");
				BS_Veri = BS_Indexpage.ListofProduct();
				BS_Veri = BS_Indexpage.ClickOnRandomProduct();
				BS_Veri = BS_Indexpage.FunctionalitySelection_Color();
				BS_Veri = BS_Indexpage.FunctionalitySelection_Size();
				BS_Veri = BS_Indexpage.FunctionalitySelection_ItemQuantity();
				BS_Veri = BS_Indexpage.AddtoCart();
				log("Select Simple Product from Search result page.");
				Common.pause(4);
				BS_Veri = BS_Indexpage.SearchBoxValue("Simple Product");
				Common.logstep("Step " + (logStep++) + " :Select Product");
				BS_Veri = BS_Indexpage.AddtoCart();
				Common.pause(2);
				BS_Veri = BS_Indexpage.Cart_ViewCart_Click();
				*/
				
				logStep = BS_Indexpage.Cart_Checkout_Click(logStep);
				Common.pause(1);
				
				Common.logcase("Fill up the Shipping Details.");

				Common.logstep("Step " + (logStep++) + " :Shpping Form for Personal Details.");
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
				log("Verify User is redirect on Payment Page");
				if(BS_Veri.Shipping_form_NextPageVerification())
				{
					logStatus(ITestStatus.PASSED);
				}
				else
				{
					logStatus(ITestStatus.FAILED);
				}
				Common.logcase(" Fill up the Payment Details.");
				Common.logstep("Step " + (logStep++) + " :Shpping Form for Payment Details.");
				logStep = BS_Indexpage.Shipping_form_Payment_Method(logStep);
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
				BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
				logStep = BS_Indexpage.Shipping_form_Payment_PlaceOrder(logStep);
				log("Verify User is getting Successfully Done 'Thank You' message.");
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

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
