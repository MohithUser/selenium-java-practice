package com.techm.Automation;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;






public class GreenKArt_Demo {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	Scanner sc = new Scanner(System.in);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	String actual_text=driver.findElement(By.xpath("//*[contains(text(),'Cauliflower')]")).getText();
	String expected_text="Cauliflower - 1 Kg";
	System.out.println(actual_text.equals(expected_text));
	List<WebElement> products =driver.findElements(By.xpath("//*[@class='product-name']"));
	for(WebElement i : products)
	{
		System.out.println(i.getText());
	}
	System.out.println("Total no of products are :"+products.size());
	System.out.println("Enter the index number to fetch the element size :");
	int i = sc.nextInt();
	System.out.println("The"+i+"th element in the text is: "+products.get(i).getText());
}
}

