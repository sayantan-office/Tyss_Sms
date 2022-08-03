package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.tyss.sms.pageRepository.BaseClass_SMS;
@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class Exam_Timetable_SMS extends BaseClass_SMS{
	@Test
	public void exam_Timetable_SMS() {
		smsLoginPage.setSMSLoginPage(Username,Password);
		sms_Exam_Timetable
		.add_subject_routing(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.Submit_Button();

		sms_Exam_Timetable
		.update_subject_routing(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.Click_On_Update();



	}

}
