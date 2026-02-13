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

CustomKeywords.'webKeywords.NavigateSalesList.checkSalesList'()

WebUI.click(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/span_Select Lead'))

WebUI.click(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/btn_Change Owner'))

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_Change Owner Salesforce/txt_Change Owner'), 'Change Owner')

WebUI.click(findTestObject('Sales/Lead/Page_Change Owner Salesforce/input_Search Users'))

WebUI.setText(findTestObject('Sales/Lead/Page_Change Owner Salesforce/input_Search Users'), 'Test UserOne')

WebUI.sendKeys(findTestObject('Sales/Lead/Page_Change Owner Salesforce/input_Search Users'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_Change Owner Salesforce/h1_User Results'), 'User Results')

WebUI.click(findTestObject('Sales/Lead/Page_Change Owner Salesforce/a_UserName'))

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_Change Owner Salesforce/span_PillText'), 'Test UserOne')

WebUI.click(findTestObject('Sales/Lead/Page_Change Owner Salesforce/span_Submit'))

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/span_ToastMsg_ChangeOwner'), '1 owner has been changed.')

