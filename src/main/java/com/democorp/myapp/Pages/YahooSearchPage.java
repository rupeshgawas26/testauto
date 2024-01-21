package com.democorp.myapp.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.*;
import com.democorp.myapp.Pages.LoginPage;
import com.democorp.myapp.utils.ReadConfig;
import com.democorp.myapp.utils.XLUtils;


public class YahooSearchPage {
	WebDriver driver;
	By link_all=By.xpath("//h2");
	
	public YahooSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public boolean verifyFirstLink(String text) {
		 List<WebElement> allLinks = driver.findElements(link_all);
		 for(WebElement link:allLinks)
		 System.out.println(link.getText());
		 
		 return((count(allLinks.get(0).getText(),text))>3);
	}
	
	private int count(String str1, String str2) 
    { 
        int c = 0, j = 0; 
        for (int i = 0; i < str1.length(); i++)
        { 
            if (str2. indexOf(str1.charAt(i)) >= 0) 
            {
                c += 1; 
        } 
    }
        return c;
    } 
	
}
