## NHS BSA UI AUTOMATION TESTS
This project contains automation tests for https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start
### Tools used
- JAVA
- Selenium
- WebDriverManager
- Junit
- Cucumber
- Maven
### How to execute from command prompt --
- mvn clean install test -Dcucumber.options="src/test/features/NHSCostChecker.feature"
- mvn test -Dcucumber.options="src/test/features/NHSCostChecker.feature"
- Screenshots reports : src/main/resources/errorShorts/DonePage.jpg



### Best Practice
As a part of usability testing, Home page button should have been added to all the pages
if the user wants to start over again then the user has to go back through all the pages
or has to again enter url to start from the beginning.

Because of time constraint couldn't do more test cases for each benefit tyoes we can write a test case.
