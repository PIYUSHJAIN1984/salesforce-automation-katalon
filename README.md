# Introduction

This project demonstrates how Katalon Studio helps users to automate the Salesforce applications. it contains some of the test cases for Lead, Case, & Account Management. The Dashboard Management test cases contain an example for the iframe.

# Requirements

* [Katalon Studio][KS]
* Salesforce Account

# Use case

For this sample project we are covering below mentioned use cases.

Use Case No 1: Lead Management in Salesforce.
     
   Test Case:
   
      * Login into salesforce account
      * Create a new lead
      * Change status for a lead
      * Change the lead owner
      * Search lead with name and delete a lead
      * Close application
           
Use Case No 2: Case Management in Salesforce.

   Test Case:
   
      * Login into salesforce account
      * Create a new case
      * Cedit a case and change the status
      * Search a case by ID and delete a case
      * Close application
      
Use Case No 3: Account Management in Salesforce.
     
   Test Case:
   
      * Login into salesforce account
      * Create an account
      * Close application
      
Use Case No 4: Dashboard Management in Salesforce.

  Test Case:
  
      * Login into salesforce account
      * Create a dashboard
      * Create a component and add the report
      * Create a filter
      * Delete a dashboard
      * Close application

# How to automate

**Costomize Setting before recording a test case**

* Go to project >> Settings >> Test Design >> WebUI and Change the priority of Xpath Locators. [Here][1]

![image](https://user-images.githubusercontent.com/84115288/214218084-b99e47c5-be63-49ad-89c2-fb4bcbcebb83.png)

* Add Desired Capability to handle Popup (Show Notification) [Here][2]

![image](https://user-images.githubusercontent.com/84115288/216290474-1b02af8d-7b78-49bf-a29c-4cfde6bdcb8a.png)

* Record test script via Katalon Recorder. [Here][3]

* Save test objects and test cases. 

* Run the test execution. [Here][5]

* Verify the test execution result. [Here][6]

**After Recording a test case if execution is failing because of "Element not interactable" exception then please change keyword "Click" to "Enhanced Click"**

* ![image](https://user-images.githubusercontent.com/84115288/214219707-cee7a5cd-d1f3-4ac5-a2a2-009667e4d598.png)

**How to run this sample project**

* Update the application Salesforce application URL, Username, and Password inside the Default Profile. [Here][4]

<img width="818" alt="Katalon profile view" src="https://user-images.githubusercontent.com/1128/214109634-f63eebd2-4433-4c4a-9d9a-dcc89b10df34.png">

* Run the test execution. [Here][5]

* Verify the test execution result. [Here][6]

[1]: <https://docs.katalon.com/docs/maintain/self-healing-tests-in-katalon-studio#configure-test-design> "Here"
[2]: <https://docs.katalon.com/docs/author/manage-projects/project-settings/desired-capabilities/manage-desired-capabilities-in-katalon-studio#ariaid-title1> "Here"
[3]: <https://docs.katalon.com/docs/author/record-and-spy/webui-record-and-spy-utilities/record-web-utility-in-katalon-studio#record-a-new-test-case> "Here"
[4]: <https://docs.katalon.com/docs/author/data-driven-testing/global-variables-and-execution-profile#execution-profile> "Here"
[5]: <https://docs.katalon.com/docs/execute/execute-tests-with-katalon-studio/execute-tests-with-katalon-studio-overview#ariaid-title1> "Here"
[6]: <https://docs.katalon.com/docs/analyze/reports/view-test-reports/view-test-reports-in-katalon-testops/view-test-results-and-execution-logs-in-katalon-testops#ariaid-title1> "Here"
[KS]: <https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows#download-katalon-studio> "Katalon Studio"