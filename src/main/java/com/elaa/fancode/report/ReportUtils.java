package com.elaa.fancode.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUtils {
	private static ExtentReports extent;
	private static ExtentTest test;
	private static final String REPORT_PATH = "target/extent-reports/extent.html";

	public static void initReport() {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(REPORT_PATH);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	public static ExtentTest createTest(String testName) {
		test = extent.createTest(testName);
		return test;
	}

	public static void flushReport() {
		extent.flush();
	}

	public static String getReportPath() {
		return REPORT_PATH;
	}
}
