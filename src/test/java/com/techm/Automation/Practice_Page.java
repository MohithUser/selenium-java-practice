package com.techm.Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Page {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	List<WebElement> tableelements=driver.findElements(By.xpath("//table[@name='courses']//tr"));
	for(WebElement a:tableelements)
	{
		System.out.println(a.getText());
	}
	System.out.println("Printed all the course names");


	
	
	
	//driver.quit();
	
}
}
