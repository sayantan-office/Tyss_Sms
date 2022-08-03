package org.tyss.sms.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class StudentRouting_SMS_Test {
	
	@FindBy(xpath = "//span[.='Subject Routing']")
	WebElement Subject_Routing;
	
	@FindBy(xpath = "//div/a[@href='#modalInsertform']")
	WebElement Add_Btn;
	
	@FindBy(xpath = "//select[@id='grade']")
	WebElement Grade;
	
	@FindBy(xpath = "//select[@id='subject']")
	WebElement Subject;	
	@FindBy(xpath = "//select[@id='teacher']")
	WebElement Teacher;
	@FindBy(xpath = "//select[@id='fee']")
	WebElement Fee;
	@FindBy(xpath = "//button[@id='btnSubmit']")
	WebElement Submit_Btn;
	@FindBy(xpath = "//input[@id='fee1']")
	WebElement Fee_update;
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	WebElement Submit_Btn1;
	@FindBy(xpath = "//tbody/tr/td[6]/a[2]")
	WebElement Delete_btn;
	
	public  StudentRouting_SMS_Test() {
		PageFactory.initElements(Driver_Class.getInstance().getDriver(),this);
	}
	public StudentRouting_SMS_Test Subject_Routing_Add_Button() {
		Subject_Routing.click();
		Add_Btn.click();
		return this;
	}
public StudentRouting_SMS_Test select_Grade_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		
		webdriverutility_SMS.SelectByVisibletext(Grade, excelUtility_SMS.getDataFromExcelFile(SheetName, 30, 0));
		return this;
}
public StudentRouting_SMS_Test select_Subject_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
	
	webdriverutility_SMS.SelectByVisibletext(Subject, excelUtility_SMS.getDataFromExcelFile(SheetName, 30, 1));
	return this;
}
public StudentRouting_SMS_Test select_Teacher_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
	
	webdriverutility_SMS.SelectByVisibletext(Teacher, excelUtility_SMS.getDataFromExcelFile(SheetName, 30, 2));
	return this;
}

public StudentRouting_SMS_Test Add_Fee_Students(ExcelUtility_SMS excelUtility_SMS,String SheetName) {
	
	
	Fee.sendKeys(excelUtility_SMS.getDataFromExcelFile(SheetName, 30, 3));
	return this;
}
public StudentRouting_SMS_Test submit_click() {
	Submit_Btn.click();
	return this;
}
public StudentRouting_SMS_Test Update_Fee(ExcelUtility_SMS excelUtility_SMS,String SheetName) {
	Fee_update.sendKeys(excelUtility_SMS.getDataFromExcelFile(SheetName, 30, 4));
	return this;
}
public StudentRouting_SMS_Test Submit_Button1() {
	Submit_Btn1.click();
	return this;
}
public StudentRouting_SMS_Test Delete_Student() {
	Delete_btn.click();
	return this;
}
	
}
