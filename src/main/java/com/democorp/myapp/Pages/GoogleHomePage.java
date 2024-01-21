package com.democorp.myapp.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
	WebDriver driver;
	
	By txt_search=By.name("q");
	By btn_search=By.name("btnK");
	
	public GoogleHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterSearchCriteria(String text) {
		driver.findElement(txt_search).sendKeys(text);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} catch (AWTException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
