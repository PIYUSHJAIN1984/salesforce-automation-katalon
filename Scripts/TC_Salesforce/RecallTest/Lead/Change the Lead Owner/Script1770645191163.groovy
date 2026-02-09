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

not_run: WebUI.enhancedClick(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/span_Leads'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/span_Action_slds-checkbox--faux'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/div_Change Owner'))

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/input_Pick an object_92023a'), 
    'Srivatsa ')

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/img_Mohit Kuma_icon', [('username') : 'Srivatsa']))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/span_toastMessage slds-text-heading--small _f3870d'), 
    '1 owner has been changed.')

