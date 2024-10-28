package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {
	
	WebDriver driver;
	@BeforeClass
	private void tc1() {
		driver=new EdgeDriver();

	}
	@AfterClass
	private void tc2() {
		
		driver.manage().deleteAllCookies();
		driver.quit();

	}
	@Test
	private void tc3() {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone13",Keys.ENTER);
		

	}
	@BeforeMethod
	private void tc4() {
		driver.get("https://www.amazon.in/");

	}
	@AfterMethod
	private void tc5() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\newDaySample\\selenium\\manual\\new.png");
		FileUtils.copyFile(source, target);

	}
	

}
