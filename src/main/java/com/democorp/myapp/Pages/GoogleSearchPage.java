package com.democorp.myapp.Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchPage {
	WebDriver driver;
	By link_all=By.xpath("//h3[@class]");
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//h3[@class]
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
