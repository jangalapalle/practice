package ClassDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signupdesignclass {
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Training/Automation/Workspace/Design class/Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://user.dev.thedesignersclass.com/");
		driver.findElement(
				By.xpath("//li[@class='Header__ListData-sc-1gri2dd-12 gJkSCk ListData']/h5[contains(text(),'Login')]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//u[contains(text(),'SIGN UP')]")).click();
		driver.findElement(
				By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='firstName'])[1]"))
				.sendKeys("Naga Sekhar Reddy");
		driver.findElement(
				By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='lastName'])[1]"))
				.sendKeys("Ummadi");
		driver.findElement(By.xpath("(//div[@class=' react-tel-input']/input[@value='+91'])[1]"))
				.sendKeys("6303152553");
		driver.findElement(
				By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='emailId'])[1]"))
				.sendKeys("nagasekarr@gmail.com");
		driver.findElement(
				By.xpath("(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='password'])[1]"))
				.sendKeys("Naga123@");
		driver.findElement(By.xpath(
				"(//div[@class='new-signout-style__Wrapper-sc-21m3e5-9 bIAvPN']/input[@name='confirmPassword'])[1]"))
				.sendKeys("Naga123@");
		driver.findElement(By.xpath("(//div/select[@class='new-signout-style__CustomSelect-sc-21m3e5-10 cempqd'])[1]"))
				.sendKeys("Fashion Design");
		driver.findElement(By.xpath("(//select[@name='COUNTRY'])[1]")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//select[@name='rcrs-region'])[1]")).sendKeys("Andra pradesh ");
		driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys("Hyderbad");
		driver.findElement(By.xpath(
				"(//div[@class='select-wid']/select[@class='new-signout-style__CustomSelect-sc-21m3e5-10 cempqd'])[1]"))
				.sendKeys("Male");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='DOB | MM/DD/YYYY']")).click();

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/body/div[2]/div/div/p/div/div/div/div[2]/div[2]/div[9]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'SIGN UP')])[1]")).click();
		 driver.quit();

	}
}