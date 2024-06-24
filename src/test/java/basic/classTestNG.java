package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class classTestNG {

	WebDriver driver ;
	@BeforeSuite
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void openUrl()
	{
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
	}
	@Test
	public void Frame1()
	{
		//Frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // Switch to Frame 1 //passed frame as webelement
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		driver.switchTo().defaultContent();

	}
	
	@Test
	public void Frame2()
	{
		//Frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); // Switch to Frame 2 //passed frame as webelement
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		
		//Frame 3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3); // Switch to Frame 3 //passed frame as webelement
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("TestNG");
		//driver.switchTo().defaultContent();
		
		//Inner Frame 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
		
	}
	
	
}
