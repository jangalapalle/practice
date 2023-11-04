package Basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basetest {
	WebDriver driver;
	@BeforeMethod
public void LauchBrowser() throws InterruptedException {
	String Browsename="Firefox";
	if( Browsename=="Chrome") {
		System.setProperty("webdriver.chrome.driver","C:\\Training\\Automation\\Workspace\\Design class\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	
}
	else {
		System.setProperty("webdriver.gecko.driver","C:\\Training\\Automation\\Workspace\\Design class\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
}
	@BeforeMethod(dependsOnMethods="LauchBrowser")
	public void LauchApplication() {
		driver.get("https://user.dev.thedesignersclass.com/");
	}
@AfterMethod
public void close(){
	driver.close();
}
}