import java.nio.file.Files as Files
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

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

items2 = CustomKeywords.'webKeywords.ApplicationFunction.enhanced_GetAllValuesDropDown'(findTestObject('OR_Salesforce New/Page_New Lead  Salesforce/custom_List_LeadStatus'))

println('GUI Values: ' + items2)

println('Excel Value: ' + LeadStatus)

WebUI.verifyEqual(LeadStatus, items2)

CustomKeywords.'webKeywords.ApplicationFunction.enhanced_ClickOnDropDown'(findTestObject('OR_Salesforce New/Page_New Lead  Salesforce/custom_List_LeadStatus'), 
    'Cold')

WebUI.delay(5)

WebUI.closeBrowser()

