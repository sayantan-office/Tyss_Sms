package org.tyss.sms.genericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility_SMS {
	public WebDriver driver;
	private Actions action;
	
	
	public WebDriver InitializeDriverSetup(String browser) {


		switch (browser) {

		case "chrome":
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		case "edge":
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
		/*case "Internet Explorer":
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}*/
		default:
		{
			System.out.println("case not matched");
			break;
		}

		}
		return driver;

	}

	public WebDriverUtility_SMS ActionInitialization() {
		action=new Actions(driver);
		return this;
	}
	public void ActionClick(WebElement element) {
		
		action.moveToElement(element).perform();
	}
	public  void SelectByVisibletext(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByVisibleText(value);
	}
	public void SelectByvalue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void SelectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);

	}
	public WebDriverUtility_SMS openApplication(String url)
	{
		driver.get(url);
		return this;
		
	}
	public WebDriverUtility_SMS ImplicitWaitSMS() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return this;
	}
	public void Maximize() {
		driver.manage().window().maximize();
		
	}
	public void windowHandle() {
		Set<String> pw = driver.getWindowHandles();
		for (String allwh : pw) {
			driver.switchTo().window(allwh);
		}
	}
	
	
			
}
