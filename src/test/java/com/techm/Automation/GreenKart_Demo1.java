package com.techm.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart_Demo1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[contains(text(),'Top Deals')]")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement calendarButton = wait.until(
	    ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='react-date-picker__wrapper']//*[contains(@class,'react-date-picker__calendar-button')])[2]"))
	);
	
	//driver.findElement(By.xpath("//*[contains(@class,'calendar__navigation__label__labelText')]")).click();
	
}
}
