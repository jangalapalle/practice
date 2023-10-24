
package com.framework.base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.framework.dataacess.ExcelUtil;
import com.framework.dataacess.PropertyUtil;
import com.framework.reports.ExtentReport;

public class BaseTest {

	private static WebDriver driver;
	public static ExtentTest test;
	ExtentReport extentReport = new ExtentReport();
	String testName;

	@BeforeSuite
	public void initialize() {
		extentReport.initializeReport();
		PropertyUtil.initialize();
		ExcelUtil.initializeExcel();
		ExcelUtil.readAllDataFromExcel();

	}

	@BeforeMethod
	public void launchBrowser(Method method, ITestContext context) {

		testName = method.getName();
		String moduleName = context.getName();
		test = extentReport.createExtentTest(testName, moduleName);

		String browserName = PropertyUtil.readValue("browserName");
		String path = System.getProperty("user.dir");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + PropertyUtil.readValue("chromeDriverPath"));
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", path + "\\src\\test\\resources\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", path + "\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid input for the Browser");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ExtentReport.logMessage(Status.PASS, "Successfully Lauched the Browser", false);

	}

	@BeforeMethod(dependsOnMethods = "launchBrowser")
	public void launchApplication() {

		String url = PropertyUtil.readValue("url");
		driver.get(url);
		ExtentReport.logMessage(Status.PASS, "Enter Url: " + url, false);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		ExtentReport.logMessage(Status.PASS, "Successfully closed the Browser", false);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@AfterSuite
	public void tearDown() {
		extentReport.flushTests();
	}
	
	public String getData(String colName) {
		String value = ExcelUtil.readData(testName, colName);
		return value;
	}

}
