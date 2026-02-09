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

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/button_Add filterFilter'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/span_Contact Account'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/button_Add Filter Value'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/input_Value_undefined-input'))

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/input_Value_undefined-input'),
	'Test')

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/button_Apply'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/button_Add'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/span_toastMessage slds-text-heading--small _f3870d'),
	'Dashboard saved')

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/button_Done'))

WebUI.click(findTestObject('OR_Salesforce New/Dashboard/Page_Katalon Dashboard  Salesforce/button_Save'), FailureHandling.STOP_ON_FAILURE)