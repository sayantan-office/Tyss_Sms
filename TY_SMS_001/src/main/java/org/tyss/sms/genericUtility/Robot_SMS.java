package org.tyss.sms.genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_SMS {
	
	public void keyPress() throws InterruptedException {

	Robot r=null;
	try {
		r = new Robot();
	} catch (AWTException e) {
		e.printStackTrace();
	}
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}
	}
