/*package com.Kleenex.BrandShop.IndexPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Kleenex.BrandShop.Verification.Brandshop_verification;
import com.Kleenex.Init.Common;
import com.Kleenex.Init.AbstractPage;

public class Brandshop_indexpage22 extends AbstractPage {

	public Brandshop_indexpage22(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="(//div[@class='modal-inner-wrap']//header//button)[2]")
	//(//button[@class='action-close'])[2]
	public WebElement PopUP;
	public Brandshop_verification  PopUpBox() throws IOException {
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
		Common.pause(1);
		Common.waitForElement(driver, PopUP);
		System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
		Common.pause(1);
		Common.clickOn(driver, PopUP);  
		log("Clicked on <b>" + "popup dialog box "+" </b> for close it.");
		
	
		return new Brandshop_verification(driver);
	}
	
	
	//Home page Simple Product
	 
	 @FindBy(xpath="//a[@class='product-item-link' and contains(.,'Simple Product')]/../..//button/span")
	 public WebElement HomePageSimpleProduct;
	 
	 @FindBy(xpath="(//i[@class='i-chev-right-thin'])[4]") // For mobile click on right arrow for getting product
	 public WebElement HomePage_Mobile_RightArrow;
	 public Brandshop_verification HomePageSimpleProductAddtoCart() throws IOException {
	  //Common.pause(1);
	 // driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[3]")).click();
	 
		  if(targetBrowser.contains("androidMobile")|| (targetBrowser.contains("iphoneMobile"))||(targetBrowser.contains("androidTablet"))){
			  Common.waitForElement(driver, HomePage_Mobile_RightArrow);
		  Common.scrollToVertical(driver, HomePage_Mobile_RightArrow);
		  Common.clickOn(driver, HomePage_Mobile_RightArrow);
		  Common.pause(1);
		  }
 
		 
		 Common.waitForElement(driver, HomePageSimpleProduct);
	  Common.scrollToVertical(driver, HomePageSimpleProduct);
	  Common.clickOn(driver, HomePageSimpleProduct);
	  //Common.waitForElement(driver, Cart_checkOut);
	  //driver.findElement(By.xpath("//button[@class='action primary checkout' and contains(.,'CHECKOUT')]")).click();
	 	//	Common.highlightElement(driver,Cart_checkOut);
		//Common.clickOn(driver, Cart_checkOut); 
	  
	  
	  
	  //Common.clickOn(driver, driver.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]")));
	  
	  
	  
	  log("Clicked on <b>" + "Simple Product "+" </b> From Home page.");
	  return new Brandshop_verification(driver);
	 }
	 
	 public Brandshop_verification HomePageSimpleProductAddtoCart1() throws IOException {
		  //Common.pause(1);
		 // driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[3]")).click();
		  Common.waitForElement(driver, HomePageSimpleProduct);
		  Common.scrollToVertical(driver, HomePageSimpleProduct);
		  Common.clickOn(driver, HomePageSimpleProduct);
		  //Common.waitForElement(driver, Cart_checkOut);
		  //driver.findElement(By.xpath("//button[@class='action primary checkout' and contains(.,'CHECKOUT')]")).click();
		 	//	Common.highlightElement(driver,Cart_checkOut);
			//Common.clickOn(driver, Cart_checkOut); 
		  	//Common.clickOn(driver, driver.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]")));
		  log("Clicked on <b>" + "Simple Product "+" </b> From Home page.");
		  return new Brandshop_verification(driver);
		 }
	
	@FindBy(xpath="//span[contains(.,'Men')]/..")
	public WebElement Menu_Men;
	@FindBy(xpath="//span[@class='action nav-toggle']")
	public WebElement Menu_Android;
	
	@FindBy(xpath="//span[contains(text(),'Men')]")
	public WebElement Men_Android;
	
	@FindBy(xpath="//a[contains(text(),'All Men')]")
	public WebElement AllMen_Android;

	
	public Brandshop_verification ClickMenu() throws IOException {
		
if((targetBrowser.contains("androidMobile")) || (targetBrowser.contains("iphoneMobile"))||(targetBrowser.contains("androidTablet"))){
			
			System.err.println("Inside android -------11");
			
			Common.pause(1);
			 Common.waitForElement(driver, Menu_Android);
			Common.highlightElement(driver, Menu_Android);
			Menu_Android.click();
			log("Clicked on <b>" + "Menu"+" </b> icon.");
			Common.pause(1);
			 Common.waitForElement(driver, Men_Android);
			Common.highlightElement(driver, Men_Android);
			Men_Android.click();
			log("Clicked on <b>" + "Men"+" </b> lable.");
			Common.waitForElement(driver, AllMen_Android);
			Common.highlightElement(driver, AllMen_Android);
			AllMen_Android.click();
			log("Clicked on <b>" + "All Men"+" </b> link.");
			
			Common.pause(3);
		}else{
		

		Common.pause(1);
		//Common.findAndSwitchToSecondWindow(driver, )
		System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
		System.out.println("WELCOME");
		Common.waitForElement(driver, Menu_Men);
		Common.pause(3);
		Common.clickOn(driver, Menu_Men);  
		log("Clicked on <b>" + "Men Link "+" </b> From Menu bar.");
		}
		return new Brandshop_verification(driver);
	}
	
	//List of product on PLP page..
	
	@FindBy(xpath="//a[@class='product-item-link']")
	public List<WebElement> ProductItemList;
	public Brandshop_verification ListofProduct() throws IOException {
		Common.pause(3);
		System.out.println("Product List Size is: "+ProductItemList.size());
		Common.pause(1);
		log("Product List size is: <b>" +ProductItemList.size() +" </b>.");
		return new Brandshop_verification(driver);
	}
	
	//Randomly Select the product
	public Brandshop_verification ClickOnRandomProduct() throws IOException {
		Common.pause(3);
		int RandomNumber = Common.randBetween(1,7);
		System.out.println("Generated Random Number is: "+RandomNumber);
		Common.pause(1);
		Common.waitForElement(driver, ProductItemList.get(RandomNumber));
		Common.pause(1);
		Common.scrollToVertical(driver,ProductItemList.get(RandomNumber));
		log("Clicked on <b>"+ProductItemList.get(RandomNumber).getText()+"</b>.");
		Common.clickOn(driver, ProductItemList.get(RandomNumber));
		return new Brandshop_verification(driver);
	}
	
	//Search Button for search Product
	
	@FindBy(xpath="//input[@name='q']")
	public WebElement SearchBox;
	
	@FindBy(xpath="//label[@data-role='minisearch-label']")
	public WebElement SearchIcon;
	
	
	
	public Brandshop_verification SearchBoxValue(String prodName) throws IOException {
		if(targetBrowser.contains("androidMobile") || targetBrowser.contains("iphoneMobile")||(targetBrowser.contains("androidTablet"))){
			Common.pause(2);
			Common.waitForElement(driver, SearchIcon);
			SearchIcon.click();
			Common.pause(1);
			SendsKEY(SearchBox, prodName);
			Common.pause(1);
			System.out.println("Search for the product : <b> "+prodName + "</b>.");
			Common.pause(3); 
			SearchBox.sendKeys(Keys.ENTER);
		}else{
		

		Common.pause(1);
		Common.waitForElement(driver, SearchBox);
		SendsKEY(SearchBox, prodName);
		Common.pause(1);
		System.out.println("Search for the product : <b> "+prodName + "</b>.");
		Common.pause(1);
		SearchBox.sendKeys(Keys.ENTER);
		}
		return new Brandshop_verification(driver);
	}
	
	
	
	
	//For Other Functionality Configurations
	
	
	@FindBy(xpath="//div[@class='swatch-option color']")
	public WebElement ColorSelection;
	
	@FindBy(xpath="//div[@class='swatch-option text']")
	public WebElement SizeSelection;
	
	@FindBy(xpath="//input[@name='qty']")
	public WebElement ItemQuantity;
	
	public Brandshop_verification FunctionalitySelection_Color() throws IOException {
		try {
			Common.waitForElement(driver, ColorSelection);
			if(ColorSelection.isDisplayed())
			{
				Common.waitForElement(driver, ColorSelection);
				Common.clickOn(driver,ColorSelection );
				Common.pause(1);
				log("Color is Selected");
			}
		} catch (Exception e) {
			log("No Other Configurations are Available.");
		}
		return new Brandshop_verification(driver);
	}
	

	public Brandshop_verification FunctionalitySelection_Size() throws IOException {
		
		try {
			Common.waitForElement(driver, SizeSelection);
			if(SizeSelection.isDisplayed())
			{
				Common.waitForElement(driver, SizeSelection);
				Common.clickOn(driver,SizeSelection );
				Common.pause(1);
				log("Size is Selected");
			}
		} catch (Exception e) {
			
			log("No Other Configurations are Available.");
		}
		return new Brandshop_verification(driver);
	}
			
	
	public Brandshop_verification FunctionalitySelection_ItemQuantity() throws IOException {
		
		try {
			Common.waitForElement(driver, ItemQuantity);
			if(ItemQuantity.isDisplayed())
			{
				ItemQuantity.clear();
				Common.pause(1);
				ItemQuantity.sendKeys("2");
				Common.pause(1);
				log("Quanitity of the Item is: <b>"+ItemQuantity.getAttribute("value")+"</b>.");
			}
		} catch (Exception e) {
			
			log("No Other Configurations are Available.");
		}
		return new Brandshop_verification(driver);
		}
			
	
	
	@FindBy(xpath="(//button[@title='Add to Cart'])[1]")
	public WebElement Menu_men_Addtocart;
	
	@FindBy(xpath="(//button[@title='Add to Cart'])[2]")
	public WebElement Menu_men_Addtocart_Failed;
	
	@FindBy(xpath="(//button[@id='product-addtocart-button'])[1]")
	public WebElement Menu_men_Addtocart_Mobile;
	
	@FindBy(xpath="(//a[@class='product-item-link'])[1]")
	public WebElement Menu_men_ProductName;
	public Brandshop_verification AddtoCart() throws IOException {
		Common.pause(2);
		if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iphoneMobile"))||(targetBrowser.contains("androidTablet"))){
			Common.waitForElement(driver, Menu_men_Addtocart);
			System.err.println("Inside IFFFFFFFFFFFFF Clicked");
			//Common.scrollToVertical(driver, Menu_men_Addtocart_Mobile);
			Common.highlightElement(driver, Menu_men_Addtocart);
			Common.pause(3);
			Common.clickOn(driver, Menu_men_Addtocart); 
			
			}
		else
		{

		Common.waitForElement(driver, Menu_men_Addtocart);
		Common.scrollToVertical(driver,Menu_men_Addtocart);
		//Common.highlightElement(driver, Menu_men_Addtocart);
		Common.highlightElement(driver, Menu_men_Addtocart);
		Common.pause(2);
		Menu_men_Addtocart.click();
		//Common.clickOn(driver, Menu_men_Addtocart);  
		System.err.println("Inside Clicked");
			
			Common.waitForElement(driver, Menu_men_Addtocart_Mobile);
			Common.scrollToVertical(driver,Menu_men_Addtocart_Mobile);
			Common.pause(3);
			//Common.highlightElement(driver, Menu_men_Addtocart);
			System.err.println("Inside Clicked FOr ADD TO Cartttttttttttttttttttttttt");
			Common.highlightElement(driver, Menu_men_Addtocart_Mobile);
			Common.pause(3);
			
			//Menu_men_Addtocart_Mobile.click();
			//Common.clickOn(driver, Menu_men_Addtocart);  
			System.err.println("Inside Clicked");
			driver.findElement(By.xpath("//button[@type='submit' and @title='Add to Cart']")).click();
		}
		log("Click on <b>"+"Add to Cart "+"</b> button.");
		return new Brandshop_verification(driver);
	}


	public Brandshop_verification AddtoCartDEtailPage() throws IOException {
		
		System.err.println("Inside Clicked FOr ADD TO Cartttttttttttttttttttttttt");
		Common.highlightElement(driver, Menu_men_Addtocart_Mobile);
		Common.pause(2);
		
		//Menu_men_Addtocart_Mobile.click();
		//Common.clickOn(driver, Menu_men_Addtocart);  
		System.err.println("Inside Clicked");
		driver.findElement(By.xpath("//button[@type='submit' and @title='Add to Cart']")).click();
		log("Click on <b>"+"Add to Cart "+"</b> button.");
		return new Brandshop_verification(driver);
	}
	
	public Brandshop_verification AddtoCartFailed() throws IOException {
		Common.pause(3);
		Common.waitForElement(driver, Menu_men_Addtocart_Failed);
		Common.highlightElement(driver, Menu_men_Addtocart_Failed);
		Common.pause(3);
		log("Select Product as: <b>" + Menu_men_ProductName.getText()+" </b> From list of Product.");
		Common.pause(1);
		Common.clickOn(driver, Menu_men_Addtocart_Failed);  
		log("Click on <b>"+"Add to Cart "+"</b> button.");
		return new Brandshop_verification(driver);
	}
	
	
	//View cart Link Click On
	
	@FindBy(xpath="//a[contains(.,'View Cart')]")
	public WebElement ViewCart;
	
	@FindBy(xpath="//a[@class='action showcart']")
	public WebElement ViewCart_Mobile;
	public Brandshop_verification Cart_ViewCart_Click() throws IOException {
		Common.waitForElement(driver, ViewCart);
		Common.highlightElement(driver,ViewCart);
		Common.clickOn(driver, ViewCart);  
		log("Click on <b>"+"ViewCart"+"</b> Link.");
		Common.pause(2);
		return new Brandshop_verification(driver);
	}
	
	
			@FindBy(xpath="(//div[@class='modal-content'])[2]//button[contains(text(),'CHECKOUT')]")
			public WebElement Cart_checkOut;
			
			@FindBy(xpath="(//*[@class='action primary checkout'])[2]")
			public WebElement Cart_checkOut_An;
			
			
			
			@FindBy(xpath="(//button[contains(.,'Checkout')])[2]")
			public WebElement Cart_ProceedTOCheckOut;
			
			@FindBy(xpath="//div[@class='cart-summary']")
			public WebElement Cart_Summary;
			
			public Brandshop_verification Cart_Checkout_Click_Mobile() throws IOException {
				Common.waitForElement(driver, Cart_checkOut_An);
				Common.clickOn(driver, Cart_checkOut_An);
				Common.pause(3);
				return new Brandshop_verification(driver);
			}
			@FindBy(xpath="//button[contains(text(),'CHECKOUT')]")
			public WebElement Cart_CheckOut_AWS;
			public Brandshop_verification Cart_Checkout_Click_FullScreen() throws IOException {
				
				
				Common.waitForElement(driver, Cart_CheckOut_AWS);
				Common.clickOn(driver, Cart_CheckOut_AWS);
				Common.pause(3);
				log("Click on <b>"+"CheckOut"+"</b> button.");
				return new Brandshop_verification(driver);
			}
			

			
			public Brandshop_verification Cart_Checkout_Click() throws IOException {
				
				if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iphoneMobile"))||(targetBrowser.contains("androidTablet"))){
					Common.waitForElement(driver, Cart_checkOut_An);
					Common.jsClick(driver, Cart_checkOut_An);
					if(Common.isElementNotDisplayed(Cart_checkOut_An)){
						do {
							AddtoCart();
							Common.jsClick(driver, Cart_checkOut_An);
						} while (Common.isElementNotDisplayed(Menu_men_Addtocart));
					}
					//Cart_checkOut_An.click();
				}else{
				
				if(Common.isElementDisplayed(Cart_checkOut))
				{
					Common.waitForElement(driver, Cart_checkOut);
					Common.highlightElement(driver,Cart_checkOut);
					Common.jsClick(driver, Cart_checkOut);
					//Common.clickOn(driver, Cart_checkOut);  
					System.err.println("Inside normal CheckOut");
					Common.pause(1);
					log("Click on <b>"+"CheckOut"+"</b> button.");
					
					if(Common.isElementNotDisplayed(Cart_checkOut_An)){
						do {
							AddtoCart();
							Common.jsClick(driver, Cart_checkOut_An);
						} while (Common.isElementDisplayed(Menu_men_Addtocart));
					}
				}
				else if(Common.isElementDisplayed(Cart_Summary))
				{
					System.err.println("Inside the Summary checkout");
					Common.jsClick(driver, Cart_ProceedTOCheckOut);
					//Common.clickOn(driver, Cart_ProceedTOCheckOut);  
					log("Proceed for Checkout with number of products");
				}
				}
				Common.pause(1);

				
				
				
				
				
				Common.waitForElement(driver, Cart_checkOut);
				Common.highlightElement(driver,Cart_checkOut);
				Common.clickOn(driver, Cart_checkOut);  
				Common.pause(1);
				log("Click on <b>"+"CheckOut"+"</b> button.");
				Common.pause(3);
				
				
				
				if(Common.isElementDisplayed(Cart_Summary))
				{
					Common.highlightElement(driver,Cart_ProceedTOCheckOut);
					Common.clickOn(driver, Cart_ProceedTOCheckOut);  
					log("Click on <b>"+"CheckOut"+"</b> button.");
				}
				else
				{
					
					Common.highlightElement(driver,Cart_checkOut);
					Common.clickOn(driver, Cart_checkOut);  
					Common.pause(1);
					log("Click on <b>"+"CheckOut"+"</b> button.");
					Common.pause(3);
				}
				
				return new Brandshop_verification(driver);
			}
			
			public Brandshop_verification Cart_ProceedSummary_Checkout_Click() throws IOException {
				Common.waitForElement(driver, Cart_ProceedTOCheckOut);
				Common.highlightElement(driver,Cart_ProceedTOCheckOut);
				Common.clickOn(driver, Cart_ProceedTOCheckOut);  
				log("Click on <b>"+"CheckOut"+"</b> button.");
				
				return new Brandshop_verification(driver);
			}
			
			
			
		
			
			@FindBy(xpath="//input[@id='customer-email']")
			public WebElement Customer_Email;
			String CustomerEmailID=null;
			public Brandshop_verification Shipping_form_emailID(String emailID) throws IOException {
				Common.pause(1);
				Common.waitForElement(driver, Customer_Email);
				Common.highlightElement(driver,Customer_Email);
				Common.pause(1);
				Customer_Email.sendKeys(emailID); 
				System.err.println("Inside the email Id for the random"+emailID);
				Common.pause(2);
				log("Enter Customer Email Id as: <b>"+Customer_Email.getAttribute("value")+"</b>.");
				CustomerEmailID = Customer_Email.getAttribute("value");
				Common.pause(2);
				return new Brandshop_verification(driver);
			}
			
			public Brandshop_verification SendsKEY(WebElement ID, String value) throws IOException {
				Common.pause(1);
				Common.waitForElement(driver, ID);
				Common.highlightElement(driver,ID);
				ID.sendKeys(value); 
				//Common.pause(1);
				log("Entered value is: <b>"+ID.getAttribute("value")+"</b>.");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='firstname']")
			public WebElement Customer_FName;
			public Brandshop_verification Shipping_form_FirstName() throws IOException {
				log("Enter First Name");
				Common.waitForElement(driver, Customer_FName);
				SendsKEY(Customer_FName,"Kinnari");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='lastname']")
			public WebElement Customer_LName;
			public Brandshop_verification Shipping_form_lastName() throws IOException {
				log("Enter Last Name");
				SendsKEY(Customer_LName,"Shah");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='company']")
			public WebElement Customer_Company;
			public Brandshop_verification Shipping_form_Company() throws IOException {
				Common.waitForElement(driver, Customer_Company);
				log("Enter Company Name");
				SendsKEY(Customer_Company,"kiwiqa");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath="//input[@name='street[0]']")
			public WebElement Customer_Street1;
			public Brandshop_verification Shipping_form_Street1() throws IOException {
				log("Enter Street Name");
				//SendsKEY(Customer_Street1,"10 Marsh");
				SendsKEY(Customer_Street1,"17 Jay st");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='street[1]']")
			public WebElement Customer_Street2;
			public Brandshop_verification Shipping_form_Street2() throws IOException {
				log("Enter Second Street Name");
				SendsKEY(Customer_Street2,"adam Hall");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath="//input[@name='city']")
			public WebElement Customer_City;
			public Brandshop_verification Shipping_form_City() throws IOException {
				log("Enter City Name");
				//SendsKEY(Customer_City,"East Lansing");
				SendsKEY(Customer_City," North Attleboro");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			
			@FindBy(xpath="//select[@name='region_id']")
			public WebElement Customer_State;
			public Brandshop_verification Shipping_form_State() throws IOException {
				log("Select State Name");
				//Common.selectFromComboByVisibleText(Customer_State, "Michigan");
				Common.waitForElement(driver, Customer_State);
				Common.selectFromComboByVisibleText(Customer_State, "Massachusetts");
				//Common.pause(1);
				log("Seected State as: <b> "+Common.SelectedTextOption+"</b>.");
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath="//input[@name='postcode']")
			public WebElement Customer_PostCode;
			public Brandshop_verification Shipping_form_Postcode() throws IOException {
				log("Enter PostCode");
				//SendsKEY(Customer_PostCode,"48824-0000");
				SendsKEY(Customer_PostCode,"02760-3214");

				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			
			@FindBy(xpath="//select[@name='country_id']")
			public WebElement Customer_CountryID;
			public Brandshop_verification Shipping_form_Country() throws IOException {
				log("Select Country Name");
				Common.waitForElement(driver, Customer_CountryID);
				Common.selectFromComboByVisibleText(Customer_CountryID, "United States");
				Common.pause(1);
				log("Seected Country as: <b> "+Common.SelectedTextOption+"</b>.");
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath="//input[@name='telephone']")
			public WebElement Customer_telephone;
			public Brandshop_verification Shipping_form_Telephone() throws IOException {
				log("Enter Phone Number");
				SendsKEY(Customer_telephone,"122345789");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath="(//input[@name='shipping_method'])[1]")
			public WebElement ShippingMethod_1;
			public Brandshop_verification Shipping_form_ShippingMethod() throws IOException {
				log("Select Shippping Method");
				Common.waitForElement(driver, ShippingMethod_1);
				Common.scrollToVertical(driver, ShippingMethod_1);
				Common.clickOn(driver, ShippingMethod_1);
				//Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
					
			@FindBy(xpath="//span[contains(text(),'Next')]/../..")
			public WebElement Btn_Next;
			
			
			public Brandshop_verification Shipping_form_NextBtn() throws IOException {
				Common.waitForElement(driver, Btn_Next);
				log("Clicked on Next Button");
				Common.clickOn(driver, Btn_Next);
				Common.pause(5);
				return new Brandshop_verification(driver);
			}	
			
			
			@FindBy(xpath=".//*[@id='md_cybersource']")
			public WebElement Paymentmethod_CreditCard;
			
			
			public Brandshop_verification Shipping_form_Payment_Method() throws IOException {
				Common.pause(2);
				Common.waitForElement(driver, Paymentmethod_CreditCard);
				Common.scrollToVertical(driver, Paymentmethod_CreditCard);
				Common.clickOn(driver, Paymentmethod_CreditCard);
				Common.pause(3);
				log("Clicked on Credit Card");
				return new Brandshop_verification(driver);
			}	
			
			@FindBy(xpath=".//*[@id='md_cybersource_cc_type']")
			public WebElement Paymentmethod_CreditCardType;
			
			
			public Brandshop_verification Shipping_form_CreditCardType() throws IOException {
				log("Select Credit Card Type");
				Common.waitForElement(driver, Paymentmethod_CreditCardType);
				Common.scrollToVertical(driver, Paymentmethod_CreditCardType);
				Common.selectFromComboByVisibleText(Paymentmethod_CreditCardType, "Visa");
				Common.pause(1);
				log("Select Credit card as: <b> "+Common.SelectedTextOption+"</b>.");
				return new Brandshop_verification(driver);
			}	
			
			
			
			
			
			@FindBy(xpath=".//*[@id='md_cybersource_cc_number']")
			public WebElement CreditCardNumber;
			public Brandshop_verification Shipping_form_CreditCardNumber() throws IOException {
				log("Enter Credit card Number");
				SendsKEY(CreditCardNumber,"4444333322221111");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath=".//*[@id='md_cybersource_expiration']")
			public WebElement CreditCardExpireMonth;
			public Brandshop_verification Shipping_form_CreditCardExpireMonth() throws IOException {
				log("Select Credit Card Expire Month");
				Common.waitForElement(driver, CreditCardExpireMonth);
				Common.selectFromComboByVisibleText(CreditCardExpireMonth, "03 - March");
				Common.pause(1);
				log("Select Credit card Expire Month as: <b> "+Common.SelectedTextOption+"</b>.");
				return new Brandshop_verification(driver);
			}	
			
			@FindBy(xpath=".//*[@id='md_cybersource_expiration_yr']")
			public WebElement CreditCardExpireYear;
			public Brandshop_verification Shipping_form_CreditCardExpireYear() throws IOException {
				log("Select Credit Card Expire Year");
				Common.waitForElement(driver, CreditCardExpireYear);
				Common.selectFromComboByVisibleText(CreditCardExpireYear, "2020");
				Common.pause(1);
				log("Select Credit card Expire Year as: <b> "+Common.SelectedTextOption+"</b>.");
				return new Brandshop_verification(driver);
			}	
			
			@FindBy(xpath=".//*[@id='md_cybersource_cc_cid']")
			public WebElement CreditCardVerificationCode;
			public Brandshop_verification Shipping_form_CreditCardVerifCode() throws IOException {
				log("Enter Credit card Verification code");
				SendsKEY(CreditCardVerificationCode,"123");
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath="//button[@title='Place Order']")
			public WebElement Paymentmethod_PlaceOrder;
			
			public Brandshop_verification Shipping_form_Payment_PlaceOrder() throws IOException {
				log("Clicked on Place Order button");
				Common.waitForElement(driver, Paymentmethod_PlaceOrder);
				Common.clickOn(driver, Paymentmethod_PlaceOrder);
				Common.pause(5);
				return new Brandshop_verification(driver);
			}	
			
			
			
			
			//Create Account Click
			@FindBy(xpath="//input[@class='action primary']")
			public WebElement Create_Account;
			
			public Brandshop_verification CreateAccountClick() throws IOException {
				log("Clicked on Create account button");
				Common.waitForElement(driver, Create_Account);
				Common.clickOn(driver, Create_Account);
				Common.pause(5);
				return new Brandshop_verification(driver);
			}	
			
			//open mailinator..
			
			public Brandshop_verification OpenMailinator() throws IOException {
				Common.pause(2);
				Common.openMailinator(driver, CustomerEmailID);
				//Common.waitForElement(driver, CustomerEmailID);
				Common.pause(5);
				return new Brandshop_verification(driver);
			}	
			
			//Mailinator First Mail
			
			@FindBy(xpath="//div[@class='innermail ng-binding' and contains(.,'Welcome to Brandshop')]")
			public WebElement Mailinator_FirstWElcomeMail;
			
			public Brandshop_verification MailinatorFirstMailClick() throws IOException {
				log("Clicked on Welcome mail.");
				Common.waitForElement(driver, Mailinator_FirstWElcomeMail);
				Common.clickOn(driver, Mailinator_FirstWElcomeMail);
				Common.pause(5);
				return new Brandshop_verification(driver);
			}	
			
			//Clicked on Link inside the mailinator for access link of password
			@FindBy(xpath="//a[contains(.,'link')]")
			public WebElement Mailinator_BodySetPwdLink;
			
			@FindBy(xpath="//iframe[@id='publicshowmaildivcontent']")
			public WebElement Iframe;
			
			String ParentWindow = driver.getWindowHandle();
			
			public Brandshop_verification Mailinator_SetPassword_Link_Click() throws IOException {
				driver.switchTo().frame(Iframe);
				Common.pause(2);
				log("Clicked on Link for set the password.");
				Common.waitForElement(driver, Mailinator_BodySetPwdLink);
				Common.clickOn(driver, Mailinator_BodySetPwdLink);
				Common.pause(5);
				if(targetBrowser.contains("androidMobile") ||(targetBrowser.contains("iphoneMobile"))||(targetBrowser.contains("androidTablet"))){
					ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					driver.switchTo().window(tabs2.get(0));		
				    System.err.println("Inside the first tab"+driver.getCurrentUrl());
				    driver.close();
				    driver.switchTo().window(tabs2.get(1));
				    System.err.println("Inside the second tab"+driver.getCurrentUrl());
				}	else{
					Common.Switch_Window(ParentWindow, driver);
					
				}

			
					//Common.Switch_Window(ParentWindow, driver);
					
				return new Brandshop_verification(driver);
			}	
			
		
			@FindBy(xpath=".//input[@id='password']")
			public WebElement NewPassword;
			public Brandshop_verification SetNewPassword(String pwd) throws IOException {
				Common.waitForElement(driver, NewPassword);
				SendsKEY(NewPassword,pwd);
				Common.pause(2);
				log("set the New password as: <b>."+NewPassword.getAttribute("value")+"</b>.");
				return new Brandshop_verification(driver);
			}	
			
			@FindBy(xpath=".//input[@id='password-confirmation']")
			public WebElement ConfirmPassword;
			public Brandshop_verification SetConfirmPassword(String pwd) throws IOException {
				SendsKEY(ConfirmPassword,pwd);
				Common.pause(2);
				log("set the Confirm password as: <b>."+ConfirmPassword.getAttribute("value")+"</b>.");
				return new Brandshop_verification(driver);
			}	
			
			@FindBy(xpath="//button[@class='action submit primary']")
			public WebElement Btn_Setpwd;
			public Brandshop_verification SetPasswordButtonClick() throws IOException {
				Common.pause(2);
				Common.waitForElement(driver, Btn_Setpwd);
				Common.clickOn(driver, Btn_Setpwd);
				log("Clicked on 'Set a New Password'.");
				return new Brandshop_verification(driver);
			}	
			
			
			*//*******************************************************************************************************************************//*
			
			//Scenario @@@ 2 Login
			
			@FindBy(xpath="//input[@name='login[username]']")
			public WebElement BS_Login_EmailID;
			public Brandshop_verification Bs_Login_EmailID() throws IOException {
				log("Enter customer Email Id");
				Common.waitForElement(driver, BS_Login_EmailID);
				SendsKEY(BS_Login_EmailID, "kinnari165774@mailinator.com");
				Common.pause(1);
				log("Entered Email ID is: <b> "+BS_Login_EmailID.getAttribute("value")+"</b>.");
				return new Brandshop_verification(driver);
			}
			
			@FindBy(xpath="//input[@name='login[password]']")
			public WebElement BS_Login_Password;
			public Brandshop_verification Bs_Login_Password() throws IOException {
				log("Enter customer Password");
				SendsKEY(BS_Login_Password, "abcdef@123");
				Common.pause(1);
				log("Entered Password is: <b> "+BS_Login_Password.getAttribute("value")+"</b>.");
				return new Brandshop_verification(driver);
			}
			
			
			@FindBy(xpath="//button[@class='action login primary']")
			public WebElement BS_Login_BtnSignIn;
			public Brandshop_verification Bs_Login_SignInButtonClick() throws IOException {
				log("Clicked on 'SignIn button'.");
				Common.waitForElement(driver, BS_Login_BtnSignIn);
				Common.clickOn(driver, BS_Login_BtnSignIn);
				Common.pause(1);
				return new Brandshop_verification(driver);
			}
			
			
			
			//Checkout Password
			
					@FindBy(xpath="(//input[@name='password'])[2]")
					public WebElement CheckOut_Password;
					public Brandshop_verification CheckOut_Passowrd() throws IOException {
						log("Entered the Password Durin Checkout Time.");
						Common.waitForElement(driver, CheckOut_Password);
						SendsKEY(CheckOut_Password, "abcdef@123");
						Common.pause(1);
						return new Brandshop_verification(driver);
					}
					
					

	*//*************************************************************************************************************************//*
					
					
	//Scenario @@ 3 For NEw Users 
					
		//Create New Account :
					
					
		@FindBy(xpath="//input[@name='dob']")
		public WebElement Customer_DOB;
			public Brandshop_verification Shipping_form_DOB() throws IOException {
				log("Enter Date of birth of Customer");
				SendsKEY(Customer_DOB,"06/06/1966");
				Common.pause(1);
			return new Brandshop_verification(driver);
			}					
			
					
	
			@FindBy(xpath="//input[@name='email']")
			public WebElement Customer_CreateAccount_Email;
				public Brandshop_verification CreateAccount_form_email(String Email) throws IOException {
					log("Enter Email Id  of Customer");
					Common.waitForElement(driver, Customer_CreateAccount_Email);
					SendsKEY(Customer_CreateAccount_Email,Email);
					Common.pause(1);
				return new Brandshop_verification(driver);
				}				
			
			
			
			
			
}


*/


