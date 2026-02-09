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

WebUI.enhancedClick(findTestObject('Object Repository/New Folder (1)/Page_Home  Salesforce/img_Accounts'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Account/Page_Recently Viewed  Accounts  Salesforce/div_New'))

String dynamicName = 'User_' + System.currentTimeMillis()

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/input__Account Name'), dynamicName)

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/input_Website'), 'www.testtwo.com')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/button_Type'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/span_Analyst'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/textarea_Description'), dynamicName)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/input_Search Accounts'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/span_testone'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Account/Page_New Account  Salesforce/button_SaveEdit'))

WebUI.verifyElementText(findTestObject('Object Repository/New Folder (1)/Account/Page_test three  Account  Salesforce/span_Account _test three_ was created'), 
    ('Account "' + dynamicName) + '" was created.')

WebUI.verifyElementText(findTestObject('Object Repository/New Folder (1)/Account/Page_test three  Account  Salesforce/lightning-formatted-text_test three'), 
    dynamicName)

WebUI.enhancedClick(findTestObject('Object Repository/New Folder (1)/Page_Home  Salesforce/link_Home'))

WebUI.waitForElementPresent(findTestObject('New Folder (1)/Page_Home  Salesforce/span_Home'), 15)

