package org.tyss.sms.pageRepository;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.JavaUtility_SMS;
import org.tyss.sms.genericUtility.ThreadSafeClass;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class AllStudentPage_SMS {

	@FindBy(xpath = "//a[text()=' All Student']")
	private WebElement AllStudentTab;
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement Grade;
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement SubmitBtn;
	@FindBy(xpath = "//input[@id='full_name']")
	private WebElement FullName;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement Phone;
	@FindBy(xpath = "//a[text()='B.Amit kumar286']/ancestor::tr/td[3]/a")
	private WebElement EditBtn;
	@FindBy(xpath = "//a[text()='B.Amit kumar286']/ancestor::tr/td[3]/a[2]")
	private WebElement LeaveBtn;
	@FindBy(xpath = "//a[@id='btnYes']")
	private WebElement Button_Yes;
	@FindBy(xpath = "//a[text()='sbsd']/parent::td/following-sibling::td/a[.='Edit Subject']")
	private WebElement EditSubject;
	@FindBy(xpath = "//td[.='Guru Dronacharya']/preceding::input[@id='checkbox1']")
	private WebElement Checkbox;
	@FindBy(xpath = "//a[text()='sbsd']/ancestor::tr/td[3]/a[4]")
	private WebElement UpgradeGrade;
	@FindBy(xpath = "//a[text()='sbsd']/ancestor::tr/td[3]/a[5]")
	private WebElement AddPayment;
	@FindBy(xpath = "//a[text()='sbsd']/ancestor::tr/td[3]/a[6]")
	private WebElement ViewPayments;
	@FindBy(xpath = "//select[@id='grade1']")
	private WebElement Select_Grade;
	@FindBy(xpath = "//button[@id='btnPaid']")
	private WebElement Add_Payment;
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement Paid_MonthlyFee;
	@FindBy(xpath = "//a[.='Next']")
	private WebElement NextBtn;
	
	@FindBy(xpath = "//table/tbody/tr[@role]/td[2]")
	private List<WebElement>  list;

	//Edit Student
	
	@FindBy(xpath = "//input[@id='full_name']")
	private WebElement FullName_Student;
	@FindBy(xpath = "//input[@id='i_name']")
	private WebElement NameWithInitials_Student;
	@FindBy(xpath = "//input[@id='address']")
	private WebElement Address_Student;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email_Student;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement Phone_Student;
	@FindBy(xpath = "//input[@id='b_date']")
	private WebElement DOB_Student;
	@FindBy(xpath = "//select[@id='gender']")
	private WebElement Gender_Student;
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement Update_Student_Name;
	@FindBy(xpath = "//input[@id='g_phone']")
	private WebElement Guardian_Phone;
	
	@FindBy(xpath = "//button[@id='btnSubmit2']")
	private WebElement Submit_Btn;
		
	
	public  AllStudentPage_SMS( ) {
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
	}
	
	private String check_box="//td[.='%s']/preceding-sibling::td/input";
	
	private WebElement convertXpathToDynamicElement(String xpath,String replace)
	{
		xpath=String.format(xpath,replace);
		return ThreadSafeClass.getDriver().findElement(By.xpath(xpath));
	}
	
	public AllStudentPage_SMS click_on_CheckBox(ExcelUtility_SMS excelUtility_SMS,JavaUtility_SMS javaUtility_SMS) {
		int count=excelUtility_SMS.getLastRowNum("Admin_Student");
		
		for (int i = 33; i <=count ; i++) {
			
			String replace=excelUtility_SMS.getDataFromExcelFile("Admin_Student", i, 1);
			javaUtility_SMS.print(replace);
			convertXpathToDynamicElement(check_box, replace).click();
		}
		return this;
	} 
	
public AllStudentPage_SMS select_Grade_Details_AllStudents(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
		
		webdriverutility_SMS.SelectByVisibletext(Grade, excelUtility_SMS.getDataFromExcelFile(SheetName, 14, 0));
		return this;
}

public AllStudentPage_SMS submitClick_AllStudent() {
	SubmitBtn.click();
	return this;
}
public AllStudentPage_SMS editBtn() {
	EditBtn.click();
	return this;
}

public AllStudentPage_SMS FullName_Student(ExcelUtility_SMS excelUtility_SMS,String SheetName, int RowNum, int CellNum) {
	
	String value = excelUtility_SMS.getDataFromExcelFile(SheetName, RowNum, CellNum);
	FullName.clear();
	FullName.sendKeys(value);
	return this;
}
public AllStudentPage_SMS Phone_Student(ExcelUtility_SMS excelUtility_SMS,String SheetName, int RowNum, int CellNum) {
	String value = excelUtility_SMS.getDataFromExcelFile(SheetName, RowNum, CellNum);
	String value1 = excelUtility_SMS.getDataFromExcelFile(SheetName, RowNum, CellNum);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Phone_Student.clear();
	System.out.println("hi");
	Phone_Student.sendKeys(value);
	Guardian_Phone.clear();
	Guardian_Phone.sendKeys(value1);
	return this;
}
public AllStudentPage_SMS Guardian_Student(ExcelUtility_SMS excelUtility_SMS,String SheetName, int RowNum, int CellNum) {
	String value = excelUtility_SMS.getDataFromExcelFile(SheetName, RowNum, CellNum);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Guardian_Phone.clear();
	Guardian_Phone.sendKeys(value);
	return this;
}
public AllStudentPage_SMS updateBtn() {
	Update_Student_Name.click();
	return this;
}
public AllStudentPage_SMS leave_Student() {
	LeaveBtn.click();
	Button_Yes.click();
	return this;
}
public AllStudentPage_SMS edit_Subject() {
	EditSubject.click();
	return this;
}
public Object Submit_Button() {
	Submit_Btn.click();
	return this;
}

public AllStudentPage_SMS Upgrade_Grade() {
	UpgradeGrade.click();
	Button_Yes.click();
	return this;
}

public AllStudentPage_SMS select_Grade_Details(WebDriverUtility_SMS webdriverutility_SMS,ExcelUtility_SMS excelUtility_SMS,String SheetName) {
	
	webdriverutility_SMS.SelectByVisibletext(Select_Grade, excelUtility_SMS.getDataFromExcelFile(SheetName, 14, 0));
	return this;
}
public AllStudentPage_SMS AddPayment() {
	AddPayment.click();
	Add_Payment.click();
	Paid_MonthlyFee.click();
	return this;
}
public AllStudentPage_SMS ViewPayments_Students() {
	ViewPayments.click();
	return this;
}

public void getAllElements(ExcelUtility_SMS excelUtility_SMS,JavaUtility_SMS javaUtility_SMS) {
	List<String> array = new ArrayList<>();
	
	int k=0;
	while(k<4){
		
		for(WebElement j:list) {
			javaUtility_SMS.print(j.getText());
			array.add(j.getText());
			
		}
		javaUtility_SMS.print("hi");
		NextBtn.click();
		list=ThreadSafeClass.getDriver().findElements(By.xpath("//table/tbody/tr[@role]/td[2]"));
		k++;
	}
	int count=array.size();
	System.out.println(count);
	for (int i = 1; i <=count; i++) {
		
		excelUtility_SMS.setDataToExcelFile("Student_Name",1, i, array.get(i-1));
		
	}
		
	}
	
	

}




