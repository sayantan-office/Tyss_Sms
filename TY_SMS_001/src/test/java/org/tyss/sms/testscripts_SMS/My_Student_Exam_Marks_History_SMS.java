package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.tyss.sms.pageRepository.BaseClass_SMS;
@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class My_Student_Exam_Marks_History_SMS extends BaseClass_SMS {
	@Test
	public void my_Student_Exam_Marks_History_SMS() {
		smsLoginPage.setSMSLoginPage(Username,Password);
		sms_My_Student_ExamMarks_History
		.getExam_Tab()
		.getMyStudentExamMarksHistory()
		.select_Year_Details_Students(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.select_Grade_Details_Students(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.select_Exam_Details_Students(webDriverUtility_SMS, excelUtility_SMS, "Admin_Student")
		.submit_click()
		.View_Exam_Marks(excelUtility_SMS, "Admin_Student");


	}
}