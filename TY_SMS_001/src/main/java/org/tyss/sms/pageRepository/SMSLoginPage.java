package org.tyss.sms.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ThreadSafeClass;

public class SMSLoginPage {
	@FindBy(xpath = "//input[@id='email']")
	private WebElement usernameTextField;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextField;
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement LoginBtn;
	@FindBy(xpath = "//span[text()='Student']")
	private WebElement StudentTab;
	@FindBy(xpath = "//a[text()=' All Student']")
	private WebElement AllStudentTab;
	@FindBy(xpath = "//a[text()=' Add Student']")
	private WebElement AddStudentTab;
	@FindBy(xpath = "//a[text()=' Leave Student']")
	private WebElement LeaveStudentTab;
	
	public  SMSLoginPage() {		
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);	
	}
	public SMSLoginPage setSMSLoginPage(String Username,String Password) {
		System.out.println(Username);
		usernameTextField.sendKeys(Username);
		passwordTextField.sendKeys(Password);
		LoginBtn.click();
		
		return this;
	}
	public SMSLoginPage getStudentTab() {
		 StudentTab.click();
		 return this;
	}
	public SMSLoginPage getAllStudentTab() {
		AllStudentTab.click();
		return this;
	}
	public SMSLoginPage getAddStudentTab() {
		 AddStudentTab.click();	 
		 return this;
	}
	public SMSLoginPage getLeaveStudentTab() {
		 LeaveStudentTab.click();
		 return this;
		 
	}
}
