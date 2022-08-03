package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.tyss.sms.pageRepository.BaseClass_SMS;
import org.tyss.sms.pageRepository.LeaveStudent;
@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class Student_LeaveStudent_SMS extends BaseClass_SMS {
	@Test
	public void student_LeaveStudent_SMS() {
//hi
		smsLoginPage.setSMSLoginPage(Username,Password).getStudentTab().getAllStudentTab();

		leaveStudent
		.getLeaveStudentTab()
		.Leave_Click()
		.select_Grade_Details(webDriverUtility_SMS , excelUtility_SMS, "Admin_Student")
		.click_on_CheckBox(excelUtility_SMS, javaUtility_SMS)
		.ClickOnSubmit()
		.PaidOnClick();





	}

}
