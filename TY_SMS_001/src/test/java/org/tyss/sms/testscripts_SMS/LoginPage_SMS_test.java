package org.tyss.sms.testscripts_SMS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.tyss.sms.pageRepository.BaseClass_SMS;
import org.tyss.sms.pageRepository.SMSLoginPage;
@Listeners(org.tyss.sms.genericUtility.ListenerImplementation.class)
public class LoginPage_SMS_test extends BaseClass_SMS{
	@Test
	public void loginPage_SMS_test() {
	smsLoginPage.setSMSLoginPage(Username,Password);
	}
}
