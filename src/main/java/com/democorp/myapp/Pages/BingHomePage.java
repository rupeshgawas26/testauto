package com.democorp.myapp.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BingHomePage {
WebDriver driver;
	
	By txt_search=By.name("q");
	By btn_search=By.xpath("//label[@id='search_icon']//*[name()='svg']");

	
	public BingHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterSearchCriteria(String text) {
		driver.findElement(txt_search).sendKeys(text);
		driver.findElement(txt_search).submit();
	}
}
