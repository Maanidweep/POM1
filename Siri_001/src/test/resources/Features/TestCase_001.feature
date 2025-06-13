Feature: Create Job Record automatiom in orange hrm 
	
Background: Common Steps
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01 Add Job - particular Test Object
    And User Enters username as "Admin" and password as "admin123"
    Then Navigate to Job Page
    When Add Job Records with Jobname as "Selenium_BDD456" and Jobdescription as "Testers" Jobnote "7 Years of Exp"   
    When Click on logout button
    Then Close Browser