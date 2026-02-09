import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.enhancedClick(findTestObject('Object Repository/OR_Salesforce New/Page_Home  Salesforce/span_Leads'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/div_New'))

WebUI.click(findTestObject('OR_Salesforce New/Page_New Lead  Salesforce/button_--None--'))

WebUI.delay(1)

WebUI.click(findTestObject('OR_Salesforce New/Page_New Lead  Salesforce/span_Mr'))

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/input_First Name_firstName'), 
    'Mohit')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/input_Middle Name_middleName'), 
    'Kumar')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/input__lastName'), 'Sharma')

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/button_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/span_Working'))

WebUI.click(findTestObject('OR_Salesforce New/Page_New Lead  Salesforce/button_--None-- (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/span_Information Technology'))

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/input_Title_Title'), 'QA')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/input_Department_Department__c'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/div_Email'), 'mohit.kumar@katalon.com')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/input_Phone_Phone'), '1234567890')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/input_Mobile_MobilePhone'), 
    '0987654321')

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_New Lead  Salesforce/button_Save'))

