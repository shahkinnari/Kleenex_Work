package com.Kleenex.Init;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.internal.Utils;

import com.Kleenex.BrandShop.IndexPage.Brandshop_indexpage22;
import com.Kleenex.BrandShop.Verification.Brandshop_verification;
import com.Kleenex.Utility.TestDataConfig;
import com.Kleenex.BostonInteriors.IndexPage.Boston_indexpage;
import com.Kleenex.BostonInteriors.Verification.Boston_verification;
/*import com.Kleenex.DollarGeneral.IndexPage.DollarG_IndexPage;
import com.Kleenex.DollarGeneral.Verification.DollarG_Verification;*/

import io.appium.java_client.AppiumDriver;


public class SeleniumInit {


	public String contact_no = "9429186891";
	public String inv_contact_no = "dsjh(*&^(^(";
	public String blank = " ";
	public String a_pswd2 = "T";
	public String a_pswd3 = "Test@";
	public String a_pswd4 = "Test@1";
	public String a_pswd5 = "Test@123";
	public String a_pswd1 = "Test123";
	public String a_pswd = "Test@123";

	public String suiteName = "";
	public String testName = "";
	/* Minimum requirement for test configur ation */
	protected String testUrl; // Test url
	public static String seleniumHub; // Selenium hub IP
	public static String seleniumHubPort; // Selenium hub port
	public static String targetBrowser; // Target browser
	protected static String test_data_folder_path = null;
	public static String currentWindowHandle = "";// Get Current Window handle
	public static String browserName = "";
	public static String osName = "";
	public static String browserVersion = "";

	//public LoginIndexPage loginIndexpage;
	//public LoginVerificationPage loginVerificationPage;
/*	public mutexAdminIndexpage mutexAdminPortalIndexpage;
	public mutexAdminVerificaton mutexAdminportalVerification;*/
	
	//===============================================================CC
	
//	public ContactDetailsVerification contactDetailsVerification;
//	public ContactDetailsIndexpage contactDetailsIndexpage;
	
	/*public AsbacomIndexPage AsbaIndexPage;
	public AsbacomVerification AsbaVerification;
	public New_AsbaIndexPage N_ASIndexPage;
	public Exi_New_AsbacomIndexPage Exi_N_IndexPage;
	public Exi_Exi_AsbacomIndexPage Exi_E_IndexPage;
	public New_Exi_AsbacomIndexPage New_E_IndexPage;*/
 
	
	public Brandshop_indexpage22 BS_Indexpage;
	public Brandshop_verification BS_Veri;
	public Boston_indexpage BI_Indexpage;
	public Boston_verification BI_veri;
/*	public DollarG_IndexPage DG_Indexpage;
	public DollarG_Verification DG_veri;
*/

	 
	protected static String screenshot_folder_path = null;
	public static String currentTest; // current running test

	protected static Logger logger = Logger.getLogger("testing");
	protected WebDriver driver;
	


	// Common Common = new Common(driver);

	/* Page's declaration */

	/**
	 * Fetches suite-configuration from XML suite file.
	 * 
	 * @param testContext
	 * @throws IOException 
	 */

	@BeforeTest(alwaysRun = true)
	public void fetchSuiteConfiguration(ITestContext testContext) throws IOException {
		testUrl = testContext.getCurrentXmlTest().getParameter("selenium.url");
		/* System.out.println("======" + testUrl + "========="); */
		seleniumHub = testContext.getCurrentXmlTest().getParameter(
				"selenium.host");
		seleniumHubPort = testContext.getCurrentXmlTest().getParameter(
				"selenium.port");
		/*targetBrowser = testContext.getCurrentXmlTest().getParameter(
				"selenium.browser");*/
		TestDataConfig dataConfig= new TestDataConfig();
		targetBrowser = dataConfig.getValueFromConfig("Browser");
		System.out.println("-----------------------------------------********************************Target Brpwser ISS:- "+targetBrowser);
	}

