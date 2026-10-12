package com.techm.Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='widget']/descendant::*[contains(text(),'Resizable')]")).click();
		// getting list of elements 
		List<WebElement> all =driver.findElements(By.xpath("(//*[contains(text(),'Interactions')]/following::ul)[1]"));
		for(WebElement a : all)
		{
			System.out.println(a.getText());
		}
	}
}
