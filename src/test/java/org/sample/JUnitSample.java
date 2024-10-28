package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitSample {

	static WebDriver driver;

	@AfterClass
	public static void tc5() {

		System.out.println("Completed");

	}

	@Before
	public void tc3() {

		driver.get("https://www.facebook.com/");

	}

	@BeforeClass
	public static void tc1() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@Test
	public void tc4() {

		driver.findElement(By.id("email")).sendKeys("Hanno");
		driver.findElement(By.id("pass")).sendKeys("123456");

	}

	@Test
	public void tc6() {

		System.out.println("Test case 2");

	}

	@After
	public void tc2() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File file = new File("C:\\newDaySample\\selenium\\faceBook.png");

		FileUtils.copyFile(source, file);

	}

}
