package com.Kleenex.BrandShop.Verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Kleenex.Init.Common;
import com.Kleenex.Init.AbstractPage;

public class Brandshop_verification extends AbstractPage {

	public Brandshop_verification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*@FindBy(xpath=".//*[@id='validate_address']/div[1]")*/
	@FindBy(xpath = ".//*[@id='md_cybersource']")
	
	public WebElement Next_page;
	
	
	public boolean Shipping_form_NextPageVerification()
	{
		Common.logvf("Verify user is redirect on 'Payment' Page.");
		if(Common.isElementDisplayed(Next_page))
			return true;
		else
			return false;
	}

	
	@FindBy(xpath="//span[contains(text(),'Thank you for your purchase!')]")
	public WebElement Next_page_Success;
	
	
	public boolean Shipping_form_NextPageSuccessVerification()
	{
		if(Common.isElementDisplayed(Next_page_Success))
			return true;
		else
			return false;
	}
	
	//create account verification
	

	@FindBy(xpath="//p[contains(.,'A letter with further instructions will be sent to your email.')]")
	public WebElement CreateAccountClickVeri;
	
	
	public boolean Create_Account_Click_After_Verification_Msg()
	{
		if(Common.isElementDisplayed(CreateAccountClickVeri))
			return true;
		else
			return false;
	}
	
//Verify the message after set the password for the new users
	@FindBy(xpath="//div[@class='message-success success message']/div[contains(text(),'You updated your password.')]")
	public WebElement CreateAccountUpdatePasswordVeri;
	
	
	public boolean Create_Account_Update_Password_VeriMsg()
	{
		if(Common.isElementDisplayed(CreateAccountUpdatePasswordVeri))
			return true;
		else
			return false;
	}
	
	//Verify that New user is register towards the site.
	
	@FindBy(xpath="//div[@class='message-success success message']/div[contains(text(),'Thank you for registering with Brandshop.')]")
	public WebElement CreateAccountNewUserRegister;
	
	
	public boolean Create_Account_NewUser_Register_VeriMsg()
	{
		if(Common.isElementDisplayed(CreateAccountNewUserRegister))
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@class='message-success success message']")
	public WebElement ChangePasswordSuccessMsg;
	
	
	public boolean Change_Email_Success_VeriMsg()
	{
		if(Common.isElementDisplayed(ChangePasswordSuccessMsg))
			return true;
		else
			return false;
	}

	
	
	
}



