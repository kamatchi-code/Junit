package itlearnjunit;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MasterofSoftwareTesting {
public static void main(String[] args) throws InterruptedException, IOException {

	//configure browser
	WebDriver driver =new EdgeDriver();//sign in//span[contains(text(),'sign in?')]
	
	//launch url
	Date d = new Date();
	System.out.println("start time "+d);
	
	driver.get("https://www.itlearn360.com/career-paths/master-of-manual-testing/#learningcourses");
	driver.manage().window().maximize();
	
	
	WebElement middle = driver.findElement(By.xpath("//h3[contains(text(),'About Career Path')]"));
	JavascriptExecutor jk =(JavascriptExecutor)driver;	
	jk.executeScript("arguments[0].scrollIntoView(true)", middle);
	
	//Overview
	WebElement element = driver.findElement(By.xpath("//a[text()='Overview']"));
	Thread.sleep(2000);
	element.click();
	
	WebElement element1 = driver.findElement(By.xpath("//a[text()='Key Benefits']"));
	Thread.sleep(2000);
	element1.click();
	
	WebElement element2 = driver.findElement(By.xpath("//a[text()='Target Audience']"));
	Thread.sleep(2000);
	element2.click();
	
	WebElement element2a = driver.findElement(By.xpath("/html/body/div[1]/div/main/article/div[4]/div[1]/ul/li[4]/a"));
	Thread.sleep(3000);
	element2a.click();
	
	WebElement element3 = driver.findElement(By.xpath("//a[text()='Courses']"));
	Thread.sleep(3000);
	element3.click();
	
	WebElement element4 = driver.findElement(By.xpath("//a[text()='Marketing demand']"));
	Thread.sleep(3000);
	element4.click();
	
	
	WebElement element5 = driver.findElement(By.xpath("//button[text()='Enroll Now']"));
	Thread.sleep(2000);
	element5.click();
	
	
	
//	 //screen shot of submit button
//	
//	TakesScreenshot tk = (TakesScreenshot) driver;
//	File src=tk.getScreenshotAs(OutputType.FILE);
//	System.out.println(src);
//	 Thread.sleep(2000);
//	File desc = new File("C:\\Users\\kamsr\\OneDrive\\Desktop\\SeleniumBrowser\\ScreenShot\\btn2.png") ;
//	    FileUtils.copyFile(src, desc);
//    Thread.sleep(4000);
//    
	
//	WebElement  scroll= driver.findElement(By.xpath("//h3[text()='Ready to join?']"));
//	jk.executeScript("arguments[0].scrollIntoView(false)", scroll);
//	
	 
	
	WebElement element6 = driver.findElement(By.xpath("/html/body/div[1]/div/main/article/div[4]/div[1]/ul/li[8]/a"));
	Thread.sleep(1000);
	element6.click();
	

	Thread.sleep(1000);
	
	
	WebElement top = driver.findElement(By.xpath("/html/body/div[1]/div/main/article/div[1]/div/div[1]/h1"));
	jk.executeScript("arguments[0].scrollIntoView(false)", top);
	Thread.sleep(2000);
	
    
	Date d1 = new Date();
	System.out.println("End time "+d1);
	
	driver.quit();
	
	
	
	
}
}
