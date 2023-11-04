package Basepage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Loginwithnumbers extends Basetest {
@Test
public void Invalidcredentials() {
	
	driver.findElement(
			By.xpath("//li[@class='Header__ListData-sc-1gri2dd-12 gJkSCk ListData']/h5[contains(text(),'Login')]"))
			.click();
	driver.findElement(
			By.xpath("//div [@class='new-login-style__Wrapper-sc-h1irvq-9 fjsfWT']/input[@name='email']"))
			.sendKeys("123");
	driver.findElement(
			By.xpath("//div[@class='new-login-style__Wrapper-sc-h1irvq-9 fjsfWT']/input[@name='password']"))
			.sendKeys("123@");
	driver.findElement(By.xpath(
			"//div[@class='new-login-style__BtnDiv-sc-h1irvq-11 gVSCJW']/button[@class='new-login-style__MainButton-sc-h1irvq-12 eFccEw']"))
			.click();
	driver.close();
}
}
