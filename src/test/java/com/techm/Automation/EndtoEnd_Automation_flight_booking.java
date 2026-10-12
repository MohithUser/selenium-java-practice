package com.techm.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EndtoEnd_Automation_flight_booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement Oneway_radiobtn= driver.findElement(By.xpath("//*[contains(@id,'_rbtnl_Trip_0')]"));
		WebElement Roundtrip_radiobtn=driver.findElement(By.xpath("//*[contains(@id,'_rbtnl_Trip_1')]"));
		WebElement Multicity_radiobtn=driver.findElement(By.xpath("//*[contains(@id,'_rbtnl_Trip_2')]"));
		Oneway_radiobtn.click();
		Roundtrip_radiobtn.click();
		System.out.println(Roundtrip_radiobtn.isSelected());
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		for(int i=0;i<4;i++) {
		driver.findElement(By.xpath("//*[@id='divAdult'] //*[@id='hrefIncAdt']")).click();
		Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//*[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //*[@value='MAA']")).click();//Selects Chennai from Source
		driver.findElement(By.xpath("//*[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='BLR']")).click();//Selects Bangalore from Destination
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_txt_Fromdate']/following-sibling::button")).click();
		
		
	}

}