package com.Kleenex.BrandShop.IndexPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.Kleenex.BrandShop.Verification.Brandshop_verification;
import com.Kleenex.Init.Common;
import com.Kleenex.Init.ITestStatus;

import mx4j.log.Log;

import com.Kleenex.Init.AbstractPage;

public class Brandshop_indexpage22 extends AbstractPage {

	public Brandshop_indexpage22(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@class='logo']")
	 public WebElement brandShoLogo;
	 
	 @FindBy(xpath="//span[@class='base']")
	 public WebElement myDashboard;

	

	 @FindBy(xpath="//div[@class='header content']//img")
	 public WebElement HomePage_Brandshop_Logo;
	
	public void verifyUrLOpened(){
		  Common.logvf("Verify URL opened successfully.");
		  try {
		   Common.waitForElement(driver, brandShoLogo);
		   logStatus(ITestStatus.PASSED);
		   
		  } catch (Exception e) {
		   logStatus(ITestStatus.FAILED);
		   Assert.assertTrue(false, "Site is not accessible.");
		  }
		 }
		 
	public void VerifyHomepageLogo()
	{
		Common.logvf("Verify URL opened successfully.");
		  try {
		   Common.waitForElement(driver, HomePage_Brandshop_Logo);
		   logStatus(ITestStatus.PASSED);
		   
		  } catch (Exception e) {
		   logStatus(ITestStatus.FAILED);
		   Assert.assertTrue(false, "Site is not accessible.");
		  }
		
	}
		 
