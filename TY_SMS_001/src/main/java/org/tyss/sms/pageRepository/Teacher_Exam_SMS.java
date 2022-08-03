package org.tyss.sms.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class Teacher_Exam_SMS {
	
	@FindBy(xpath = "//span[.='Exam']")
	WebElement Exam_Tab;
	
	@FindBy(xpath = "//a[@href='my_student_exam_marks.php']")
	WebElement My_Student_Exam_Marks;
	
	@FindBy(xpath = "//select[@id='grade']")
	WebElement Grade;
	@FindBy(xpath = "//select[@id='Exam']")
	WebElement Exam;
	@FindBy(xpath = "//button[@id='btnSubmit']")
	WebElement Submit_Btn;
	@FindBy(xpath = "//tbody/tr[4]/td[3]/a")
	WebElement Add_Marks;
	@FindBy(xpath = "//input[@id='exam_mark_1']")
	WebElement Enter_Marks;
	@FindBy(xpath = "//button[@id='btnSubmit3']")
	WebElement Submit_Btn2;
	@FindBy(xpath = "//tbody/tr[3]/td[3]/a[.='Edit Exam Marks']")
	WebElement Edit_Marks;
	@FindBy(xpath = "//button[@id='exam_mark_1']")
	WebElement Update_Marks;
	@FindBy(xpath = "//button[@id='btnSubmit3']")
	WebElement Submit_Btn3;
	@FindBy(xpath = "//tbody/tr[3]/td[3]/a[.='View Exam Marks']")
	WebElement View_Marks;
	

	public Teacher_Exam_SMS() {
		
		PageFactory.initElements(Driver_Class.getInstance().getDriver(), this);
		
	}

		public Teacher_Exam_SMS Exam_TabClick() {
			Exam_Tab.click();
			return this;
		}
		
		public Teacher_Exam_SMS My_Student_Exam_Marks() {
			My_Student_Exam_Marks.click();
			return this;
		}
		
		public Teacher_Exam_SMS select_Grade_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
			
			webdriverutility_SMS.SelectByVisibletext(Grade, excelUtility_SMS.getDataFromExcelFile(SheetName, 30, 0));
			return this;
	}
	public Teacher_Exam_SMS select_Exam_Details_Students(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		
		webdriverutility_SMS.SelectByVisibletext(Exam, excelUtility_SMS.getDataFromExcelFile(SheetName, 39, 0));
		return this;
	}
	public Teacher_Exam_SMS submit_click() {
		Submit_Btn.click();
		return this;
	}
	public Teacher_Exam_SMS Add_Exam_Marks() {
		Add_Marks.click();
		return this;
	}
	public Teacher_Exam_SMS Enter_Exam_Marks(ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		Enter_Marks.sendKeys(excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 1));
		Submit_Btn2.click();
		return this;
	}
	public Teacher_Exam_SMS Edit_Exam_Marks(ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		Edit_Marks.sendKeys(excelUtility_SMS.getDataFromExcelFile(SheetName, 41, 2));
		Enter_Marks.click();
		Update_Marks.click();
		Submit_Btn3.click();
		
		return this;
	}
	public Teacher_Exam_SMS View_Exam_Marks() {
		View_Marks.click();
		return this;
	}
	}


