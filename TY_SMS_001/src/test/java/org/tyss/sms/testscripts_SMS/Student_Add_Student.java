package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.tyss.sms.genericUtility.Robot_SMS;
import org.tyss.sms.pageRepository.BaseClass_SMS;
@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class Student_Add_Student extends BaseClass_SMS {
	@Test
	public void student_Add_Student() {
		smsLoginPage.setSMSLoginPage(Username,Password).getStudentTab().getAddStudentTab();

		addStudentPage_SMS.getDetails_Student(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.getDetails_Guardian(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.select_Grade_Details(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.checkboxClick()
		.submitClick();
		//addStudentPage_SMS.onClickPaid();

		Robot_SMS robot_sms=new Robot_SMS();
		try {
			robot_sms.keyPress();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