		 public void verifyLogin(){
		  Common.logvf("Verify user gets logged in successfully.");
		  try {
		   Common.waitForElement(driver, myDashboard);
		   logStatus(ITestStatus.PASSED);
		  } catch (Exception e) {
		   logStatus(ITestStatus.FAILED);
		   Assert.assertTrue(false, "Login functionality is not working.");
		  }
		 }
		
	
	
	
	
	
	
	
	
	

	 @FindBy(xpath="(//div[@class='modal-inner-wrap']//header//button)[1]")
	//@FindBy(xpath = "//img[@class='close-modal'] | (//div[@class='modal-inner-wrap']//header//button)[1]")
	// (//button[@class='action-close'])[2]
	//@FindBy(xpath = " (//button[@class='action-close'])[2]")
	public WebElement PopUP;

	public Brandshop_verification PopUpBox() throws IOException {
	    Common.pause(2);
	    if (Common.isElementDisplayed(PopUP)) {
	     System.out.println("Windows Size is: " + driver.getWindowHandles().size());
	     Common.clickOn(driver, PopUP);
	     Common.log("Clicked on <b>" + "popup dialog box " + " </b> for close it.");
	    } else {
	     System.err.println("No Any Popup Generated");
	    }
	    return new Brandshop_verification(driver);
	  }

	// Home page Simple Product

	@FindBy(xpath = "//a[@class='product-item-link' and contains(.,'Simple Product')]/../..//button/span")
	public WebElement HomePageSimpleProduct;

	@FindBy(xpath = "(//i[@class='i-chev-right-thin'])[4]") // For mobile click
															// on right arrow
															// for getting
															// product
	public WebElement HomePage_Mobile_RightArrow;

