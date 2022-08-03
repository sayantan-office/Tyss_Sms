package org.tyss.sms.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class SMS_My_Student_ExamMarks_History {
	
	@FindBy(xpath = "//span[.='Exam']")
	WebElement Exam_Tab;
	@FindBy(xpath = "//a[@href='my_student_exam_marks_history.php']")
	WebElement My_Student_Exam_Marks_History;
	@FindBy(xpath = "//select[@id='grade']")
	WebElement Grade;
	@FindBy(xpath = "//select[@id='exam']")
	WebElement Exam;
	@FindBy(xpath = "//select[@id='year']")
	WebElement Year;
	@FindBy(xpath = "//button[@id='btnSubmit']")
	WebElement Submit_Btn;
	@FindBy(xpath = "View_Exam_Marks")
	WebElement View_Exam_Marks;

	public SMS_My_Student_ExamMarks_History() {
		
		PageFactory.initElements(Driver_Class.getInstance().getDriver(), this);
	}

	public SMS_My_Student_ExamMarks_History getExam_Tab() {
		Exam_Tab.click();
		return this;
	}
	public SMS_My_Student_ExamMarks_History getMyStudentExamMarksHistory() {
		My_Student_Exam_Marks_History.click();
		return this;
	}

	public SMS_My_Student_ExamMarks_History select_Year_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,
			ExcelUtility_SMS excelUtility_SMS,String SheetName) {

		webdriverutility_SMS.SelectByVisibletext(Year, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 3));
		return this;
	}
	public SMS_My_Student_ExamMarks_History select_Grade_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,
			ExcelUtility_SMS excelUtility_SMS,String SheetName) {

		webdriverutility_SMS.SelectByVisibletext(Grade, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 4));
		return this;
	}
	public SMS_My_Student_ExamMarks_History select_Exam_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,
			ExcelUtility_SMS excelUtility_SMS,String SheetName) {

		webdriverutility_SMS.SelectByVisibletext(Exam, excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 5));
		return this;
	}
	public SMS_My_Student_ExamMarks_History submit_click() {
		Submit_Btn.click();
		return this;
	}
	public SMS_My_Student_ExamMarks_History View_Exam_Marks(ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		View_Exam_Marks.sendKeys(excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 0));
		return this;
	}
	


}





