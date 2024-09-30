# FanCodeAssignment
API Automation Framework:

This project automates the verification of user tasks using Rest Assured and TestNG. The scenario involves checking that all users from the city FanCode have completed more than 50% of their todo tasks.

# Scenario:    
All the users of City `FanCode` should have more than half of their todos task completed  
   Given: User has todo tasks  
   And: User belongs to the city FanCode  
   Then: User's completed task percentage should be greater than 50%  
   
`FanCode` city can be identified by latitude between -40 to 5 and longitude between 5 to 100 in the users API.
# Prerequisites
+ Java 8 or higher  
+ Maven  
+ Git
  
# Setup
1) Clone the repository:
2) git clone https://github.com/E-Bharath/FanCodeAssignment.git  
3) cd FanCodeAssignment

#### Install the dependencies:
1) `mvn clean install`

### Running The Tests.
1) `mvn clean test` (or)  
2) Run `testng.xml` file in `src/test/resources/` path

## Files
#### CommonResponseSpec, TodoUtils, CommonRequestSpec
Contains Reusable methods  

#### FanCodeTodoTest.java  
Contains the test scenarios for verifying the users' todos completion percentage  

#### ReportUtils  
Handles the setup and teardown of ExtentReports for generating test reports  

#### testng.xml file  
It is used to run the respective test file  




## Report  
The test results are generated using ExtentReports. After test execution, the report is available at target/extent-reports/.

## Test Execution    
The test verifies the following:

1) Fetches users from the city FanCode based on latitude and longitude conditions and verifies the status code and response  
2) Checks that all users from FanCode city have completed more than 50% of their todos.









