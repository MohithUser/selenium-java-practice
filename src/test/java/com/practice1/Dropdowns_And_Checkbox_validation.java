package com.practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_And_Checkbox_validation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// checkboxes 
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println("Check box 1 clicked ");
		// select dropdownt
		Select select = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		select.selectByValue("option2");
		System.out.println("option2 selected");
	}
}
