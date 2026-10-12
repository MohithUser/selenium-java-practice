
package com.techm.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	//
	WebElement Username=driver.findElement(By.id("inputUsername"));
	Username.sendKeys("admin");
	WebElement Password=driver.findElement(By.name("inputPassword"));
	Password.sendKeys("admin123");
	driver.findElement(By.cssSelector("#chkboxTwo")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("mohith");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rmsaiteja83@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9676028075");
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	
	// 'rahulshettyacademy'
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	driver.findElement(By.className("go-to-login-btn")).click(); 
	Username.sendKeys("Mohith");
	Password.sendKeys("rahulshettyacademy");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class=\"login-container\"]/h2")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class=\"login-container\"]/h1")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class=\"login-container\"]/p")).getText());
	driver.findElement(By.className("logout-btn")).click();
	System.out.println("Logged out ");
}
}
