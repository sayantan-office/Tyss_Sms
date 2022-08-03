package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.tyss.sms.genericUtility.ExcelUtility_SMS;
import org.tyss.sms.genericUtility.FileUtility_SMS;
import org.tyss.sms.genericUtility.IConnect_SMS;
import org.tyss.sms.genericUtility.JavaUtility_SMS;
import org.tyss.sms.genericUtility.WebDriverUtility_SMS;
import org.tyss.sms.pageRepository.BaseClass_SMS;
import org.tyss.sms.pageRepository.Homepage;
import org.tyss.sms.pageRepository.SMSLoginPage;
import org.tyss.sms.pageRepository.StudentRouting_SMS_Test;
@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class Student_Routing_SMS extends BaseClass_SMS {
	@Test
	public void student_Routing_SMS(){
		
		smsLoginPage.setSMSLoginPage(Username,Password).getStudentTab().getAllStudentTab();

		studentRouting_SMS_Test
		.Subject_Routing_Add_Button()
		.select_Grade_Details_Students( webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.select_Subject_Details_Students(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.select_Teacher_Details_Students(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.Add_Fee_Students(excelUtility_SMS, "Admin_Student")
		.submit_click();
	}

}
