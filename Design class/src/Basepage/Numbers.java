package Basepage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Numbers extends Basetest {
	@Test
	public void Signupwithphonenumbers() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='Header__ListData-sc-1gri2dd-12 gJkSCk ListData']/h5[contains(text(),'Login')]")).click();
		  
		  driver.findElement(By.xpath("//u[contains(text(),'SIGN UP')]")).click();
		  driver.findElement(By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='firstName'])[1]")).sendKeys("123");
		  driver.findElement(By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='lastName'])[1]")).sendKeys("456789");
		  driver.findElement(By.xpath("(//div[@class=' react-tel-input']/input[@value='+91'])[1]")).sendKeys("9380129609");
		  driver.findElement(By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='emailId'])[1]")).sendKeys("ramuekarr@gmail.com");
		  driver.findElement(By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='password'])[1]")).sendKeys("Naga123@");
		  driver.findElement(By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='confirmPassword'])[1]")).sendKeys("Naga123@");
		  driver.findElement(By.xpath("(//div/select[@class='new-signout-style__CustomSelect-sc-21m3e5-10 cempqd'])[1]")).sendKeys("Fashion Design");
		  driver.findElement(By.xpath("(//select[@name='COUNTRY'])[1]")).sendKeys("India");
		  driver.findElement(By.xpath("(//select[@name='rcrs-region'])[1]")).sendKeys("Andra pradesh ");
		  driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys("Hyderbad");
		  driver.findElement(By.xpath("(//div[@class='select-wid']/select[@class='new-signout-style__CustomSelect-sc-21m3e5-10 cempqd'])[1]")).sendKeys("Male"); 
		  driver.findElement(By.xpath("//input[@placeholder='DOB | MM/DD/YYYY']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/p/div/div/div/div[2]/div[2]/div[9]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[6]")).click();
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		  driver.findElement(By.xpath("(//button[contains(text(),'SIGN UP')])[1]")).click();
		  Thread.sleep(3000);
		  driver.close();
		  }
	}


