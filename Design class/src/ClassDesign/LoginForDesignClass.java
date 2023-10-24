package ClassDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForDesignClass {
	public static void main (String []a) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://Training/Automation/Workspace/Design class/Resources/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://user.dev.thedesignersclass.com/");
	driver.findElement(By.xpath("//li[@class='Header__ListData-sc-1gri2dd-12 gJkSCk ListData']/h5[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//div [@class='new-login-style__Wrapper-sc-h1irvq-9 fjsfWT']/input[@name='email']")).sendKeys("ramuekarr@gmail.com");
	driver.findElement(By.xpath("//div[@class='new-login-style__Wrapper-sc-h1irvq-9 fjsfWT']/input[@name='password']")).sendKeys("Naga123@");
	driver.findElement(By.xpath("//div[@class='new-login-style__BtnDiv-sc-h1irvq-11 gVSCJW']/button[@class='new-login-style__MainButton-sc-h1irvq-12 eFccEw']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'Okay')]")).click();
	
	driver.findElement(By.xpath("//div[contains(text(),'Interior')]"));
	Thread.sleep(3000);
	driver.quit();
	
}
} 