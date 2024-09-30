package itlearnjunit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dashboard1 {
	static WebDriver driver;
	@BeforeClass
	
	public static void beoreclas(){
		
		Date d = new Date();
		System.out.println("start time "+d);
	//launch url
		driver=new ChromeDriver();
	driver.get("https://www.itlearn360.com");
	}
	@Test
	public void sample1 () throws InterruptedException, AWTException{
	
	WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
	
	sign.click();
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	
	//user sign in
	WebElement element = driver.findElement(By.id("user_login"));
	element.sendKeys("KAMATCHI11");
	WebElement element2 = driver.findElement(By.id("user_pass"));
	element2.sendKeys("KAMATCHI456$");
	WebElement element3 = driver.findElement(By.name("wp-submit"));
	element3.click();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//Dashboard
	WebElement DB = driver.findElement(By.xpath("//span[text()='My Dashboard']"));
	DB.click();
	driver.manage().window().fullscreen();
	
	//mycourse
	WebElement element4 = driver.findElement(By.xpath("//a[text()='My Courses']"));
	element4.click();
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	
	//offered academics
	WebElement element5 = driver.findElement(By.xpath("//a[text()='Offered Academies']"));
	element5.click();
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	
	//My Todolists
	WebElement element6 = driver.findElement(By.xpath("//a[text()='My Todolists']"));
	element6.click();
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
		
	//My career paths
	WebElement element7 = driver.findElement(By.xpath("//a[text()='My Career Paths']"));
	element7.click();
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	
	//My Subcriptions
	WebElement element8 = driver.findElement(By.xpath("//a[text()='My Subscriptions']"));
	element8.click();
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	
	//Change Payment Method
	WebElement element9 = driver.findElement(By.xpath("//a[text()='Change Payment Method']"));
	element9.click();
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	
	//Add Card Details
	WebElement element10 = driver.findElement(By.id("learn-press-change-card-detail"));
	element10.click();
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	
	
	//Email
	WebElement element16 = driver.findElement(By.xpath("//input[@name='spemail']"));
	element16.click();
	
	  Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_BACK_SPACE);
	r.keyRelease(KeyEvent.VK_BACK_SPACE);
	element16.sendKeys("Test@gmail.com");
	
	
      // Enter Card Details
		
//	
//	  WebElement element11 = driver.findElement(By.xpath("//input[@placeholder='Card number']"));
//	  Thread.sleep(2000);
//	  element11.sendKeys("1234 5678 9876 5432");
//	  
//	  //ExpDate
//	  WebElement element11a = driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
//	  Thread.sleep(2000);
//	  element11a.sendKeys("28/30");
//  
//	  //CVV 
//	  WebElement element11b = driver.findElement(By.xpath("//input[@placeholder='CVC']"));
//	  Thread.sleep(2000);
//	  element11b.sendKeys("211");
//	  Thread.sleep(2000);
    
	
	//cancel button
	WebElement element12 = driver.findElement(By.xpath("//button[text()='Cancel']"));
	Thread.sleep(2000);
	element12.click();
	
	driver.manage().window().fullscreen();
	
	//SETTINGS
	WebElement element12A = driver.findElement(By.xpath("//a[text()='Settings']"));
	Thread.sleep(2000);
	element12A.click();
	driver.manage().window().fullscreen();
	
	
	//Avatar
		WebElement element13 = driver.findElement(By.xpath("//a[text()='Avatar']"));
		Thread.sleep(2000);
		element13.click();
		driver.manage().window().fullscreen();
		
	
		//change password
		WebElement element14 = driver.findElement(By.xpath("//a[text()='Change Password']"));
		Thread.sleep(2000);
		element14.click();
		driver.manage().window().fullscreen();
		
		// Logout
		WebElement element15 = driver.findElement(By.xpath("//a[text()='Logout']"));
		element15.click();
		driver.manage().window().fullscreen();
//		driver.close();
		Date d1 = new Date();
		System.out.println("End time "+d1);
	
}
@AfterClass
	
	public static void afterclas(){

		driver.quit();
	}
}