	/**
	 * WebDriver initialization
	 * 
	 * @return WebDriver object
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@BeforeMethod(alwaysRun = true)
	public void setUp(Method method, ITestContext testContext)
			throws IOException, InterruptedException {

		/*
		 * Runtime runtime = Runtime.getRuntime(); runtime.exec(
		 * "java -jar D:\\NFHS_JARS\\selenium-server-standalone-2.46.0.jar -role hub"
		 * );
		 * System.out.println("==================Server started================="
		 * ); Thread.sleep(2000);
		 * 
		 * 
		 * Runtime runtime2 = Runtime.getRuntime(); runtime2.exec(
		 * "java -jar D:\\NFHS_JARS\\selenium-server-standalone-2.46.0.jar -role node -port 5554"
		 * ); System.out.println(
		 * "=======================Node started====================");
		 * Thread.sleep(2000);
		 */
		String path = "";
		if (System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
			//path = "/Users/Jignesh/developer/test-automation";
		} else {
			//path = "c:\\Downloads_new";
		}
		File theDir = new File(path);
		// if the directory does not exist, create it
		if (!theDir.exists()) {
			System.out.println("creating directory: ");
			boolean result = false;

			try {
				theDir.mkdir();
				result = true;
			} catch (SecurityException se) {
				// handle it
			}
			if (result) {
				System.out.println("DIR created");
			}
		}
System.err.println("Selenium hub is:"+seleniumHub + ""+seleniumHubPort);
		currentTest = method.getName(); // get Name of current test.
		URL remote_grid = new URL("http://" + seleniumHub + ":"
				+ seleniumHubPort + "/wd/hub");

		String SCREENSHOT_FOLDER_NAME = "screenshots";
		String TESTDATA_FOLDER_NAME = "test_data";

		test_data_folder_path = new File(TESTDATA_FOLDER_NAME)
				.getAbsolutePath();
		screenshot_folder_path = new File(SCREENSHOT_FOLDER_NAME)
				.getAbsolutePath();

