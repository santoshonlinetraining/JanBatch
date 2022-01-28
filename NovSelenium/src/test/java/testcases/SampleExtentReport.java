package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class SampleExtentReport extends TestBase {
	@Test
	void sample() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test Started");
		logger.log(LogStatus.PASS, "text");
		logger.log(LogStatus.FAIL, "text");
		logger.log(LogStatus.INFO, "text");
	}
}
