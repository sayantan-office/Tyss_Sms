package org.tyss.sms.pageRepository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.tyss.sms.genericUtility.DatabaseUtility_SMS;
import org.tyss.sms.genericUtility.Driver_Class;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.FileUtility_SMS;
import org.tyss.sms.genericUtility.IConnect_SMS;
import org.tyss.sms.genericUtility.JavaUtility_SMS;
import org.tyss.sms.genericUtility.Robot_SMS;
import org.tyss.sms.genericUtility.ThreadSafeClass;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class BaseClass_SMS extends InstanceClass_SMS {
	@Parameters("BROWSER")
	@BeforeClass
	
	public void classSetup(String Browser) {
		System.out.println("config before class -"+Thread.currentThread().getId());

		fileUtility_SMS= new FileUtility_SMS();
		excelUtility_SMS=new ExcelUtility_SMS();
		databaseUtility_SMS=new DatabaseUtility_SMS();
		javaUtility_SMS=new JavaUtility_SMS();
		robot_SMS=new Robot_SMS();
		webDriverUtility_SMS=new WebDriverUtility_SMS();


		fileUtility_SMS.InitializePropertyFile(IConnect_SMS.ABSOLUTEPATHPROPERTYFILE);
		excelUtility_SMS.initializeExcelFile(IConnect_SMS.ABSOLUTEPATHOFEXCEL);

		//Browser=fileUtility_SMS.getDataFromPropertyFile("browser");
		Url=fileUtility_SMS.getDataFromPropertyFile("url");
		Username=fileUtility_SMS.getDataFromPropertyFile("username");
		Password=fileUtility_SMS.getDataFromPropertyFile("password");
		Username_Teacher=fileUtility_SMS.getDataFromPropertyFile("usernameT");
		Password_Teacher=fileUtility_SMS.getDataFromPropertyFile("passwordT");
		System.out.println(Username);


		WebDriver driver=webDriverUtility_SMS.InitializeDriverSetup(Browser);
		ThreadSafeClass.setDriver(driver);

		webDriverUtility_SMS.Maximize();


		webDriverUtility_SMS.ImplicitWaitSMS()

		.ActionInitialization()
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(to));
		.openApplication(Url);

		//POM objects

		homepage=new Homepage();
		smsLoginPage=new SMSLoginPage();
		addStudentPage_SMS=new AddStudentPage_SMS();
		allStudentPage = new AllStudentPage_SMS();
		leaveStudent = new LeaveStudent();
		sms_Exam_Timetable = new SMS_Exam_Timetable();
		sms_My_Student_ExamMarks_History = new SMS_My_Student_ExamMarks_History();
		studentRouting_SMS_Test = new StudentRouting_SMS_Test();
		teacher_Exam_SMS = new Teacher_Exam_SMS();




	}


	@AfterMethod
	public void methodTearDown() {
		//	homepage.logoutAction(webDriverUtility_SMS);
	}
	@AfterClass
	public void classTearDown() {
		//	webDriverUtility_SMS.closeBrowser();
	}
}


