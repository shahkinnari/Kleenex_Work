package com.Kleenex.BostonInteriors.Index;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import com.Kleenex.Init.Common;
import com.Kleenex.Init.ITestStatus;
import com.Kleenex.Init.SeleniumInit;

public class Boston_Index extends SeleniumInit {

	int numOfFailure = 0;
	int logStep = 1;
	int log=0;
	int TC_ID=1;
	//00000000000000000000000000000000000dskfjdnfkfde
	String randno1 = RandomStringUtils.randomNumeric(4);
	
	String randno  = RandomStringUtils.randomNumeric(6);
	

	@Test
	public void AddSimpleProd_HomePage() throws IOException, InterruptedException
	{
		
		
		Common.logcase("Testcase Id: TC_1");
		
		Common.logcase("Testcase Name: Add Simple Product from Home Page.");

		Common.logstep("Step " + (logStep++) + " : Open url is: <a>" + testUrl + "</a>");
		Common.pause(5);
		System.err.println("Hello");
		try {
			System.err.println("in try");
			BI_veri = BI_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		Common.logstep("Step " + (logStep++) + " :Select Product");
		//BS_Veri = BS_Indexpage.AddtoCart();
		/*BS_Veri = BS_Indexpage.HomePageSimpleProductAddtoCart();
	
if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iphoneMobile"))){
			
			BS_Veri = BS_Indexpage.Cart_Checkout_Click_Mobile();
		}
		else
		{
			
			BS_Veri = BS_Indexpage.Cart_Checkout_Click_FullScreen();
		}

		
		//BS_Veri = BS_Indexpage.Cart_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shipping Form for Personal Details.");
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
		BS_Veri = BS_Indexpage.Shipping_form_ShippingMethod();
		BS_Veri = BS_Indexpage.Shipping_form_NextBtn();
		//BS_Veri = BS_Veri.Shipping_form_NextPageVerification();
		log("Verify User is redirect on Payment Page");
		Common.pause(4);
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
		BS_Veri = BS_Indexpage.Shipping_form_Payment_Method();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardType();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardNumber();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireMonth();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardExpireYear();
		BS_Veri = BS_Indexpage.Shipping_form_CreditCardVerifCode();
		BS_Veri = BS_Indexpage.Shipping_form_Payment_PlaceOrder();
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
		
		

	
	
	
	
	
	
	
	
*/	
	}
}