		DesiredCapabilities capability = null;
		if (targetBrowser == null || targetBrowser.contains("firefox")) {
			FirefoxProfile profile = new FirefoxProfile();
			if (System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
				path = "/Users/Jignesh/developer/test-automation";
			} else {
				path = "c:\\Downloads_new";
			}

			profile.setPreference("dom.max_chrome_script_run_time", "999");
			profile.setPreference("dom.max_script_run_time", "999");
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", path);
			profile.setPreference(
					"browser.helperApps.neverAsk.openFile",
					"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
			profile.setPreference(
					"browser.helperApps.neverAsk.saveToDisk",
					"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
			profile.setPreference("browser.download.manager.showWhenStarting",
					false);
			profile.setPreference("browser.download,manager.focusWhenStarting",
					false);
			// profile.setPreference("browser.download.useDownloadDir",true);
			profile.setPreference("browser.helperApps.alwaysAsk.force", false);
			profile.setPreference("browser.download.manager.alertOnEXEOpen",
					false);
			profile.setPreference("browser.download.manager.closeWhenDone",
					false);
			profile.setPreference(
					"browser.download.manager.showAlertOnComplete", false);
			profile.setPreference("browser.download.manager.useWindow", false);
			profile.setPreference("browser.download.manager.showWhenStarting",
					false);

			profile.setPreference(
					"services.sync.prefs.sync.browser.download.manager.showWhenStarting",
					false);
			profile.setPreference("pdfjs.disabled", true);
			profile.setAcceptUntrustedCertificates(true);
			profile.setPreference("security.OCSP.enabled", 0);
			profile.setEnableNativeEvents(false);
			profile.setPreference("network.http.use-cache", false);

			// added Dependancy to disable hardware acceleration.

			/*
			 * profile.setPreference("gfx.direct2d.disabled",true);
			 * profile.setPreference("layers.acceleration.disabled", true);
			 */

			profile.setPreference("gfx.direct2d.disabled", true);
			profile.setPreference("layers.acceleration.disabled", true);
			// profile.setPreference("webgl.force-enabled", true);
			// Proxy proxy = new Proxy().setHttpProxy("localhost:3129");

			// cap.setCapability(CapabilityType.PROXY, proxy);

			capability = DesiredCapabilities.firefox();
			// proxy code
			// capability.setCapability(CapabilityType.PROXY,proxy);
			capability.setJavascriptEnabled(true);
			capability.setCapability(FirefoxDriver.PROFILE, profile);
			browserName = capability.getBrowserName();
			osName = System.getProperty("os.name");
			browserVersion = capability.getVersion().toString();

			System.out.println("=========" + "firefox Driver " + "==========");
			driver =new RemoteWebDriver(remote_grid, capability);

		} else if (targetBrowser.contains("ie8")) {

			capability = DesiredCapabilities.internetExplorer();
			capability.setPlatform(Platform.ANY);
			capability.setBrowserName("internet explorer");
			// capability.setVersion("8.0");
			capability
					.setCapability(
							InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
							true);
			capability.setCapability(
					CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
					true);
			capability.setJavascriptEnabled(true);
			browserName = capability.getBrowserName();
			osName = capability.getPlatform().name();
			browserVersion = capability.getVersion();
		}  else if (targetBrowser.contains("ie9")) {
			capability = DesiredCapabilities.internetExplorer();
			capability.setBrowserName("internet explorer");
			capability
					.setCapability(
							InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
							true);
			capability.setCapability(
					CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
					true);
			capability.setJavascriptEnabled(true);
			browserName = capability.getBrowserName();
			osName = capability.getPlatform().name();
			browserVersion = capability.getVersion();
		} else if (targetBrowser.contains("Appium")) {

			System.out.println("Android Appium Device------");

			DesiredCapabilities caps = DesiredCapabilities.android();
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("platform", Platform.ANY);
			caps.setCapability("platformVersion", "6.0");
			 caps.setCapability("deviceName","Samsung Galaxy");
			caps.setCapability("platformName", "Android");

			caps.setJavascriptEnabled(true);

			this.driver = new AppiumDriver(
					new URL(
							"http://127.0.0.1:4723/wd/hub"),
					caps);

		}
		else if (targetBrowser.contains("ie11")) {
			capability = DesiredCapabilities.internetExplorer();
			System.setProperty("webdriver.ie.driver",
					"D:/Automation Driver/IEDriverServer_x64_2.48.0/IEDriverServer.exe");

			capability.setBrowserName("internet explorer");
			capability
					.setCapability(
							InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
							true);
			capability.setCapability(
					CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
					true);
			capability.setJavascriptEnabled(true);
			browserName = capability.getVersion();
			osName = capability.getPlatform().getCurrent().name();
			browserVersion = capability.getVersion();

			driver = (AppiumDriver) new RemoteWebDriver(remote_grid, capability);

		}
			   
			   
		
		else if (targetBrowser.contains("opera")) {
			capability = DesiredCapabilities.opera();
			System.setProperty("webdriver.opera.driver",
					"C:/Users/KQSPL_R/Desktop/Automation Driver/operadriver_win32/operadriver.exe");

			capability.setJavascriptEnabled(true);
			browserName = capability.getVersion();
			osName = capability.getPlatform().getCurrent().name();
			browserVersion = capability.getVersion();

			//driver = new OperaDriver(capability);
		
		}else if (targetBrowser.equalsIgnoreCase("androidMobile")) {
			
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "Samsung Galaxy S4");
			//mobileEmulation.put("deviceName", "Samsung Galaxy S5");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			//WebDriver driver = new ChromeDriver(capabilities);
			File ChromeDriver = new File("Resource\\chromedriver.exe");
			System.err.println(ChromeDriver.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver",
					ChromeDriver.getAbsolutePath());
			capabilities.setBrowserName("chrome");
			capabilities.setJavascriptEnabled(true);
			browserName = capabilities.getVersion();
			osName = capabilities.getPlatform().name();
			browserVersion = capabilities.getVersion();
			driver = new RemoteWebDriver(remote_grid, capabilities);
			
		
		}else if (targetBrowser.equalsIgnoreCase("androidTablet")) {
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "Google Nexus 7");
			//mobileEmulation.put("deviceName", "Samsung Galaxy S5");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			//WebDriver driver = new ChromeDriver(capabilities);
			File ChromeDriver = new File("Resource\\chromedriver.exe");
			System.err.println(ChromeDriver.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver",
					ChromeDriver.getAbsolutePath());
			capabilities.setBrowserName("chrome");
			capabilities.setJavascriptEnabled(true);
			browserName = capabilities.getVersion();
			osName = capabilities.getPlatform().name();
			browserVersion = capabilities.getVersion();
			driver = new RemoteWebDriver(remote_grid, capabilities);
			
		
		}else if (targetBrowser.equalsIgnoreCase("iPhoneMobile")) {
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			//mobileEmulation.put("deviceName", "Apple iPhone 6 Plus");
			mobileEmulation.put("deviceName", "Apple iPhone 6");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			//WebDriver driver = new ChromeDriver(capabilities);
			File ChromeDriver = new File("Resource\\chromedriver.exe");
			System.err.println(ChromeDriver.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver",
					ChromeDriver.getAbsolutePath());
			capabilities.setBrowserName("chrome");
			capabilities.setJavascriptEnabled(true);
			browserName = capabilities.getVersion();
			osName = capabilities.getPlatform().name();
			browserVersion = capabilities.getVersion();
			driver = new RemoteWebDriver(remote_grid, capabilities);
		
			
		}else if (targetBrowser.equalsIgnoreCase("iPhoneTablet")) {
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			//mobileEmulation.put("deviceName", "Apple iPhone 6 Plus");
			mobileEmulation.put("deviceName", "Apple iPad");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			//capabilities.ipad();
			//WebDriver driver = new ChromeDriver(capabilities);
			File ChromeDriver = new File("Resource\\chromedriver.exe");
			System.err.println(ChromeDriver.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver",
					ChromeDriver.getAbsolutePath());
			capabilities.setBrowserName("chrome");
			capabilities.setJavascriptEnabled(true);
			browserName = capabilities.getVersion();
			osName = capabilities.getPlatform().name();
			browserVersion = capabilities.getVersion();
			driver = new RemoteWebDriver(remote_grid, capabilities);
		
		}else if (targetBrowser.equalsIgnoreCase("chrome")) {

			capability = DesiredCapabilities.chrome();
			File ChromeDriver = new File("Resource\\chromedriver.exe");
			System.err.println(ChromeDriver.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver",
					ChromeDriver.getAbsolutePath());
			// driver = new RemoteWebDriver(new
			// URL("http://localhost:4444/wd/hub"), capability);
			capability.setBrowserName("chrome");
			capability.setJavascriptEnabled(true);
			browserName = capability.getVersion();
			osName = capability.getPlatform().name();
			browserVersion = capability.getVersion();
			driver = new RemoteWebDriver(remote_grid, capability);

		} else if (targetBrowser.contains("safari")) {

			SafariDriver profile = new SafariDriver();
			capability = DesiredCapabilities.safari();
			capability.setJavascriptEnabled(true);
			capability.setBrowserName("safari");
			browserName = capability.getBrowserName();
			osName = capability.getPlatform().name();
			browserVersion = capability.getVersion();
		}
		suiteName = testContext.getSuite().getName();
		System.out.println("------------------------------------------------------------"+suiteName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//testUrl = TestData.getAdminURL();
		
		driver.get(testUrl);
		System.out.println("URL TEST ID:"+testUrl);
		if (!targetBrowser.contains("Android") || !targetBrowser.contains("saucelabiphone") ) {
		
		driver.manage().window().maximize();
		currentWindowHandle = driver.getWindowHandle();
		System.out.println("Current Window Handle ID:--->"
				+ currentWindowHandle);
		}

		suiteName = testContext.getSuite().getName();
		System.out.println("Current Xml Suite is:---->" + suiteName);

		//objects 
	
		
		
		BS_Indexpage = new Brandshop_indexpage22(driver);
		BS_Veri = new Brandshop_verification(driver);
		BI_Indexpage = new Boston_indexpage(driver);
		BI_veri = new Boston_verification(driver);
		/*DG_Indexpage = new DollarG_IndexPage(driver);
		DG_veri = new DollarG_Verification(driver);
		
		*/

		
	}

		  
	

