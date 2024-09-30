package common.fanode.tests;

import java.util.List;

import org.apache.tools.ant.types.Assertions;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.elaa.fancode.report.ReportUtils;
import com.google.gson.JsonArray;

import common.fanode.common.TodoUtils;

public class FanCodeTodoTest {
	private ExtentTest test;

	@BeforeClass
	public void FanCodeTodoTest() {
		ReportUtils.initReport();
	}

	@Test
	public void verifyUserCompletedTasksGreaterThanFiftyPercent() {
		test = ReportUtils.createTest(
				"Verify User's Completed Task greater than 50% in verifyUserCompletedTasksGreaterThanFiftyPercent()");
		// Fetch all users
		JsonArray users = TodoUtils.getUsers();

		// Filter users belonging to FanCode city
		List<Integer> fanCodeUserIds = TodoUtils.filterFanCodeUsers(users);

		// For each FanCode user, check if completed tasks percentage > 50%
		for (int userId : fanCodeUserIds) {
			double completionPercentage = TodoUtils.getTaskCompletionPercentage(userId);

			// Assert that the completed task percentage is greater than 50%
			Assert.assertTrue(completionPercentage > 50,
					"User " + userId + " from FanCode city has less than 50% completed tasks.");
		}
		System.out.println("User Id's Completed task percentage greater than 50% are :- " + fanCodeUserIds);
		test.info("Fetched users from FanCode city: " + fanCodeUserIds);
	}

	@AfterClass
	public void tearDownClass() {
		ReportUtils.flushReport();
	}
}
