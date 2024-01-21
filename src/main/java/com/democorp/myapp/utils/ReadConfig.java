package com.democorp.myapp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig() {
		
		File src=new File(System.getProperty("user.dir")+"/config.properties");

	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getUserName()
	{
		String url=pro.getProperty("username");
		return url;
	}
	public String getPassword()
	{
		String url=pro.getProperty("password");
		return url;
	}
	public String getBrowser()
	{
		String url=pro.getProperty("broweser");
		return url;
	}
	

}
