package org.tyss.sms.genericUtility;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;




public class ListenerImplementation implements ITestListener,ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
	}

	@Override
	public void onFinish(ISuite suite) {
	}

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+"Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//ThreadSafeClass.getDriver()
		//.takeScreenshotPage(result.getMethod().getMethodName(),
		//ThreadSafeClass.getDriver().getJavaUtility());
		Reporter.log(result.getMethod().getMethodName()+"Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}


}



