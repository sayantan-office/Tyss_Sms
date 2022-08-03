package org.tyss.sms.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility_SMS {
	public void print(String statement) {
		System.out.println(statement);
	}
	public String getCurrentDate(String strategy) {
		return new SimpleDateFormat(strategy).format(new Date());
		
	}
}
