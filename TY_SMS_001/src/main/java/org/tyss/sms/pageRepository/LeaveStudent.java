package org.tyss.sms.pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.JavaUtility_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class LeaveStudent {
	

	@FindBy(xpath = "//tbody/tr[3]/td[3]/a[2]")
	private WebElement View_tab;
	
	@FindBy(xpath = "//div[@class='panel-footer bg-gray-light']/span/a")
	private WebElement St_Leave_Btn;
	
	@FindBy(xpath = "//a[.='Yes']")
	private WebElement Yes_Btn;
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement Select_Grade;
	
	@FindBy(xpath = "//button[@id='btnSubmit2']")
	private WebElement Submit_Btn;
	
	@FindBy(xpath = "//div/button[@class='btn btn-primary btn-md']")
	private WebElement Paid_Btn;
	
	public  LeaveStudent() {
		PageFactory.initElements(Driver_Class.getInstance().getDriver(), this);
	}
	public LeaveStudent getLeaveStudentTab() {
		St_Leave_Btn.click();
		return new LeaveStudent();
		 
	}
	public LeaveStudent Leave_Click() {
		View_tab.click();
		St_Leave_Btn.click();
		Yes_Btn.click();
		return this;
		
	}
	public LeaveStudent select_Grade_Details(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		
		webdriverutility_SMS.SelectByVisibletext(Select_Grade, excelUtility_SMS.getDataFromExcelFile(SheetName, 14, 0));
		return new LeaveStudent();
	}
	private String check_box="//td[.='%s']/preceding-sibling::td/input";
	private WebElement convertXpathToDynamicElement(String xpath,String replace)
	{
		xpath=String.format(xpath,replace);
		return Driver_Class.getInstance().getDriver().findElement(By.xpath(xpath));
	}
	public LeaveStudent click_on_CheckBox(ExcelUtility_SMS excelUtility_SMS,JavaUtility_SMS javaUtility_SMS) {
		int count=excelUtility_SMS.getLastRowNum("Admin_Student");
		
		for (int i = 26; i <=count ; i++) {
			
			String replace=excelUtility_SMS.getDataFromExcelFile("Admin_Student", i, 1);
			javaUtility_SMS.print(replace);
			convertXpathToDynamicElement(check_box, replace).click();
		}
		return this;
	}
	
	public LeaveStudent ClickOnSubmit() {
		Submit_Btn.click();
		return this;
	}
	public LeaveStudent PaidOnClick() {
		Paid_Btn.click();
		return this;
	}
}
