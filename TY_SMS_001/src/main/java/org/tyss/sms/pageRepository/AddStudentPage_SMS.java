package org.tyss.sms.pageRepository;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.IConnect_SMS;
import org.tyss.sms.genericUtility.ThreadSafeClass;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class AddStudentPage_SMS {
	//Student Details

	@FindBy(xpath = "//input[@id='index_number']")
	private WebElement IndexNumber;
	@FindBy(xpath = "//input[@id='full_name']")
	private WebElement FullName;
	@FindBy(xpath = "//input[@id='i_name']")
	private WebElement StudentInitials;
	@FindBy(xpath = "//input[@id='address']")
	private WebElement Address;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailId;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement Phone;
	@FindBy(xpath = "//input[@id='b_date']")
	private WebElement DOB;
	@FindBy(xpath = "//input[@id='fileToUpload']")
	private WebElement UploadPicStudent;
	@FindBy(xpath = "//select[@id='gender']")
	private WebElement GenderStudent;

	//Guardian Details



	@FindBy(xpath = "//input[@id='g_full_name']")
	private WebElement GuardianFullName;
	@FindBy(xpath = "//input[@id='g_i_name']")
	private WebElement GuardianInitials;
	@FindBy(xpath = "//input[@id='g_address']")
	private WebElement GuardianAddress;
	@FindBy(xpath = "//input[@id='g_email']")
	private WebElement GuardianEmail;
	@FindBy(xpath = "//input[@id='g_phone']")
	private WebElement GuardianPhone;
	@FindBy(xpath = "//input[@id='g_b_date']")
	private WebElement GuardianDOB;
	@FindBy(xpath = "//input[@id='g_fileToUpload']")
	private WebElement UploadPicGuardian;
	@FindBy(xpath = "//select[@id='g_gender']")
	private WebElement GuardianGender;

	// Page Navigation
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement NextButton;	
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement SelectGrade;	
	@FindBy(xpath = "//td[text()='Subject 2']/preceding-sibling::td")
	private WebElement Checkbox;	
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	private WebElement Submit;	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-md']")
	private WebElement Paid;

	//getter methods

	public  AddStudentPage_SMS() {
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
		
	} 

	private Sheet sheet;
	public void getGenderStudent(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String data) {
		webdriverutility_SMS.ActionClick(GenderStudent);
		int count=sheet.getRow(1).getLastCellNum();
		for (int i = 0; i < count; i++) {
			String data1=excelUtility_SMS.getDataFromExcelFile("Admin_Teacher_AddTeacher", i, 5);
			String data2=excelUtility_SMS.getDataFromExcelFile("Admin_Teacher_AddTeacher", i, 5);
			if(!(data1.toString().equalsIgnoreCase("male")))
			{
				webdriverutility_SMS.SelectByVisibletext(GenderStudent, data1);
			}
			else
			{
				webdriverutility_SMS.SelectByVisibletext(GenderStudent, data2);
			}
		}
	}
	public AddStudentPage_SMS getDetails_Student(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		
		 ArrayList<String>arrayList = new ArrayList<>();
		 for (int i = 0; i < excelUtility_SMS.retrieveDataFromExcel(SheetName, 3); i++) {
			arrayList.add(excelUtility_SMS.getDataFromExcelFile(SheetName, 3, i));
		 }
		IndexNumber.sendKeys(arrayList.get(0));
		FullName.sendKeys(arrayList.get(1));
		StudentInitials.sendKeys(arrayList.get(2));
		Address.sendKeys(arrayList.get(3));
		EmailId.sendKeys(arrayList.get(4));
		Phone.sendKeys(arrayList.get(5));
		DOB.sendKeys(arrayList.get(6));
		webdriverutility_SMS.SelectByVisibletext(GenderStudent, arrayList.get(7));
		UploadPicStudent.sendKeys(IConnect_SMS.ABSOLUTEPATHTOPROJECT+arrayList.get(8));
		
		return this;
	
	}
	public AddStudentPage_SMS getDetails_Guardian(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		 ArrayList<String>arrayList1 = new ArrayList<>();
		for (int i = 0; i < excelUtility_SMS.retrieveDataFromExcel(SheetName, 9); i++) {
				arrayList1.add(excelUtility_SMS.getDataFromExcelFile(SheetName, 9, i));
		}
		GuardianFullName.sendKeys(arrayList1.get(1));
		GuardianInitials.sendKeys(arrayList1.get(2));
		GuardianAddress.sendKeys(arrayList1.get(3));
		GuardianEmail.sendKeys(arrayList1.get(4));
		GuardianPhone.sendKeys(arrayList1.get(5));
		GuardianDOB.sendKeys(arrayList1.get(6));
		webdriverutility_SMS.SelectByVisibletext(GuardianGender, arrayList1.get(7));
		UploadPicGuardian.sendKeys(IConnect_SMS.ABSOLUTEPATHTOPROJECT+arrayList1.get(8));
		NextButton.click();
		return this;
	
	}
	public AddStudentPage_SMS select_Grade_Details(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		
				webdriverutility_SMS.SelectByVisibletext(SelectGrade, excelUtility_SMS.getDataFromExcelFile(SheetName, 14, 0));
				return this;
		}
	

		public AddStudentPage_SMS checkboxClick() {
			Checkbox.click();
			return this;
		}
		public AddStudentPage_SMS submitClick() {
			Submit.click();
			return this;
			
		}
		public void onClickPaid() {
			Paid.click();
		}
		
	}
	
	
	