	public int HomePageSimpleProductAddtoCart(int logStep) throws IOException {
		// Common.pause(1);
		// driver.findElement(By.xpath("(//span[contains(text(),'Add to
		// Cart')])[3]")).click();

		Common.logstep("Step " + (logStep++) + " :Select Simple product.");
		if (targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))
				|| (targetBrowser.contains("androidTablet"))) {
			Common.waitForElement(driver, HomePage_Mobile_RightArrow);
			Common.scrollToVertical(driver, HomePage_Mobile_RightArrow);
			Common.clickOn(driver, HomePage_Mobile_RightArrow);
			Common.pause(1);
		}

		Common.waitForElement(driver, HomePageSimpleProduct);
		Common.scrollToVertical(driver, HomePageSimpleProduct);
		Common.clickOn(driver, HomePageSimpleProduct);
		// Common.waitForElement(driver, Cart_checkOut);
		// driver.findElement(By.xpath("//button[@class='action primary
		// checkout' and contains(.,'CHECKOUT')]")).click();
		// Common.highlightElement(driver,Cart_checkOut);
		// Common.clickOn(driver, Cart_checkOut);

		// Common.clickOn(driver,
		// driver.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]")));

		 Common.log("Clicked on <b>" + "Simple Product " + " </b> From Home page.");
		return logStep;
	}

	public Brandshop_verification HomePageSimpleProductAddtoCart1() throws IOException {
		// Common.pause(1);
		// driver.findElement(By.xpath("(//span[contains(text(),'Add to
		// Cart')])[3]")).click();
		Common.waitForElement(driver, HomePageSimpleProduct);
		Common.scrollToVertical(driver, HomePageSimpleProduct);
		Common.clickOn(driver, HomePageSimpleProduct);
		// Common.waitForElement(driver, Cart_checkOut);
		// driver.findElement(By.xpath("//button[@class='action primary
		// checkout' and contains(.,'CHECKOUT')]")).click();
		// Common.highlightElement(driver,Cart_checkOut);
		// Common.clickOn(driver, Cart_checkOut);
		// Common.clickOn(driver,
		// driver.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]")));
		 Common.log("Clicked on <b>" + "Simple Product " + " </b> From Home page.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//span[contains(.,'Men')]/..")
	public WebElement Menu_Men;
	@FindBy(xpath = "//span[@class='action nav-toggle']")
	public WebElement Menu_Android;

	@FindBy(xpath = "//span[contains(text(),'Men')]")
	public WebElement Men_Android;

	@FindBy(xpath = "//a[contains(text(),'All Men')]")
	public WebElement AllMen_Android;

	public int ClickMenu(int logStep) throws IOException {

		Common.logstep("Step " + (logStep++) + " :Click on 'Men' from Menu.");
		if ((targetBrowser.contains("androidMobile")) || (targetBrowser.contains("iPhoneMobile"))|| (targetBrowser.contains("androidTablet"))) {

			System.err.println("Inside android -------11");

			Common.pause(1);
			Common.waitForElement(driver, Menu_Android);
			Common.highlightElement(driver, Menu_Android);
			Menu_Android.click();
			 Common.log("Clicked on <b>" + "Menu" + " </b> icon.");
			Common.pause(1);
			Common.waitForElement(driver, Men_Android);
			Common.highlightElement(driver, Men_Android);
			Men_Android.click();
			 Common.log("Clicked on <b>" + "Men" + " </b> lable.");
			Common.waitForElement(driver, AllMen_Android);
			Common.highlightElement(driver, AllMen_Android);
			AllMen_Android.click();
			 Common.log("Clicked on <b>" + "All Men" + " </b> link.");

			Common.pause(3);
		} else {

			Common.pause(1);
			// Common.findAndSwitchToSecondWindow(driver, )
			System.out.println("Windows Size is: " + driver.getWindowHandles().size());
			System.out.println("WELCOME");
			Common.waitForElement(driver, Menu_Men);
			Common.clickOn(driver, Menu_Men);
			Common.clickOn(driver, Menu_Men);
			Common.pause(3);
			 Common.log("Clicked on <b>" + "Men Link " + " </b> From Menu bar.");
		}
		return logStep;
	}

	// List of product on PLP page..

	@FindBy(xpath = "//a[@class='product-item-link']")
	public List<WebElement> ProductItemList;

	public Brandshop_verification ListofProduct() throws IOException {
		Common.pause(3);
		System.out.println("Product List Size is: " + ProductItemList.size());
		Common.pause(1);
		 Common.log("Product List size is: <b>" + ProductItemList.size() + " </b>.");
		return new Brandshop_verification(driver);
	}

	// Randomly Select the product
	 public int ClickOnRandomProduct(int logStep) throws IOException {
		 Common.logstep("Step " + (logStep++) + " : Click on any Random Product. ");
		  Common.pause(3);
		  //Common.findAndSwitchToSecondWindow(driver, )
		  int RandomNumber = Common.randBetween(1,9);
		  System.out.println("Generated Random Number is: "+RandomNumber);
		  Common.pause(1);
		  Common.log("Selected Product to Add to Cart:- <b>"+ProductItemList.get(RandomNumber).getText()+"</b>.");
		  Common.pause(1);
		  Common.clickOn(driver, ProductItemList.get(RandomNumber));
		  return logStep;
		 }

	// Search Button for search Product

	@FindBy(xpath = "//input[@name='q']")
	public WebElement SearchBox;

	@FindBy(xpath = "//label[@data-role='minisearch-label']")
	public WebElement SearchIcon;

	public int SearchBoxValue(String prodName,int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " : Enter value into 'search box' and Click on 'Search' icon.");
		if (targetBrowser.contains("androidMobile") || targetBrowser.contains("iPhoneMobile")
				|| (targetBrowser.contains("androidTablet"))) {
			Common.pause(2);
			Common.waitForElement(driver, SearchIcon);
			SearchIcon.click();
			Common.pause(1);
			SendsKEY(SearchBox, prodName);
			Common.pause(1);
			System.out.println("Search for the product : <b> " + prodName + "</b>.");
			Common.pause(3);
			SearchBox.sendKeys(Keys.ENTER);
		} else {

			Common.pause(1);
			Common.waitForElement(driver, SearchBox);
			SendsKEY(SearchBox, prodName);
			Common.pause(1);
			System.out.println("Search for the product : <b> " + prodName + "</b>.");
			Common.pause(1);
			SearchBox.sendKeys(Keys.ENTER);
		}
		return logStep;
	}

	// For Other Functionality Configurations

	@FindBy(xpath = "//div[@class='swatch-option color']")
	public WebElement ColorSelection;

	@FindBy(xpath = "//div[@class='swatch-option text']")
	public WebElement SizeSelection;

	@FindBy(xpath = "//input[@name='qty']")
	public WebElement ItemQuantity;

	public Brandshop_verification FunctionalitySelection_Color() throws IOException {
		try {
			Common.waitForElement(driver, ColorSelection);
			if (ColorSelection.isDisplayed()) {
				Common.waitForElement(driver, ColorSelection);
				Common.clickOn(driver, ColorSelection);
				Common.pause(1);
				 Common.log("Color is Selected");
			}
		} catch (Exception e) {
			 Common.log("No Other Configurations are Available.");
		}
		return new Brandshop_verification(driver);
	}

	public Brandshop_verification FunctionalitySelection_Size() throws IOException {

		try {
			Common.waitForElement(driver, SizeSelection);
			if (SizeSelection.isDisplayed()) {
				Common.waitForElement(driver, SizeSelection);
				Common.clickOn(driver, SizeSelection);
				Common.pause(1);
				 Common.log("Size is Selected");
			}
		} catch (Exception e) {

			 Common.log("No Other Configurations are Available.");
		}
		return new Brandshop_verification(driver);
	}

	public Brandshop_verification FunctionalitySelection_ItemQuantity() throws IOException {

		try {
			Common.waitForElement(driver, ItemQuantity);
			if (ItemQuantity.isDisplayed()) {
				ItemQuantity.clear();
				Common.pause(1);
				ItemQuantity.sendKeys("2");
				Common.pause(1);
				 Common.log("Quanitity of the Item is: <b>" + ItemQuantity.getAttribute("value") + "</b>.");
			}
		} catch (Exception e) {

			 Common.log("No Other Configurations are Available.");
		}
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "(//button[@title='Add to Cart'])[1]")
	public WebElement Menu_men_Addtocart;

	@FindBy(xpath = "(//button[@title='Add to Cart'])[2]")
	public WebElement Menu_men_Addtocart_Failed;

	@FindBy(xpath = "(//button[@id='product-addtocart-button'])[1]")
	public WebElement Menu_men_Addtocart_Mobile;

	@FindBy(xpath = "(//a[@class='product-item-link'])[1]")
	public WebElement Menu_men_ProductName;

	public int AddtoCart(int logStep) throws IOException {
		Common.pause(2);
		Common.logstep("Step " + (logStep++) + " :Select Product and Click on 'Add to Cart' button from available products.");
		if (targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))
				|| (targetBrowser.contains("androidTablet"))) {
			Common.waitForElement(driver, Menu_men_Addtocart);
			System.err.println("Inside IFFFFFFFFFFFFF Clicked");
			// Common.scrollToVertical(driver, Menu_men_Addtocart_Mobile);
			Common.highlightElement(driver, Menu_men_Addtocart);
			Common.pause(3);
			Common.clickOn(driver, Menu_men_Addtocart);

		} else {

			Common.waitForElement(driver, Menu_men_Addtocart);
			Common.scrollToVertical(driver, Menu_men_Addtocart);
			// Common.highlightElement(driver, Menu_men_Addtocart);
			Common.highlightElement(driver, Menu_men_Addtocart);
			Common.pause(2);
			Menu_men_Addtocart.click();
			// Common.clickOn(driver, Menu_men_Addtocart);
			System.err.println("Inside Clicked");

			/*
			 * Common.waitForElement(driver, Menu_men_Addtocart_Mobile);
			 * Common.scrollToVertical(driver,Menu_men_Addtocart_Mobile);
			 * Common.pause(3); //Common.highlightElement(driver,
			 * Menu_men_Addtocart); System.err.println(
			 * "Inside Clicked FOr ADD TO Cartttttttttttttttttttttttt");
			 * Common.highlightElement(driver, Menu_men_Addtocart_Mobile);
			 * Common.pause(3);
			 * 
			 * //Menu_men_Addtocart_Mobile.click(); //Common.clickOn(driver,
			 * Menu_men_Addtocart); System.err.println("Inside Clicked");
			 * driver.findElement(By.xpath(
			 * "//button[@type='submit' and @title='Add to Cart']")).click();
			 */
		}
		 Common.log("Clicked on <b>" + "Add to Cart " + "</b> button.");
		return logStep;
	}

	public int AddtoCartDEtailPage(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Select Product and Click on 'Add to Cart' button from available products.");
		System.err.println("Inside Clicked FOr ADD TO Cartttttttttttttttttttttttt");
		Common.highlightElement(driver, Menu_men_Addtocart_Mobile);
		Common.pause(2);

		// Menu_men_Addtocart_Mobile.click();
		// Common.clickOn(driver, Menu_men_Addtocart);
		System.err.println("Inside Clicked");
		driver.findElement(By.xpath("//button[@type='submit' and @title='Add to Cart']")).click();
		 Common.log("Click on <b>" + "Add to Cart " + "</b> button.");
		return logStep;
	}

	public Brandshop_verification AddtoCartFailed() throws IOException {
		Common.pause(3);
		Common.waitForElement(driver, Menu_men_Addtocart_Failed);
		Common.highlightElement(driver, Menu_men_Addtocart_Failed);
		Common.pause(3);
		 Common.log("Select Product as: <b>" + Menu_men_ProductName.getText() + " </b> From list of Product.");
		Common.pause(1);
		Common.clickOn(driver, Menu_men_Addtocart_Failed);
		 Common.log("Click on <b>" + "Add to Cart " + "</b> button.");
		return new Brandshop_verification(driver);
	}

	// View cart Link Click On

	@FindBy(xpath = "//a[contains(.,'View Cart')]")
	public WebElement ViewCart;

	@FindBy(xpath = "//a[@class='action showcart']")
	public WebElement ViewCart_Mobile;

	public Brandshop_verification Cart_ViewCart_Click() throws IOException {
		Common.waitForElement(driver, ViewCart);
		Common.highlightElement(driver, ViewCart);
		Common.clickOn(driver, ViewCart);
		 Common.log("Click on <b>" + "ViewCart" + "</b> Link.");
		Common.pause(2);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "(//div[@class='modal-content'])[2]//button[contains(text(),'CHECKOUT')]")
	// @FindBy(xpath="//button[@class='action primary checkout' and
	// contains(text(),'CHECKOUT')] | //button[@class='action primary
	// checkout']")
	public WebElement Cart_checkOut;
	@FindBy(xpath = "(//*[@class='action primary checkout'])[2]")
	public WebElement Cart_checkOut_An;

	@FindBy(xpath = "(//button[contains(.,'Checkout')])[2]")
	public WebElement Cart_ProceedTOCheckOut;

	@FindBy(xpath = "//div[@class='cart-summary']")
	public WebElement Cart_Summary;

	public int Cart_Checkout_Click_Mobile(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'CheckOut' button.");
		Common.waitForElement(driver, Cart_checkOut_An);
		Common.clickOn(driver, Cart_checkOut_An);
		Common.pause(3);
		 Common.log("Clicked on <b>" + "CheckOut" + "</b> button.");
		return logStep;
	}

	@FindBy(xpath = "//button[contains(text(),'CHECKOUT')]")
	// @FindBy(xpath="//button[@class='action primary checkout' and
	// contains(text(),'CHECKOUT')] | //button[@class='action primary
	// checkout']")
	public WebElement Cart_CheckOut_AWS;

	public int Cart_Checkout_Click_FullScreen(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'CheckOut' button.");
		Common.waitForElement(driver, Cart_CheckOut_AWS);
		Common.clickOn(driver, Cart_CheckOut_AWS);
		/*
		 * Common.waitForElement(driver, Cart_checkOut); Common.clickOn(driver,
		 * Cart_checkOut);
		 */
		Common.pause(3);
		 Common.log("Clicked on <b>" + "CheckOut" + "</b> button.");
		return logStep;
	}

	public int Cart_Checkout_Click(int logStep) throws IOException {

		if (targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))
				|| (targetBrowser.contains("androidTablet"))) {
			Common.waitForElement(driver, Cart_checkOut_An);
			Common.jsClick(driver, Cart_checkOut_An);
			if (Common.isElementNotDisplayed(Cart_checkOut_An)) {
				do {
					AddtoCart(logStep);
					Common.jsClick(driver, Cart_checkOut_An);
				} while (Common.isElementNotDisplayed(Menu_men_Addtocart));
			}
			// Cart_checkOut_An.click();
		} else {

			if (Common.isElementDisplayed(Cart_checkOut)) {
				Common.waitForElement(driver, Cart_checkOut);
				Common.highlightElement(driver, Cart_checkOut);
				Common.jsClick(driver, Cart_checkOut);
				// Common.clickOn(driver, Cart_checkOut);
				System.err.println("Inside normal CheckOut");
				Common.pause(1);
				 Common.log("Click on <b>" + "CheckOut" + "</b> button.");

				if (Common.isElementNotDisplayed(Cart_checkOut_An)) {
					do {
						AddtoCart(logStep);
						Common.jsClick(driver, Cart_checkOut_An);
					} while (Common.isElementDisplayed(Menu_men_Addtocart));
				}
			} else if (Common.isElementDisplayed(Cart_Summary)) {
				System.err.println("Inside the Summary checkout");
				Common.jsClick(driver, Cart_ProceedTOCheckOut);
				// Common.clickOn(driver, Cart_ProceedTOCheckOut);
				 Common.log("Proceed for Checkout with number of products");
			}
		}
		Common.pause(1);

		/*
		 * Common.waitForElement(driver, Cart_checkOut);
		 * Common.highlightElement(driver,Cart_checkOut); Common.clickOn(driver,
		 * Cart_checkOut); Common.pause(1); log("Click on <b>"+"CheckOut"+
		 * "</b> button."); Common.pause(3);
		 */

		/*
		 * if(Common.isElementDisplayed(Cart_Summary)) {
		 * Common.highlightElement(driver,Cart_ProceedTOCheckOut);
		 * Common.clickOn(driver, Cart_ProceedTOCheckOut); log("Click on <b>"
		 * +"CheckOut"+"</b> button."); } else {
		 * 
		 * Common.highlightElement(driver,Cart_checkOut); Common.clickOn(driver,
		 * Cart_checkOut); Common.pause(1); log("Click on <b>"+"CheckOut"+
		 * "</b> button."); Common.pause(3); }
		 */
		return logStep;
	}

	
			
			
			@FindBy(xpath = "(//button[@class='action-close'])[2]")
			public WebElement CheckOut_CloseBtn;

			public Brandshop_verification Checkout_Popup_Closebtn_Click() throws IOException {
				try {
					if(Common.isElementDisplayed(CheckOut_CloseBtn))
					{
						Common.clickOn(driver, CheckOut_CloseBtn);
					}
					else
					{
						Common.pause(4);
					}
					Common.log("Clicked on 'Checkout' Pop-up 'Close' button.");
					
				} catch (Exception e) {
					Common.log("Checkout option is not displayed.");
				}
				
				return new Brandshop_verification(driver);
			}
			
			
			
			
	public Brandshop_verification Cart_ProceedSummary_Checkout_Click() throws IOException {
		Common.waitForElement(driver, Cart_ProceedTOCheckOut);
		Common.highlightElement(driver, Cart_ProceedTOCheckOut);
		Common.clickOn(driver, Cart_ProceedTOCheckOut);
		 Common.log("Click on <b>" + "Proceed CheckOut" + "</b> button.");

		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@id='customer-email']")
	public WebElement Customer_Email;
	String CustomerEmailID = null;

	public Brandshop_verification Shipping_form_emailID(String emailID) throws IOException {
		Common.pause(1);
		Common.waitForElement(driver, Customer_Email);
		Common.highlightElement(driver, Customer_Email);
		Common.pause(1);
		Customer_Email.sendKeys(emailID);
		System.err.println("Inside the email Id for the random" + emailID);
		Common.pause(2);
		 Common.log("Enter Customer Email Id as: <b>" + Customer_Email.getAttribute("value") + "</b>.");
		CustomerEmailID = Customer_Email.getAttribute("value");
		Common.pause(2);
		return new Brandshop_verification(driver);
	}

	public Brandshop_verification SendsKEY(WebElement ID, String value) throws IOException {
		/* Common.pause(1); */
		Common.waitForElement(driver, ID);
		Common.highlightElement(driver, ID);
		ID.sendKeys(value);
		// Common.pause(1);
		 Common.log("Entered value is: <b>" + ID.getAttribute("value") + "</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement Customer_FName;

	public Brandshop_verification Shipping_form_FirstName() throws IOException {
		Common.waitForElement(driver, Customer_FName);
		Customer_FName.sendKeys("kinnari");
		Common.log("Entered First Name is:<b>"+Customer_FName.getAttribute("value")+"</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement Customer_LName;

	public Brandshop_verification Shipping_form_lastName() throws IOException {
		Common.waitForElement(driver, Customer_LName);
		Common.scrollToVertical(driver, Customer_LName);
		Common.highlightElement(driver, Customer_LName);
		Customer_LName.sendKeys("Lanme");
		Common.pause(1);
		Common.log("Entered Last Name is: <b>"+Customer_LName.getAttribute("value")+"</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='company']")
	public WebElement Customer_Company;

	public Brandshop_verification Shipping_form_Company() throws IOException {
		Common.waitForElement(driver, Customer_Company);
		Common.highlightElement(driver, Customer_Company);
		Customer_Company.sendKeys("abcde");
		Common.log("Entered Company Name is: <b>"+Customer_Company.getAttribute("value")+"</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='street[0]']")
	public WebElement Customer_Street1;

	public Brandshop_verification Shipping_form_Street1() throws IOException {
		// SendsKEY(Customer_Street1,"10 Marsh");
		Common.waitForElement(driver, Customer_Street1);
		Common.scrollToVertical(driver, Customer_Street1);
		Common.highlightElement(driver, Customer_Street1);
		Customer_Street1.sendKeys("17 Jay st");
		Common.log("Entered Street Name is:<b>"+Customer_Street1.getAttribute("value")+"</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='street[1]']")
	public WebElement Customer_Street2;

	public Brandshop_verification Shipping_form_Street2() throws IOException {
		Common.highlightElement(driver, Customer_Street2);
		Customer_Street2.sendKeys("adam Hall");
		Common.log("Entered Second Street Name is:<b>"+Customer_Street2.getAttribute("value")+"</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='city']")
	public WebElement Customer_City;

	public Brandshop_verification Shipping_form_City() throws IOException {
		// SendsKEY(Customer_City,"East Lansing");
		Common.highlightElement(driver, Customer_City);
		Customer_City.sendKeys(" North Attleboro");
		Common.log("Entered City Name is:<b>"+Customer_City.getAttribute("value")+"</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//select[@name='region_id']")
	public WebElement Customer_State;

	public Brandshop_verification Shipping_form_State() throws IOException {
		// Common.selectFromComboByVisibleText(Customer_State, "Michigan");
		Common.waitForElement(driver, Customer_State);
		Common.highlightElement(driver, Customer_State);
		Common.selectFromComboByVisibleText(Customer_State, "Massachusetts");
		// Common.pause(1);
		 Common.log("Selected State as: <b> " + Common.SelectedTextOption + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='postcode']")
	public WebElement Customer_PostCode;

	public Brandshop_verification Shipping_form_Postcode() throws IOException {
		 Common.waitForElement(driver, Customer_PostCode);
		 Common.scrollToVertical(driver, Customer_PostCode);
		 Common.highlightElement(driver, Customer_PostCode);
		 Customer_PostCode.sendKeys("02760-3214");
		Common.log("Entered PostCode is: <b>"+Customer_PostCode.getAttribute("value")+"</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//select[@name='country_id']")
	public WebElement Customer_CountryID;

	public Brandshop_verification Shipping_form_Country() throws IOException {
		Common.waitForElement(driver, Customer_CountryID);
		Common.scrollToVertical(driver, Customer_CountryID);
		Common.highlightElement(driver, Customer_CountryID);
		Common.selectFromComboByVisibleText(Customer_CountryID, "United States");
		Common.pause(1);
		 Common.log("Selected Country as: <b> " + Common.SelectedTextOption + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='telephone']")
	public WebElement Customer_telephone;

	public Brandshop_verification Shipping_form_Telephone() throws IOException {
		Common.waitForElement(driver, Customer_telephone);
		Common.scrollToVertical(driver, Customer_telephone);
		Common.highlightElement(driver, Customer_telephone);
		Customer_telephone.sendKeys("123456789");
		Common.log("Entered Phone Number is: <b>"+Customer_telephone.getAttribute("value")+"</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "(//input[@name='shipping_method'])[1]")
	public WebElement ShippingMethod_1;

	public int Shipping_form_ShippingMethod(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Select 'Shipping method-Ground' from Shipping method.");
		Common.waitForElement(driver, ShippingMethod_1);
		Common.scrollToVertical(driver, ShippingMethod_1);
		Common.clickOn(driver, ShippingMethod_1);
		// Common.pause(1);
		return logStep;
	}

	@FindBy(xpath = "//span[contains(text(),'Next')]/../..")
	public WebElement Btn_Next;

	public int Shipping_form_NextBtn(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'Next' button for fill up the 'Payment Details'.");
		Common.waitForElement(driver, Btn_Next);
		Common.clickOn(driver, Btn_Next);
		Common.log("Clicked on Next Button");
		Common.pause(5);
		return logStep;
	}

	@FindBy(xpath = ".//*[@id='md_cybersource']")
	public WebElement Paymentmethod_CreditCard;

	public int Shipping_form_Payment_Method(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Shopping Form for Payment Details.");
		Common.pause(2);
		Common.waitForElement(driver, Paymentmethod_CreditCard);
		Common.scrollToVertical(driver, Paymentmethod_CreditCard);
		Common.highlightElement(driver, Paymentmethod_CreditCard);
		Common.clickOn(driver, Paymentmethod_CreditCard);
		Common.pause(3);
		 Common.log("Clicked on Credit Card Type. ");
		return logStep;
	}

	@FindBy(xpath = ".//*[@id='md_cybersource_cc_type']")
	public WebElement Paymentmethod_CreditCardType;

	public Brandshop_verification Shipping_form_CreditCardType() throws IOException {
		Common.waitForElement(driver, Paymentmethod_CreditCardType);
		Common.scrollToVertical(driver, Paymentmethod_CreditCardType);
		Common.highlightElement(driver, Paymentmethod_CreditCardType);
		Common.selectFromComboByVisibleText(Paymentmethod_CreditCardType, "Visa");
		Common.pause(1);
		 Common.log("Select Credit card as: <b> " + Common.SelectedTextOption + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = ".//*[@id='md_cybersource_cc_number']")
	public WebElement CreditCardNumber;

	public Brandshop_verification Shipping_form_CreditCardNumber() throws IOException {
		Common.waitForElement(driver, CreditCardNumber);
		Common.scrollToVertical(driver, CreditCardNumber);
		Common.highlightElement(driver, CreditCardNumber);
		CreditCardNumber.sendKeys("4444333322221111");
		Common.pause(1);
		Common.log("Entered Credit card Number is:<b>"+CreditCardNumber.getAttribute("value")+"</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = ".//*[@id='md_cybersource_expiration']")
	public WebElement CreditCardExpireMonth;

	public Brandshop_verification Shipping_form_CreditCardExpireMonth() throws IOException {
		Common.waitForElement(driver, CreditCardExpireMonth);
		Common.scrollToVertical(driver, CreditCardExpireMonth);
		Common.highlightElement(driver, CreditCardExpireMonth);
		Common.selectFromComboByVisibleText(CreditCardExpireMonth, "03 - March");
		Common.pause(1);
		 Common.log("Select Credit card Expire Month as: <b> " + Common.SelectedTextOption + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = ".//*[@id='md_cybersource_expiration_yr']")
	public WebElement CreditCardExpireYear;

	public Brandshop_verification Shipping_form_CreditCardExpireYear() throws IOException {
		Common.waitForElement(driver, CreditCardExpireYear);
		Common.scrollToVertical(driver, CreditCardExpireYear);
		Common.highlightElement(driver, CreditCardExpireYear);
		Common.selectFromComboByVisibleText(CreditCardExpireYear, "2020");
		Common.pause(1);
		 Common.log("Select Credit card Expire Year as: <b> " + Common.SelectedTextOption + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = ".//*[@id='md_cybersource_cc_cid']")
	public WebElement CreditCardVerificationCode;

	public Brandshop_verification Shipping_form_CreditCardVerifCode() throws IOException {
		Common.waitForElement(driver, CreditCardVerificationCode);
		Common.scrollToVertical(driver, CreditCardVerificationCode);
		Common.highlightElement(driver, CreditCardVerificationCode);
		CreditCardVerificationCode.sendKeys("123");
		Common.pause(1);
		Common.log("Entered Credit card Verification code is: <b>"+CreditCardVerificationCode.getAttribute("value")+"</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//button[@title='Place Order']")
	public WebElement Paymentmethod_PlaceOrder;

	public int Shipping_form_Payment_PlaceOrder(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Clicked on 'Place order' button.");
		Common.waitForElement(driver, Paymentmethod_PlaceOrder);
		Common.clickOn(driver, Paymentmethod_PlaceOrder);
		Common.pause(5);
		return logStep;
	}

	// Create Account Click
	@FindBy(xpath = "//input[@class='action primary']")
	public WebElement Create_Account;

	public int  CreateAccountClick(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'Create Account' button for create new account.");
		Common.waitForElement(driver, Create_Account);
		Common.clickOn(driver, Create_Account);
		Common.log("Clicked on Create account button");
		Common.pause(5);
		return logStep;
	}

	// open mailinator..

	public int OpenMailinator(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Open 'inbox' of entered mailinator email-Id and perform actions.");
		try {
			Common.pause(2);
			Common.openMailinator(driver, CustomerEmailID);
			
		} catch (Exception e) {
			System.err.println("Inside Openmailinator Catch");
			((JavascriptExecutor) driver).executeScript(
					"return window.stop();");		
			}
		// Common.waitForElement(driver, CustomerEmailID);
		Common.pause(5);
		Common.log("Mailinator website is opened.");
		return logStep;
	}

	// Mailinator First Mail

	@FindBy(xpath = "//div[@class='innermail ng-binding' and contains(.,'Welcome to Brandshop')]")
	public WebElement Mailinator_FirstWElcomeMail;

	public Brandshop_verification MailinatorFirstMailClick() throws IOException {
		try {
			Common.waitForElement(driver, Mailinator_FirstWElcomeMail);
			Common.clickOn(driver, Mailinator_FirstWElcomeMail);
			Common.pause(5);
			
		} catch (Exception e) {
			System.err.println("Inside the  mailinator first mail check CATCH");
			((JavascriptExecutor) driver).executeScript(
					"return window.stop();");
			
		}
		
		Common.log("Clicked on Welcome mail from inbox.");
		
		return new Brandshop_verification(driver);
	}

	// Clicked on Link inside the mailinator for access link of password
	@FindBy(xpath = "//a[contains(.,'link')]")
	public WebElement Mailinator_BodySetPwdLink;

	@FindBy(xpath = "//iframe[@id='publicshowmaildivcontent']")
	public WebElement Iframe;

	String ParentWindow = driver.getWindowHandle();

	public Brandshop_verification Mailinator_SetPassword_Link_Click() throws IOException {
		driver.switchTo().frame(Iframe);
		Common.pause(2);
		 Common.log("Clicked on Link for set the password.");
		Common.waitForElement(driver, Mailinator_BodySetPwdLink);
		Common.clickOn(driver, Mailinator_BodySetPwdLink);
		Common.pause(5);
		if (targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))
				|| (targetBrowser.contains("androidTablet"))) {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
			System.err.println("Inside the first tab" + driver.getCurrentUrl());
			driver.close();
			driver.switchTo().window(tabs2.get(1));
			System.err.println("Inside the second tab" + driver.getCurrentUrl());
		} else {
			Common.Switch_Window(ParentWindow, driver);

		}

		// Common.Switch_Window(ParentWindow, driver);

		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = ".//input[@id='password']")
	public WebElement NewPassword;

	public Brandshop_verification SetNewPassword(String pwd) throws IOException {
		Common.waitForElement(driver, NewPassword);
		Common.highlightElement(driver, NewPassword);
		NewPassword.sendKeys(pwd);
		Common.pause(2);
		 Common.log("set the New password as: <b>." + NewPassword.getAttribute("value") + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = ".//input[@id='password-confirmation']")
	public WebElement ConfirmPassword;

	public Brandshop_verification SetConfirmPassword(String pwd) throws IOException {
		Common.highlightElement(driver, ConfirmPassword);
		ConfirmPassword.sendKeys(pwd);
		Common.pause(2);
		 Common.log("set the Confirm password as: <b>." + ConfirmPassword.getAttribute("value") + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//button[@class='action submit primary']")
	public WebElement Btn_Setpwd;

	public Brandshop_verification SetPasswordButtonClick() throws IOException {
		Common.pause(2);
		Common.waitForElement(driver, Btn_Setpwd);
		Common.clickOn(driver, Btn_Setpwd);
		 Common.log("Clicked on 'Set a New Password'.");
		return new Brandshop_verification(driver);
	}

	/*******************************************************************************************************************************/

	// Scenario @@@ 2 Login

	@FindBy(xpath = "//input[@name='login[username]']")
	public WebElement BS_Login_EmailID;

	public Brandshop_verification Bs_Login_EmailID() throws IOException {
		Common.waitForElement(driver, BS_Login_EmailID);
		Common.highlightElement(driver, BS_Login_EmailID);
		BS_Login_EmailID.sendKeys("kinnari165774@mailinator.com");
		Common.pause(1);
		 Common.log("Entered Email ID is: <b> " + BS_Login_EmailID.getAttribute("value") + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//input[@name='login[password]']")
	public WebElement BS_Login_Password;

	public Brandshop_verification Bs_Login_Password() throws IOException {
		Common.waitForElement(driver, BS_Login_Password);
		Common.highlightElement(driver, BS_Login_Password);
		BS_Login_Password.sendKeys("abcdef@123");
		Common.pause(1);
		 Common.log("Entered Password is: <b> " + BS_Login_Password.getAttribute("value") + "</b>.");
		return new Brandshop_verification(driver);
	}

	@FindBy(xpath = "//button[@class='action login primary']")
	public WebElement BS_Login_BtnSignIn;

/*	public Brandshop_verification Bs_Login_SignInButtonClick() throws IOException {
		Common.waitForElement(driver, BS_Login_BtnSignIn);
		Common.clickOn(driver, BS_Login_BtnSignIn);
		Common.pause(1);
		log("Clicked on 'SignIn button'.");
		return new Brandshop_verification(driver);
	}
*/
	public int Bs_Login_SignInButtonClick(int logStep) throws IOException {
	    Common.logstep("Step " + (logStep++) + " : Click on 'Sign In' button.");
	    Common.clickOn(driver, BS_Login_BtnSignIn);
	    Common.pause(1);
	    return logStep;
	    
	   }
	
	// Checkout Password

	@FindBy(xpath = "(//input[@name='password'])[2]")
	public WebElement CheckOut_Password;

	public Brandshop_verification CheckOut_Passowrd() throws IOException {
		Common.waitForElement(driver, CheckOut_Password);
		CheckOut_Password.sendKeys("abcdef@123");
		Common.pause(1);
		 Common.log("Entered the Password During Checkout is: <b>"+CheckOut_Password.getAttribute("value")+"</b>.");
		return new Brandshop_verification(driver);
	}

	/*************************************************************************************************************************/

	// Scenario @@ 3 For NEw Users

	// Create New Account :

	@FindBy(xpath = "//input[@name='dob']")
	public WebElement Customer_DOB;

	public Brandshop_verification Shipping_form_DOB() throws IOException {
		Common.waitForElement(driver, Customer_DOB);
		Customer_DOB.sendKeys("06/06/1966");
		Common.pause(1);
		 Common.log("Entered Date of birth is: <b>"+Customer_DOB.getAttribute("value")+"</b>.");
		return new Brandshop_verification(driver);
	}

	String EmailIDTOEnter = null;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement Customer_CreateAccount_Email;

	public Brandshop_verification CreateAccount_form_email(String Email) throws IOException {
		Common.waitForElement(driver, Customer_CreateAccount_Email);
		Customer_CreateAccount_Email.clear();
		Customer_CreateAccount_Email.sendKeys(Email);
		EmailIDTOEnter = Email;
		 Common.log("Entered New Email Id of Customer is: <b>" + EmailIDTOEnter + "</b>.");
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	/***********************************************************************************************************/

	// New Additiopnal Test cases

	@FindBy(xpath = "(//a[contains(text(),'My Orders')])[3]")
	public WebElement AS_MyOrder;

	@FindBy(xpath = "//a[@class='nav-sections-item-switch' and contains(text(),'Account')]")
	public WebElement Menu_android_Account;

	@FindBy(xpath = "(//a[contains(text(),'My Orders')])[2]")
	public WebElement Menu_android_MyOrderClick;

	public int Account_MyOrder_Click(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'My Order' from Menu.");
		System.out.println("Entereeeeeeeeeeeeeeeee");
		if (targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile"))|| (targetBrowser.contains("androidTablet"))) {

			Menu_Android.click();
			Common.waitForElement(driver, Menu_android_Account);
			Common.highlightElement(driver, Menu_android_Account);
			Menu_android_Account.click();
			Common.waitForElement(driver, Menu_android_MyOrderClick);
			Common.highlightElement(driver, Menu_android_MyOrderClick);
			Menu_android_MyOrderClick.click();
			Common.log("Clicked on 'My order button'.");

		} else {
			Common.waitForElement(driver, AS_MyOrder);
			Common.clickOn(driver, AS_MyOrder);
			System.out.println("Clicked on My order");
			Common.pause(1);
		}
		return logStep;
	}

	// Total sizeverifiction
	String Total_amount = null;
	String FetchData = null;

	int total_Size = 0;
	int AfterTotal = 0;

	@FindBy(xpath = "//span[@class='toolbar-number']")
	public WebElement AS_MyOrder_orderTotal;

	public int Account_MyOrder_GetTotal() throws IOException {
		Common.log("Fetching 'Total' Product ordered.");
		Common.waitForElement(driver, AS_MyOrder_orderTotal);
		FetchData = AS_MyOrder_orderTotal.getText();
		System.out.println("Fetch total data is:" + FetchData);
		if(FetchData.contains("of"))
		{
		String fetch[] = FetchData.split("of");
		Common.pause(1);
		System.out.println("Split Data is: " + fetch[0] + ", " + fetch[1]);
		String num = fetch[1];
		String ItemSize[] = num.split(" ");
		System.out.println("Split Data is: " + ItemSize[0] + ", " + ItemSize[1]);
		total_Size = (Integer.parseInt(ItemSize[1]));
		System.out.println("Total Size in INT is: " + total_Size);
		Common.log("Current Number of order placed is:<b>"+total_Size+"</b>.");
		}
		else
		{
			String LessItem = FetchData.substring(0, 2);
			System.out.println("Split Data is: " +LessItem);
			LessItem= LessItem.trim();
			total_Size = (Integer.parseInt(LessItem));
			System.out.println("Total Size in INT is: " + total_Size);
			Common.log("Current Number of order placed is:<b>"+total_Size+"</b>.");
		}
		Common.pause(1);
		return total_Size;
	}

	int BeforeTotal = 0;

	public Brandshop_verification OrderSize() throws IOException {

		BeforeTotal = total_Size;
		System.out.println("Before Placed Order size is: " + BeforeTotal);

		return new Brandshop_verification(driver);
	}

	// Redirect to Home page

	@FindBy(xpath = "	//a[@title='Brandshop']")
	public WebElement WEb_HomePage;

	public Brandshop_verification MoveToHomePage() throws IOException {
		Common.waitForElement(driver, AS_MyOrder);
		Common.clickOn(driver, WEb_HomePage);
		Common.pause(1);
		 Common.log("Redirect into 'Home' Page.");
		return new Brandshop_verification(driver);
	}

	// Clicked on Home page User button

	@FindBy(xpath = "(//span[@class='customer-name'])[1]")
	public WebElement UserIcon;

	public int HomePage_UserIcon(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'User' Icon.");
		Common.waitForElement(driver, UserIcon);
		Common.clickOn(driver, UserIcon);
		Common.pause(1);
		 Common.log("Clicked on 'user' icon.");
		return logStep;
	}

	@FindBy(xpath = " (//a[contains(text(),'My Orders')])[1]")
	public WebElement User_MyOrder;

	public int User_MyOrder_Click(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'My Order' link.");
		System.out.println("Entereeeeeeeeeeeeeeeee");
		Common.waitForElement(driver, User_MyOrder);
		Common.clickOn(driver, User_MyOrder);
		System.out.println("Entereeeeee4444444444444eeeeeeeeeee");
		Common.pause(1);
		 Common.log("Clicked on 'My Order'link.");
		return logStep;
	}

	// Verify Before and After placed order size

	public Brandshop_verification Verify_PlaceOrder_Size() throws IOException {
		 Common.log("Verify Placed order is listed on 'My order' Page.");
		if (total_Size == (BeforeTotal + 1)) {
			logStatus(ITestStatus.PASSED);

		} else {
			logStatus(ITestStatus.FAILED);
			Assert.assertTrue(false, "Placed order has not listed on 'My Order' page.");
		}
		Common.pause(1);
		return new Brandshop_verification(driver);
	}

	// GEt Order ID Data

	String OrderID, Orderamount, OrderQty;
	@FindBy(xpath = "//table[@id='my-orders-table']//tbody//tr//td[1]")
	public WebElement Order_GetOrderID;

	
	
	
	public Brandshop_verification User_MyOrder_GetOrderID() throws IOException {
		
		Common.waitForElement(driver, Order_GetOrderID);
		OrderID = Order_GetOrderID.getText();
		System.out.println("Order ID is: " + OrderID);
		Common.pause(1);
		 Common.log("'Order ID' from order Page is : <b>" + OrderID + "</b>.");
		return new Brandshop_verification(driver);
	}
	int OrderSize;
	//Check Size of Order
	public int User_MyOrder_GetOrderTOTALSIZE() throws IOException {
		if(Common.isElementDisplayed(Order_GetOrderID)){
			OrderSize=1;
			Common.log("Order is Exist in 'My Order' page.");
		}
		else
		{
			OrderSize=0;
			Common.log("Order is not Exist in 'My Order' page. first Placed the order and try again.");
		}
		
		return OrderSize;
	}

	// Get Order Amount

	@FindBy(xpath = "(//table[@id='my-orders-table']//tbody//span[@class='price'])[1]")
	public WebElement Order_GetOrderAmount;
	
			@FindBy(xpath = "(//tr)[2]//span[@class='price']")
			public WebElement Order_GetOrderAmount_mob;

	public Brandshop_verification User_MyOrder_GetOrderAmount() throws IOException {
		 if(targetBrowser.contains("androidMobile")|| (targetBrowser.contains("iPhoneMobile"))||(targetBrowser.contains("androidTablet"))){
			 Common.waitForElement(driver, Order_GetOrderAmount_mob);
				Orderamount = Order_GetOrderAmount_mob.getText();
				System.out.println("Order Amount is: " + Orderamount);
				Common.pause(1);
		 }
		 else
		 {
		Common.waitForElement(driver, Order_GetOrderAmount);
		Orderamount = Order_GetOrderAmount.getText();
		System.out.println("Order Amount is: " + Orderamount);
		Common.pause(1);
		 }
		 Common.log("Order Amount' from order Page as:<b>" + Orderamount + "</b>.");
		return new Brandshop_verification(driver);
	}

	// Click on View Order

	@FindBy(xpath = "(//table[@id='my-orders-table']//tbody//a[@class='action view'])[1]")
	public WebElement Order_ViewOrder;

	public int User_MyOrder_ViewOrderClick(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'View Order' for redirect on 'Order' Detail page.");
		Common.waitForElement(driver, Order_ViewOrder);
		Common.clickOn(driver, Order_ViewOrder);
		 Common.log("Clicked on 'View Order' from order Page.");
		Common.pause(1);
		return logStep;
	}

	// verify Order ID
	String Ver_OrderID, Ver_Orderamount;

	@FindBy(xpath = "//span[@class='base']")
	public WebElement ViewOrder_OrderId;

	public Brandshop_verification Verify_OrderID() throws IOException {
		Common.waitForElement(driver, ViewOrder_OrderId);
		Ver_OrderID = ViewOrder_OrderId.getText();
		System.out.println("View order Page order ID is: " + Ver_OrderID);
		 Common.log("Get 'Order ID' from View order Page as:<b>" + Ver_OrderID + "</b>.");
		 Common.logvf("Verify 'Home page order ID' and 'View Order Page' 'Order ID'.");
		Common.pause(1);
		if (Ver_OrderID.contains(OrderID)) {
			logStatus(ITestStatus.PASSED);
		} else {
			logStatus(ITestStatus.FAILED);
			Assert.assertTrue(false, "Home page 'Order-ID' and 'View Order' page 'Order-ID' is not matched.");
		}
		return new Brandshop_verification(driver);
	}

	// Verify View page Oder amount

	/*@FindBy(xpath = "(//span[@class='price'])[6]")*/
	@FindBy(xpath = "(//tfoot//span[@class='price'])[last()]")
	public WebElement ViewOrder_Orderamount_mob;
	@FindBy(xpath = "(//span[@class='price'])[last()]")
	public WebElement ViewOrder_Orderamount;
	

	public Brandshop_verification Verify_OrderAmount() throws IOException {
		 if(targetBrowser.contains("androidMobile")|| (targetBrowser.contains("iPhoneMobile"))||(targetBrowser.contains("androidTablet"))){
			 Common.waitForElement(driver, ViewOrder_Orderamount_mob);
				Ver_Orderamount = ViewOrder_Orderamount_mob.getText();
				System.out.println("View order Page order Amount is: " + Ver_Orderamount);
				 Common.log("Get 'Order amount' from View order Page as: <b>" + Ver_Orderamount + "</b>");
				 Common.logvf("Verify 'Home page order amount' and 'View Order Page' 'Order amount'.");
				Common.pause(1);
				if (Ver_Orderamount.equals(Orderamount)) {
					logStatus(ITestStatus.PASSED);
				} else {
					logStatus(ITestStatus.FAILED);
					Assert.assertTrue(false, "Home page Product amount and 'View Order' page amount is not matched.");
				}
		 }
		 else
		 {
		Common.waitForElement(driver, ViewOrder_Orderamount_mob);
		Ver_Orderamount = ViewOrder_Orderamount_mob.getText();
		System.out.println("View order Page order Amount is: " + Ver_Orderamount);
		 Common.log("Get 'Order amount' from View order Page as: <b>" + Ver_Orderamount + "</b>");
		 Common.logvf("Verify 'Home page order amount' and 'View Order Page' 'Order amount'.");
		Common.pause(1);
		if (Ver_Orderamount.equals(Orderamount)) {
			logStatus(ITestStatus.PASSED);
		} else {
			logStatus(ITestStatus.FAILED);
			Assert.assertTrue(false, "Home page Product amount and 'View Order' page amount is not matched.");
		}
		 }
		return new Brandshop_verification(driver);
	}

	// Dispplay Order Status

	String Order_Status;
	@FindBy(xpath = "//span[@class='order-status']")
	public WebElement Order_ViewOrder_Status;

	public Brandshop_verification User_MyOrder_ViewOrder_Status() throws IOException {
		Common.waitForElement(driver, Order_ViewOrder_Status);
		Order_Status = Order_ViewOrder_Status.getText();
		Common.pause(1);
		 Common.log("Order Status is: <b>" + Order_Status + "</b>.");
		return new Brandshop_verification(driver);
	}

	// MiniCart Remove prodcuct / Update Quanity of item

	@FindBy(xpath = "//a[@class='action showcart']")
	public WebElement MiniCart_Click;

	public int HomePage_MiniCartIcon_Click(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " : Click on 'Minicart' icon from Homepage.");
		Common.waitForElement(driver, MiniCart_Click);
		Common.pause(3);
		Common.clickOn(driver, MiniCart_Click);
		Common.pause(2);
		 Common.log("Clicked on 'MiniCart' Icon.");
		return logStep;
	}

	/// FEtch Current Quantiy and Product NAme
	String FinalValueafterall;
	int currentQTY, NewQuantity, CurrentPrice = 0;
	
	@FindBy(xpath = "//input[@class='item-qty cart-item-qty']")
	public WebElement MiniCart_Qty;

	@FindBy(xpath = "//strong[@class='product-item-name']")
	public List<WebElement> MiniCart_ProductNAme;
	@FindBy(xpath = "(//span[@class='price-wrapper'])[2]")
	public WebElement MiniCart_CurrentPrice;

	public int MiniCart_FetchCurrentData(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Fetch Current Product details.");
		 Common.log("Product Name is: <b>" + MiniCart_ProductNAme.get(0).getText() + "</b>.");
		 Common.log("Current Quantity of product <b>" + MiniCart_ProductNAme.get(0).getText() + "</b> is :<b>"
				+ MiniCart_Qty.getAttribute("value"));
		// String amt[] = MiniCart_CurrentPrice.getText().split("$");
		return logStep;
	}

	// Split Data from string and convert data into the price with data type of
	// INTEGER
	public int ConvertStringTOInterger_PRICE() throws IOException {

		String amttt = MiniCart_CurrentPrice.getText().substring(1);

		String[] finalamt = amttt.split("\\.");
		System.err.println("Final Price:" + finalamt[0]);
		System.err.println(finalamt[0].length());
		if (finalamt[0].length() >= 5) {
			String[] splitdata = finalamt[0].split(",");
			FinalValueafterall = splitdata[0] + splitdata[1];
			CurrentPrice = Integer.valueOf(FinalValueafterall);
			System.err.println("After alll Final price is:" + CurrentPrice);
		}
		else
		{
			FinalValueafterall=finalamt[0];
			CurrentPrice = Integer.valueOf(FinalValueafterall);
		}
		Common.log("Current amount of Product <b>"+MiniCart_ProductNAme.get(0).getText()+" is: <b>"+CurrentPrice+"</b>.");
		return CurrentPrice;
	}

	public Brandshop_verification SaveCurrentPrice() throws IOException {

		CurrentPrice = Integer.valueOf(FinalValueafterall);
		System.err.println("Current Price is: " + FinalValueafterall);
		 Common.log("Current Amount of product is: <b>" + CurrentPrice + "</b>.");

		return new Brandshop_verification(driver);
	}

	public Brandshop_verification MiniCart_UpdateQuantity() throws IOException {
		Common.log("Increase Exisitng Quantity by 'Two'.");
		Common.waitForElement(driver, MiniCart_Qty);
		currentQTY = Integer.parseInt(MiniCart_Qty.getAttribute("value"));
		NewQuantity = currentQTY + 2;
		String f = Integer.toString(NewQuantity);
		MiniCart_Qty.clear();
		MiniCart_Qty.sendKeys(f);
		Common.pause(1);
		 Common.log("Updated Quanity for Product :<b>" + MiniCart_ProductNAme.get(0).getText() + "</b> is now: <b>"
				+ MiniCart_Qty.getAttribute("value") + "</b>.");
		return new Brandshop_verification(driver);
	}

	// Update Button click to update quanityty

	@FindBy(xpath = "//button[@class='update-cart-item']")
	public WebElement MiniCart_UpdateBtn;

	public int MiniCart_UpdateButtonClick(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'Update' button for apply changes.");
		Common.waitForElement(driver, MiniCart_UpdateBtn);
		Common.clickOn(driver, MiniCart_UpdateBtn);
		 Common.log("Clicked on 'Update ' button to apply the Changes of product quantity.");
		 Common.pause(3);
		return logStep;
	}

	// Verify Price is updated as per the Quantity

	int New_Amount = 0;

	public Brandshop_verification SaveNewPrice() throws IOException {

		New_Amount = Integer.valueOf(FinalValueafterall);
		System.err.println("New Price is: " + FinalValueafterall);
		 Common.log("New Amount of product is: <b>" + New_Amount + "</b>.");

		return new Brandshop_verification(driver);
	}

	public Brandshop_verification MiniCart_verifyAmount() throws IOException {
		 Common.log("Verify that After updating the quantity the amount is also update.");

		if (New_Amount >= CurrentPrice) {
			logStatus(ITestStatus.PASSED);
		} else {
			logStatus(ITestStatus.FAILED);
			Assert.assertTrue(false, "Total Amount of Product quanity is not updated.");
		}
		return new Brandshop_verification(driver);
	}

	// Get Size of Product available in minicart
	int Product_Size = 0;

	public int MiniCart_Product_Size() throws IOException {
		
		Product_Size = MiniCart_ProductNAme.size();
		 Common.log("Total Available product in the Minicart :<b>" + MiniCart_ProductNAme.size() + "</b>.");
		return Product_Size;
	}
	// Remove Product from the Minicart

	@FindBy(xpath = "	//a[@class='action delete']")
	public WebElement MiniCart_RemoveProduct;

	public Brandshop_verification MiniCartRemoveProductClick() throws IOException {
		Common.waitForElement(driver, MiniCart_RemoveProduct);
		Common.clickOn(driver, MiniCart_RemoveProduct);
		 Common.log("Clicked on 'Remove' button to Delete the first product.");
		return new Brandshop_verification(driver);
	}

	// If Mobile Device then Close Minicart

	@FindBy(xpath = "//button[@id='btn-minicart-close']")
	public WebElement MiniCart_Close;

	public Brandshop_verification MiniCartCloseBtn() throws IOException {
		Common.waitForElement(driver, MiniCart_Close);
		Common.clickOn(driver, MiniCart_Close);
		 Common.log("Clicked on 'Close' button of 'Minicart'.");
		return new Brandshop_verification(driver);
	}
	// Click on 'Ok' for confirm to remove product

	@FindBy(xpath = "//button[@class='action-primary action-accept']")
	public WebElement MiniCart_RemoveProduct_BTN_Confirm;

	public Brandshop_verification MiniCartRemoveProductConfirmation_OK() throws IOException {
		Common.waitForElement(driver, MiniCart_RemoveProduct_BTN_Confirm);
		Common.clickOn(driver, MiniCart_RemoveProduct_BTN_Confirm);
		 Common.log("Clicked on 'OK' button for confirmation to Delete the product.");
		return new Brandshop_verification(driver);
	}
	// Verify Remove functionality done or not. IF HAVE ONLY 1 product then get
	// Popup Message..

	@FindBy(xpath = "//div[@id='minicart-content-wrapper']")
	public WebElement MiniCart_RemoveAllProduct_PopupGenerate;

	public Brandshop_verification Minicart_RemoveProduct_Verification(int beforeSize , int aftersize ) throws IOException {
				
		 Common.logvf("Verify Product is removed or not");
		 if(aftersize<beforeSize){
			 logStatus(ITestStatus.PASSED);
		 }
		 else
		 {
			 logStatus(ITestStatus.FAILED);
				Assert.assertTrue(false, " 'Remove' product from minicart functionality is not working. After deleting the product minicart counter remains same.");
		 }
	/*	if (beforeSize <= 1) {
			if (Common.isElementDisplayed(MiniCart_RemoveAllProduct_PopupGenerate)) {
				Common.highlightElement(driver, MiniCart_RemoveAllProduct_PopupGenerate);
				logStatus(ITestStatus.PASSED);
				Common.log("Initially Exist product is 1, so after remove of product 'Popup' message is generated.");
			} else {
				logStatus(ITestStatus.FAILED);
				Assert.assertTrue(false, "Product 'Remove' functionality is not working properly.");
			}

		} else {
			if (beforeSize > 1) {
				 
				if (aftersize== (beforeSize-1)){
					logStatus(ITestStatus.PASSED);
				} else {
					logStatus(ITestStatus.FAILED);
					Assert.assertTrue(false, "Product 'Remove' functionality is not working properly.");
				}

			}
		}
		 }
		 else
		 {
			 logStatus(ITestStatus.FAILED);
				Assert.assertTrue(false, " 'Remove' product from minicart functionality is not working. After deleting the product minicart counter remains same.");
		 }*/
		return new Brandshop_verification(driver);
	}

	// ACCOUNT INFORMATION
	
	
//For mobile menu click
	@FindBy(xpath = "//div[@class='title block-collapsible-nav-title']")
	public WebElement Menu_AccountInformation_Android;

	public int Menu_accountDashboard_sub_Mobile(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on Menu for select 'Account information'.");
		Common.waitForElement(driver, Menu_AccountInformation_Android);
		Common.clickOn(driver, Menu_AccountInformation_Android);
		 Common.log("Clicked on 'Account Dashboard' Menu for open submenu.");
		return logStep;
	}
	@FindBy(xpath = "//a[contains(text(),'Account Information')]")
	public WebElement Menu_AccountInformation;

	public int  Menu_accountInformation(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " :Click on 'Account information'.");
		Common.waitForElement(driver, Menu_AccountInformation);
		Common.clickOn(driver, Menu_AccountInformation);
		 Common.log("Clicked on 'Account Information' Menu from 'Account Dashboard'.");
		return logStep;
	}

	// Change email Check box
	@FindBy(xpath = "//input[@name='change_email']")
	public WebElement Change_Email;

	public Brandshop_verification Menu_accountChange_Email() throws IOException {
		Common.waitForElement(driver, Change_Email);
		Common.clickOn(driver, Change_Email);
		 Common.log("Checked on 'Change Email' checkbox from 'Account Information'.");
		return new Brandshop_verification(driver);
	}

	// Enter Current Password

	@FindBy(xpath = "//input[@name='current_password']")
	public WebElement Current_Password;

	public Brandshop_verification Menu_accountEnterPassword(String pwd) throws IOException {
		Common.waitForElement(driver, Current_Password);
		Common.highlightElement(driver, Current_Password);
		Current_Password.sendKeys(pwd);
		 Common.log("Enter 'Current Password' from 'Account Information'.");
		return new Brandshop_verification(driver);
	}

	// Save Button

	@FindBy(xpath = "//button[@title='Save']")
	public WebElement Btn_Save;

	public Brandshop_verification Menu_SaveBtn() throws IOException {
		Common.waitForElement(driver, Btn_Save);
		Common.clickOn(driver, Btn_Save);
		 Common.log("Clicked on 'Save' button from 'Account Information'.");
		return new Brandshop_verification(driver);
	}

	// Verify Email is update or not

	@FindBy(xpath = "//div[@class='box-content']")
	public WebElement EmailChangeVerification;

	public Brandshop_verification Menu_ChangeEmailVerification() throws IOException {
		 Common.logvf("Verify that Changed Email is updated on Contact Information.");
		String EmailId = EmailChangeVerification.getText();
		System.err.println("Email Id Data is: " + EmailId);
		if (EmailId.contains(EmailIDTOEnter)) {
			logStatus(ITestStatus.PASSED);
		} else {
			logStatus(ITestStatus.FAILED);
			Assert.assertTrue(false, "Changed Email-ID is not updated on 'Contact information'.");
		}

		return new Brandshop_verification(driver);
	}

	// Change Password Check box
	@FindBy(xpath = "//input[@name='change_password']")
	public WebElement Change_Password;

	public Brandshop_verification Menu_account_Change_Password() throws IOException {
		Common.waitForElement(driver, Change_Password);
		Common.clickOn(driver, Change_Password);
		 Common.log("Checked on 'Change Password' checkbox from 'Account Information'.");
		return new Brandshop_verification(driver);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
	//Store Payment Data
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Stored Payment Methods')]")
	public WebElement Menu_StorePayment;

	public int Menu_account_StorePayment_click(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " : Click on 'Store Payment Method'.");
		Common.waitForElement(driver, Menu_StorePayment);
		Common.clickOn(driver, Menu_StorePayment);
		 Common.log("Clicked on 'Stored Payment Methods' link.");
		return logStep;
	}
	
	//Table Size for stored information
	int Beforesize, AfterSize;
	@FindBy(xpath = "//table[@class='data-table cards']//tr")
	public List<WebElement> StoredDataSize;

	public int StorePayment_Size() throws IOException {
		Beforesize = StoredDataSize.size();
		 Common.log(" Current size of Store Payment is: <b>"+Beforesize+"</b>.");
		return Beforesize;
	}
	
	public Brandshop_verification StorePayment_AfterSize() throws IOException {
		AfterSize = StoredDataSize.size();
		 Common.log("After Deletion Store Payment Size is: <b>"+AfterSize+"</b>.");
		return new Brandshop_verification(driver);
	}
	
	//DEelte Button
	
	@FindBy(xpath = "//button[@class='button action primary' and contains(.,'Delete')]")
	public WebElement StorePayment_Delete;

	public int StorePayment_Delete_BtnClick(int logStep) throws IOException {
		Common.logstep("Step " + (logStep++) + " : Click on 'Delete' button to delete record of 'Store Payment Method' .");
		Common.waitForElement(driver, StorePayment_Delete);
		Common.clickOn(driver, StorePayment_Delete);
		 Common.log("Clicked on 'Delete' button to delete Stored Data.");
		Common.alertAccept(driver);
		 Common.log("Clicked on 'OK' to accept the Alert for confirmation.");
		return logStep;
	}
	
	
	//Verify Size is DEcreadse or not for stored payment
	
	public Brandshop_verification StorePayment_Size_Verify() throws IOException {
		 Common.logvf("Verify Size is Decrease for Payment method.");
		if(AfterSize<Beforesize)
		{
			logStatus(ITestStatus.PASSED);
			
		}
		else
		{
			logStatus(ITestStatus.FAILED);
			Assert.assertTrue(false, "'Delete card' functionality is not working");
			
		}
		return new Brandshop_verification(driver);
	}
	
	
	//Add New Card
	@FindBy(xpath = "//button[@class='addcardbutton button action primary ']")
	public WebElement StorePayment_AddNewCard;

	public int StorePayment_AddNewCard(int logStep ) throws IOException {
		Common.logstep("Step " + (logStep++) + " : Click on 'Add new Card' button to add new card details.");
		Common.waitForElement(driver, StorePayment_AddNewCard);
		Common.highlightElement(driver, StorePayment_AddNewCard);
		Common.clickOn(driver, StorePayment_AddNewCard);
		 Common.log("Clicked on 'Add New Card' button.");
		
		return logStep;
	}
	
	
	//Add NEw Card All DEtails 
	
	//First Name
	
	@FindBy(xpath = "//input[@name='md_cybersource[address_info][firstname]']")
	public WebElement Store_Payment_Fname;

	public Brandshop_verification StorePayment_FirstName() throws IOException {
		Common.waitForElement(driver, Store_Payment_Fname);
		Common.highlightElement(driver, Store_Payment_Fname);
		Store_Payment_Fname.sendKeys("Fname");
		 Common.log("Entered 'First Name' is: <b>"+Store_Payment_Fname.getAttribute("value")+"</b>.");
		return new Brandshop_verification(driver);
	}
	
	
	//Last Name
	
		@FindBy(xpath = "//input[@name='md_cybersource[address_info][lastname]']")
		public WebElement Store_Payment_Lname;

		public Brandshop_verification StorePayment_LastName() throws IOException {
			Common.waitForElement(driver, Store_Payment_Lname);
			Store_Payment_Lname.sendKeys("Lname");
			 Common.log("Entered 'Last Name' is: <b>"+Store_Payment_Lname.getAttribute("value")+"</b>.");
			return new Brandshop_verification(driver);
		}
		
				//Company Name
				
				@FindBy(xpath = "//input[@name='md_cybersource[address_info][company]']")
				public WebElement Store_Payment_Company;

				public Brandshop_verification StorePayment_Company() throws IOException {
					Common.waitForElement(driver, Store_Payment_Company);
					Store_Payment_Company.sendKeys("alphabs");
					 Common.log("Entered 'Company Name' is: <b>"+Store_Payment_Company.getAttribute("value")+"</b>.");
					return new Brandshop_verification(driver);
				}
				
				//Streeet Name
				
				@FindBy(xpath = "//input[@name='md_cybersource[address_info][street]']")
				public WebElement Store_Payment_StreetAdd;

				public Brandshop_verification StorePayment_StreetAdd() throws IOException {
					Common.waitForElement(driver, Store_Payment_StreetAdd);
					Store_Payment_StreetAdd.sendKeys("17 Jay st");
					 Common.log("Entered 'Street Address' is: <b>"+Store_Payment_StreetAdd.getAttribute("value")+"</b>.");
					return new Brandshop_verification(driver);
				}
				
				//City  Name
				
				@FindBy(xpath = "//input[@name='md_cybersource[address_info][city]']")
				public WebElement Store_Payment_City;

				public Brandshop_verification StorePayment_city() throws IOException {
					Common.waitForElement(driver, Store_Payment_City);
					Store_Payment_City.sendKeys("North Attleboro");
					 Common.log("Entered 'City Name' is: <b>"+Store_Payment_City.getAttribute("value")+"</b>.");
					return new Brandshop_verification(driver);
				}
				
				//State Name
				
				@FindBy(xpath = "//select[@name='md_cybersource[address_info][region_id]']")
				public WebElement Store_Payment_State;

				public Brandshop_verification StorePayment_State() throws IOException {
					 Common.log("Select State Name");
					Common.waitForElement(driver, Store_Payment_State);
					Common.highlightElement(driver, Store_Payment_State);
					Common.selectFromComboByVisibleText(Store_Payment_State, "Massachusetts");
					 Common.log("Select State as: <b> " + Common.SelectedTextOption + "</b>.");
					return new Brandshop_verification(driver);
				}
				
				//Zip Code
				
				@FindBy(xpath = "//input[@name='md_cybersource[address_info][postcode]']")
				public WebElement Store_Payment_ZipCode;

				public Brandshop_verification StorePayment_ZipCode() throws IOException {
					Common.waitForElement(driver, Store_Payment_ZipCode);
					Store_Payment_ZipCode.sendKeys("02760");
					 Common.log("Entered 'Zip/ Postal Code' is: <b>"+Store_Payment_ZipCode.getAttribute("value")+"</b>.");
					return new Brandshop_verification(driver);
				}
				
				//Telephone Number
				
				@FindBy(xpath = "//input[@name='md_cybersource[address_info][telephone]']")
				public WebElement Store_Payment_Telephone;

				public Brandshop_verification StorePayment_Telephone() throws IOException {
					Common.waitForElement(driver, Store_Payment_Telephone);
					Common.highlightElement(driver, Store_Payment_Telephone);
					Store_Payment_Telephone.sendKeys("123456789");
					 Common.log("Enter 'Telephone Number'.");
					
					return new Brandshop_verification(driver);
				}
	
				
				//Call Methods 
				
	//Save Card Details 
				
				@FindBy(xpath = "//button[@id='cybersource_add_card_btn']")
				public WebElement StorePayment_Btn_Save;

				public Brandshop_verification StorePayment_SaveCard_Btn_Click() throws IOException {
					Common.waitForElement(driver, StorePayment_Btn_Save);
					Common.clickOn(driver, StorePayment_Btn_Save);
					 Common.log("Click on 'Save Card' button for save the Card information for 'Store Payment Method'.");
					return new Brandshop_verification(driver);
				}
				//Verify After add details into new card it is increase the record
				
				public Brandshop_verification StorePayment_Verify_CardDetails() throws IOException {
					if(AfterSize==(Beforesize+1))
					{
						logStatus(ITestStatus.PASSED);
					}
					else
					{
						logStatus(ITestStatus.FAILED);
					}
					return new Brandshop_verification(driver);
				}
				//WISh LIST********
				
				 @FindBy(xpath="(//a[contains(text(),'My Wish List')])[3]")
			       public WebElement myWishList;
				
				public int  myWishListClick(int logStep) throws IOException {
				       
			         if(targetBrowser.contains("androidMobile") || (targetBrowser.contains("iPhoneMobile")|| (targetBrowser.contains("androidTablet")))){
			               
			               logStep = Menu_accountDashboard_sub_Mobile(logStep);
			               
			              }
			        
			       Common.logstep("Step " + (logStep++) + " : Click on 'My Wish List' menu to see current number of wish list items.");
			       Common.waitForElement(driver, myWishList);
			       Common.clickOn(driver, myWishList);
			       return logStep;
			       }			
				
				
				 /*@FindBy(xpath="//img[@class='product-image-photo loader']")
			       public List<WebElement> totalWishProducts;*/
				
				
				@FindBy(xpath="//div[@class='products-grid wishlist']//ol[@class='product-items']//li")
			       public List<WebElement> totalWishProducts;
				
			       public int totalWishListProducts() throws IOException {
			        Common.pause(3);
			        int  totalWishListProduct = totalWishProducts.size();
			        Common.log("Current Number of items in Wish List:-<b>"+totalWishListProduct+"</b>");
			        return totalWishListProduct;
			        }	
				
			       public int FunctionalitySelection_Color(int logStep) throws IOException {
			       Common.logstep("Step " + (logStep++) + " : Select color.");
			       try {
			        if(Common.isElementDisplayed(ColorSelection))
			        {
			         Common.clickOn(driver,ColorSelection );
			         Common.pause(1);
			         Common.log("Color Selected");
			        }
			       } catch (Exception e) {
			        
			        log("Selecting color functionality is not available.");
			       }
			       return logStep;
			      }
			      

			      public int Select_Size(int logStep) throws IOException {
			       
			       Common.logstep("Step " + (logStep++) + " : Select Size.");
			       
			       try {
			        if(Common.isElementDisplayed(SizeSelection))
			        {
			         Common.clickOn(driver,SizeSelection );
			         Common.pause(1);
			         Common.log("Size is Selected");
			        }
			       } catch (Exception e) {
			        
			        log("Selecting Size functionality is not available.");
			       }
			       return logStep;
			      }	
				
				
				
			      @FindBy(xpath="//a[@class='action towishlist']/span")
			      public WebElement addTiWishListLable;
			      public int addTiWishListLableClick(int logStep) throws IOException {
			       
			       Common.pause(3);
			       Common.logstep("Step " + (logStep++) + " : Click on 'Add To My Wish List'.");
			       if(Common.isElementDisplayed(addTiWishListLable)){
			       Common.clickOn(driver, addTiWishListLable); 
			       Common.log("Clicked on 'Add to wish List'.");
			       }else{
			        logStatus(ITestStatus.FAILED);
			        Assert.assertTrue(false, "Add To wish list link is not visible because automation script has selected 'Simple Product'.");
			       }
			       return logStep;
			      }		
				
				
				
				
			      @FindBy(xpath="//div[@class='message-success success message']")
			      public WebElement CreateAccountNewUserRegister;
			         public void Create_Account_NewUser_Register_VeriMsg()
			      {
			          Common.logvf("Verify system shows information message of added item to wishlist.");
			          
			          try {
			        Common.waitForElement(driver, CreateAccountNewUserRegister);
			         logStatus(ITestStatus.PASSED);
			          } catch (Exception e) {
			            logStatus(ITestStatus.FAILED);
			            Assert.assertTrue(false, "Information message is not visible after adding any item to wishlist.");
			       }
			      }
				
			         @FindBy(xpath="//span[@class='counter-number']")
			         public WebElement addToCartCounter;
			         
			         @FindBy(xpath="//button[@title='Add All to Cart']/span")
			         public WebElement addAllToCartWishList;
			         
			         public String AddtoCartCounter()  {
			        	 if(targetBrowser.contains("androidMobile")||(targetBrowser.contains("androidTablet"))){
			          Common.pause(9);
			        	 }
			        	 else
			        	 {
			        		 Common.pause(5);
			        		 
			        	 }
			          String addToCartCounter11=null;
			          if(Common.isElementDisplayed(addToCartCounter)){
			           addToCartCounter11 = addToCartCounter.getText();
			           //Common.log("Current Counter:-<b>" + addToCartCounter + "</b>");
			          }else{
			           addToCartCounter11 = "0";
			           //Common.log("Current Counter:-<b>" + addToCartCounter + "</b>");
			          }
			          return addToCartCounter11;
			         }
			         
			         public int addToCartWishList(int logStep)  {
			          
			          Common.pause(3);
			          Common.logstep("Step " + (logStep++) + " : Click on 'Add All To Cart' button from 'Wish List' page.");
			          if(Common.isElementDisplayed(addAllToCartWishList)){
			          Common.clickOn(driver, addAllToCartWishList); 
			          Common.log("Clicked on 'Add All To Cart'.");
			          }else{
			           logStatus(ITestStatus.FAILED);
			           Assert.assertTrue(false, "Add All To Cart button is not availbale on 'WishList' page.");
			          }
			          return logStep;
			         }			
				
			      

			         @FindBy(xpath="//a[@class='btn-remove action delete']")
			         public List<WebElement> Remove_link;
			         public int RemoveBtnClick(int logStep)  {
				          
				          Common.pause(3);
				          Common.logstep("Step " + (logStep++) + " : Remove Product from 'Wish List' page.");
				          
				          if(Common.isElementDisplayed(totalWishProducts.get(0))){
				        	  //Common.moveToElementByJs(driver, totalWishProducts.get(0));
				        	  Common.mouseHover(driver, totalWishProducts.get(0));
				        	  if(targetBrowser.contains("iPhoneTablet")){
				        		  //totalWishProducts.get(0).click();
				        		  driver.findElement(By.xpath("(//a[@class='btn-remove action delete'])[last()]")).click();
				        		  /*((JavascriptExecutor) driver).executeScript(
				      					"return window.stop();");
				        		
				        		  Common.clickOn(driver, Remove_link.get(0));*/
				        		  //driver.findElement(By.xpath("//span[@class='action details tooltip toggle']")).click();
				        	     	//  Common.scrollToVertical(driver, Remove_link.get(0));
				        	  }
				        	  else
				        	  {
				        	 Common.clickOn(driver, Remove_link.get(0));
				        	  }
				          Common.log("Clicked on 'Remove item'.");
				          }else{
				           logStatus(ITestStatus.FAILED);
				           Assert.assertTrue(false, "Add All To Cart button is not availbale on 'WishList' page.");
				          }
				          return logStep;
				         }	
			         
				
				
}
