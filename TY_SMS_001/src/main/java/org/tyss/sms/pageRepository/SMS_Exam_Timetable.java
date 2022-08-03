package org.tyss.sms.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class SMS_Exam_Timetable {


	@FindBy(xpath = "//span[.='Exam']")
	WebElement Exam_Tab;
	@FindBy(xpath = "//select[@id='grade']")
	WebElement Grade;
	@FindBy(xpath = "//select[@id='exam']")
	WebElement Exam;
	@FindBy(xpath = "//button[@id='btnNext']")
	WebElement Next_Btn;
	@FindBy(xpath = "//a[.='Add ']")
	WebElement Add_Btn;
	@FindBy(xpath = "Add_Exam_Timetable")
	WebElement Add_Exam_Timetable;
	@FindBy(xpath = "day")
	WebElement Day;
	@FindBy(xpath = "subject")
	WebElement Subject;
	@FindBy(xpath = "classroom")
	WebElement Classroom;
	@FindBy(xpath = "start_time")
	WebElement StartTime;
	@FindBy(xpath = "end_time")
	WebElement EndTime;
	@FindBy(xpath = "btnSubmit")
	WebElement Submit_Btn;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/a[.='Edit']")
	WebElement Edit_Btn;
	@FindBy(xpath = "start_time1")
	WebElement StartTime_Update;
	@FindBy(xpath = "end_time1")
	WebElement EndTime_Update;
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	WebElement Update_Btn;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/a[.='Delete']")
	WebElement Delete_Btn;
	@FindBy(xpath = "//div/a[@id='btnYesReq']")
	WebElement Yes_Btn;
	
	public SMS_Exam_Timetable() {
		PageFactory.initElements(Driver_Class.getInstance().getDriver(), this);
	}
	public SMS_Exam_Timetable getExam_Tab() {
		Exam_Tab.click();
		return this;
	}
	public SMS_Exam_Timetable AddExam_Timetable_Tab() {
		Add_Exam_Timetable.click();
		return this;
	}
	
	public SMS_Exam_Timetable select_Grade_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,
			ExcelUtility_SMS excelUtility_SMS,String SheetName) {

		webdriverutility_SMS.SelectByVisibletext(Grade, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 4));
		return this;
	}
	public SMS_Exam_Timetable select_Exam_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,
			ExcelUtility_SMS excelUtility_SMS,String SheetName) {

		webdriverutility_SMS.SelectByVisibletext(Exam, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 5));
		return this;
	}
	public SMS_Exam_Timetable next_click_Add() {
		Next_Btn.click();
		Add_Btn.click();
		return this;
	}
	public SMS_Exam_Timetable add_subject_routing(WebDriverUtility_SMS webDriverUtility_SMS,ExcelUtility_SMS excelUtility_SMS,
			String SheetName) {
		webDriverUtility_SMS.SelectByVisibletext(Day, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 0));
		webDriverUtility_SMS.SelectByVisibletext(Subject, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 1));
		webDriverUtility_SMS.SelectByVisibletext(Classroom, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 2));
		webDriverUtility_SMS.SelectByVisibletext(StartTime, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 3));
		webDriverUtility_SMS.SelectByVisibletext(EndTime, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 4));
		return this;
		
	}
	public SMS_Exam_Timetable Submit_Button() {
		Submit_Btn.click();
		return this;
	}
	public SMS_Exam_Timetable Click_On_Edit() {
		Edit_Btn.click();
		return this;
	}
	public SMS_Exam_Timetable update_subject_routing(WebDriverUtility_SMS webDriverUtility_SMS,ExcelUtility_SMS excelUtility_SMS,
			String SheetName) {
		webDriverUtility_SMS.SelectByVisibletext(StartTime, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 5));
		webDriverUtility_SMS.SelectByVisibletext(EndTime, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 6));
		return this;
		
	}
	public SMS_Exam_Timetable Click_On_Update() {
		Update_Btn.click();
		return this;
	}
	public SMS_Exam_Timetable Click_On_Delete() {
		Delete_Btn.click();
		Yes_Btn.click();
		return this;
	}
	

	
}