	/**
	 * Log For Failure Test Exception.
	 * 
	 * @param tests
	 */
	private void getShortException(IResultMap tests) {

		for (ITestResult result : tests.getAllResults()) {

			Throwable exception = result.getThrowable();
			List<String> msgs = Reporter.getOutput(result);
			boolean hasReporterOutput = msgs.size() > 0;
			boolean hasThrowable = exception != null;
			if (hasThrowable) {
				boolean wantsMinimalOutput = result.getStatus() == ITestResult.SUCCESS;
				if (hasReporterOutput) {
					log("<h3>"
							+ (wantsMinimalOutput ? "Expected Exception"
									: "Failure Reason:") + "</h3>");
				}

				// Getting first line of the stack trace
				String str = Utils.stackTrace(exception, true)[0];
				Scanner scanner = new Scanner(str);
				String firstLine = scanner.nextLine();
				log(firstLine);
			}
		}
	}

	/**
	 * After Method
	 * 
	 * @param testResult
	 */

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult testResult) {

		ITestContext ex = testResult.getTestContext();

		try {
			testName = testResult.getName();
			if (!testResult.isSuccess()) {

				/* Print test result to Jenkins Console */
				System.out.println();
				System.out.println("TEST FAILED - " + testName);
				System.out.println();
				System.out.println("ERROR MESSAGE: "
						+ testResult.getThrowable());
				System.out.println("\n");
				Reporter.setCurrentTestResult(testResult);

				/* Make a screenshot for test that failed */
				String screenshotName = Common.getCurrentTimeStampString()
						+ testName;
				Reporter.log("<br> <b>Please look to the screenshot - </b>");
				Common.makeScreenshot(driver, screenshotName);
				// Reporter.log(testResult.getThrowable().getMessage());
				getShortException(ex.getFailedTests());
			} else {
				try {
					Common.pause(5);
					/*
					 * driver.findElement(
					 * By.xpath("//div[@class='container']//a[contains(.,'Logout')]"
					 * )) .click();
					 */
					Common.pause(5);
				} catch (Exception e) {
					log("<br></br> Not able to perform logout");
				}

				System.out.println("TEST PASSED - " + testName + "\n"); // Print
																		// test
																		// resule
																		// to
																		// Jenkins
																		// Console
			}

			/*
			 * final File folder = new File("C:/Downloads_new"); File files[] =
			 * folder.listFiles();
			 * 
			 * if (files.length > 0) { for (File f : files) { if (f.delete()) {
			 * System.out .println("file deleted From Downloads_new folder"); }
			 * }
			 * 
			 * }
			 */

			System.out.println("here is test status--------------------"
					+ testResult.getStatus());

			driver.manage().deleteAllCookies();

			driver.close();
			driver.quit();

		} catch (Throwable throwable) {
			System.out.println("message from tear down"
					+ throwable.getMessage());
		}
	}
	
	public static void logStatus(final int test_status) {

		switch (test_status) {

		case ITestStatus.PASSED:
			log("<font color=#009900><b>--Passed</b></font></br></br>");
			break;

		case ITestStatus.FAILED:
			log("<font color=#FF0000><b>--Failed</b></font></br></br>");
			break;

		case ITestStatus.SKIPPED:
			log("<font color=#FFFF00><b>--Skipped</b></font></br></br>");
			break;

		default:
			break;
		}

	}

	/**
	 * Log given message to Reporter output.
	 * 
	 * @param msg
	 *            Message/Log to be reported.
	 */
	public static void log(String msg) {
		System.out.println(msg);
		Reporter.log("<br></br>" + msg);
	}

}
