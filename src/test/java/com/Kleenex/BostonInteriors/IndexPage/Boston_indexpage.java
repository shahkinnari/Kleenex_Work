package com.Kleenex.BostonInteriors.IndexPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Kleenex.BostonInteriors.Verification.Boston_verification;
import com.Kleenex.BrandShop.Verification.Brandshop_verification;
import com.Kleenex.Init.AbstractPage;
import com.Kleenex.Init.Common;

public class Boston_indexpage extends AbstractPage {

	public Boston_indexpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="(//div[@class='modal-inner-wrap']//header//button)[2] or //img[@class='close-modal'")
	//(//button[@class='action-close'])[2]
	public WebElement PopUP;
	public Boston_verification  PopUpBox() throws IOException {
		Common.pause(2);
		if(Common.isElementDisplayed(PopUP))
		{
			System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
			Common.clickOn(driver, PopUP);
		}
		else
		{
			System.err.println("No Any Popup Generated");
		}
		/*Common.pause(1);
		Common.waitForElement(driver, PopUP);
		System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
		Common.pause(1);
		Common.clickOn(driver, PopUP);  */
		log("Clicked on <b>" + "popup dialog box "+" </b> for close it.");
		
	
		return new Boston_verification(driver);
	}
	
	
}
