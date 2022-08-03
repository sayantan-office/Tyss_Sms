package org.tyss.sms.genericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class FileUtility_SMS {

	Properties properties=new Properties();
	/**
	 * This method is used to Initialize Property file
	 * @param PropertyFilePath
	 */
	public void InitializePropertyFile(String PropertyFilePath) {
		try {
			FileInputStream prop=new FileInputStream(PropertyFilePath);
			try {
				properties.load(prop);
			} 
			catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
	/**
	 * This method is used to get data from property file
	 * @param key
	 * @return
	 */
	public String getDataFromPropertyFile(String key) {
		return properties.getProperty(key).trim();

	}
	public void takeScreenshotPage(Object currentClass,JavaUtility_SMS javaUtility)
	{
		TakesScreenshot ts = (TakesScreenshot)ThreadSafeClass.getDriver();
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./errorshots/"+getClass().getClass().getSimpleName()+javaUtility.getCurrentDate("dd_MM__yyyy_HH_mm_sss")+".png"); 

		try {
			FileUtils.copyFile(src,dst);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
