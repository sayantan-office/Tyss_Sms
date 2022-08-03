package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.FileUtility_SMS;
import org.tyss.sms.genericUtility.IConnect_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;
import org.tyss.sms.pageRepository.SMSLoginPage;
import org.tyss.sms.pageRepository.Teacher_Exam_SMS;
@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class Exam_SMS_Teacher {
	@Test

	public void exam_SMS_Teacher() {

		WebDriverUtility_SMS webDriverUtility_SMS=new WebDriverUtility_SMS();
		ExcelUtility_SMS excelUtility_SMS=new ExcelUtility_SMS();
		FileUtility_SMS fileUtility_SMS=new FileUtility_SMS();


		fileUtility_SMS.InitializePropertyFile(IConnect_SMS.ABSOLUTEPATHPROPERTYFILE);
		excelUtility_SMS.initializeExcelFile(IConnect_SMS.ABSOLUTEPATHOFEXCEL);

		String Browser=fileUtility_SMS.getDataFromPropertyFile("browser");
		String Url=fileUtility_SMS.getDataFromPropertyFile("url");
		String Username=fileUtility_SMS.getDataFromPropertyFile("username");
		String Password=fileUtility_SMS.getDataFromPropertyFile("password");


		WebDriver driver=webDriverUtility_SMS.InitializeDriverSetup(Browser);

		webDriverUtility_SMS.openApplication(Url).ImplicitWaitSMS().Maximize();




		//creating pom	

		SMSLoginPage smsLoginPage=new SMSLoginPage();
		Teacher_Exam_SMS teacher_Exam_SMS=new Teacher_Exam_SMS();
		//calling methods		

		smsLoginPage
		.setSMSLoginPage(Username, Password)
		.getStudentTab()
		.getAddStudentTab();
		
		teacher_Exam_SMS
		.Exam_TabClick()
		.My_Student_Exam_Marks()
		.select_Grade_Details_Students(webDriverUtility_SMS, excelUtility_SMS,"Admin_Student")
		.select_Exam_Details_Students(webDriverUtility_SMS, excelUtility_SMS,"Admin_Student")
		.submit_click()
		.Add_Exam_Marks()
		.Enter_Exam_Marks(excelUtility_SMS,"Admin_Student")
		.Edit_Exam_Marks(excelUtility_SMS,"Admin_Student")
		.View_Exam_Marks();


	}

}
