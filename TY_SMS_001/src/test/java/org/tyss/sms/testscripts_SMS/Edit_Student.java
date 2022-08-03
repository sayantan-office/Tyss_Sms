package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.tyss.sms.genericUtility.IConnect_SMS;
import org.tyss.sms.genericUtility.Robot_SMS;
import org.tyss.sms.pageRepository.BaseClass_SMS;

@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class Edit_Student extends BaseClass_SMS{
	//hi
	@Test
	public void edit_Student() {
		
		smsLoginPage.setSMSLoginPage(Username,Password).getStudentTab().getAllStudentTab();
		
		allStudentPage.select_Grade_Details_AllStudents(webDriverUtility_SMS,excelUtility_SMS , "Admin_Student")
		.submitClick_AllStudent();
		allStudentPage.getAllElements(excelUtility_SMS,javaUtility_SMS);
		excelUtility_SMS.saveDataToExcelFile(IConnect_SMS.ABSOLUTEPATHOFEXCEL);
		allStudentPage.editBtn()
		.FullName_Student(excelUtility_SMS,"Admin_Student", 22, 0)
		.Phone_Student(excelUtility_SMS, "Admin_Student", 22, 1)
		.Guardian_Student(excelUtility_SMS, "Admin_Student", 22, 2)
		.updateBtn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//allStudentPage_SMS.leave_Student();
		allStudentPage
		.edit_Subject()
		.click_on_CheckBox(excelUtility_SMS,javaUtility_SMS)
		.Submit_Button();
		
		
		allStudentPage
		.Upgrade_Grade()
		.select_Grade_Details(webDriverUtility_SMS,excelUtility_SMS,"Admin_Student")
		.click_on_CheckBox(excelUtility_SMS, javaUtility_SMS)
		.Submit_Button();
		
		
		Robot_SMS robot_sms=new Robot_SMS();
		try {
			robot_sms.keyPress();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		allStudentPage
		.AddPayment();
		
		try {
			robot_sms.keyPress();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
