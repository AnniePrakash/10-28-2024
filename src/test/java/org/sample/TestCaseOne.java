package org.sample;

import org.openqa.selenium.WebElement;

public class TestCaseOne extends BaseClassSample{
	
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		launchUrl("https://www.amazon.in/");
		findElement("id", "twotabsearchtextbox");
		enterValue(element, "iphone 13");		
	}

}
