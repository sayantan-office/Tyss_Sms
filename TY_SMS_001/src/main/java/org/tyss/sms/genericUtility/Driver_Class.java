package org.tyss.sms.genericUtility;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

public class Driver_Class {

	private WebDriver driver;
	private static Driver_Class classVar;
	private  Driver_Class() 
	{
		
	}
	public static Driver_Class getInstance() {
		if(Objects.isNull(classVar))
		{
			classVar=new Driver_Class();
		}
		return classVar;

	}

	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver=driver;
	}
}
