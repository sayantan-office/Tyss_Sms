package org.tyss.sms.pageRepository;

import org.openqa.selenium.WebDriver;
import org.tyss.sms.genericUtility.DatabaseUtility_SMS;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.FileUtility_SMS;
import org.tyss.sms.genericUtility.IConnect_SMS;
import org.tyss.sms.genericUtility.JavaUtility_SMS;
import org.tyss.sms.genericUtility.Robot_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;

public class InstanceClass_SMS {
	public WebDriver driver;
	public FileUtility_SMS fileUtility_SMS;
	public ExcelUtility_SMS excelUtility_SMS;
	public WebDriverUtility_SMS webDriverUtility_SMS;
	public JavaUtility_SMS javaUtility_SMS;
	public Robot_SMS robot_SMS;
	public DatabaseUtility_SMS databaseUtility_SMS;
	public IConnect_SMS iConnect_SMS;
	
	protected String Browser;
	protected String Url;
	protected String Username;
	protected String Password;
	protected String Username_Teacher;
	protected String Password_Teacher;
	public SMSLoginPage smsLoginPage;
	public Homepage homepage;
	public AddStudentPage_SMS addStudentPage_SMS;
	public AllStudentPage_SMS allStudentPage;
	public LeaveStudent leaveStudent;
	public SMS_Exam_Timetable sms_Exam_Timetable;
	public SMS_My_Student_ExamMarks_History sms_My_Student_ExamMarks_History;
	public StudentRouting_SMS_Test studentRouting_SMS_Test;
	public Teacher_Exam_SMS teacher_Exam_SMS;
}
