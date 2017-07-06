package com.Kleenex.Init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import io.appium.java_client.AppiumDriver;

	
public abstract class AbstractPage extends SeleniumInit {

	public int DRIVER_WAIT = 1;

	/**
	 * Initialize UserAbstractPage.
	 * 
	 * @param Driver
	 *            .
	 */
	public AbstractPage(WebDriver driver) {
		this.driver =  driver;
		
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,
				DRIVER_WAIT);
		
		PageFactory.initElements(finder, this);
		System.out.println("======Abstract Page======");

	}
	
	
	
}
