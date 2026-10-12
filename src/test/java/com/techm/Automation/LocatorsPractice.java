package com.techm.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	WebElement Username=driver.findElement(By.id("inputUsername"));
	WebElement Password=driver.findElement(By.name("inputPassword"));
	Username.sendKeys("Mohith");
	Password.sendKeys("password");
//	driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
//	driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	WebElement signinbtn =driver.findElement(By.cssSelector(".signInBtn"));
	signinbtn.click();
	System.out.println(driver.findElement(By.cssSelector(".error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("Sai");
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("ms123@gmail.com");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9876543210");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String info =driver.findElement(By.cssSelector(".infoMsg")).getText();
	String temp_password=info.substring(31,49);
	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	Username.sendKeys("Sai");
	Password.sendKeys(temp_password);
	Thread.sleep(5000);
	signinbtn.click();
	String WelcomeMessage=driver.findElement(By.xpath("//div[@class='login-container']")).getText();
	System.out.println(WelcomeMessage);
	driver.findElement(By.cssSelector(".logout-btn")).click();
	
	
	//driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	//driver.close();
	
}
}
