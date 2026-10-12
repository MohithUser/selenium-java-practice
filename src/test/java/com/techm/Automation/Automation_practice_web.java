package com.techm.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation_practice_web {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.cssSelector("input[value='radio1']")).click();
	driver.findElement(By.xpath("//select/option[@value='option1']")).click();
	driver.findElement(By.id("checkBoxOption1")).click();
	driver.findElement(By.id("autocomplete")).sendKeys("ind");
	
}
}
