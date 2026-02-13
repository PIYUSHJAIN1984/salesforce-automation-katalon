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

CustomKeywords.'webKeywords.NavigateServiceList.checkServiceList'()

WebUI.click(findTestObject('Object Repository/Case/Page_Recently Viewed Case Salesforce/div_New'))

WebUI.verifyElementText(findTestObject('Case/Page_New Case  Salesforce/txt_New Case'), 'New Case')

WebUI.click(findTestObject('Object Repository/Case/Page_New Case  Salesforce/span_Case Origin'))

WebUI.click(findTestObject('Object Repository/Case/Page_New Case  Salesforce/span_Email'))

WebUI.click(findTestObject('Object Repository/Case/Page_New Case  Salesforce/input_Search Contacts'))

WebUI.click(findTestObject('Object Repository/Case/Page_New Case  Salesforce/span_Case Origin dropdown'))

WebUI.setText(findTestObject('Object Repository/Case/Page_New Case  Salesforce/input_Search Accounts'), 'test_1770454368334')

WebUI.click(findTestObject('Case/Page_New Case  Salesforce/select_AC Name'))

WebUI.setText(findTestObject('Object Repository/Case/Page_New Case  Salesforce/input_Subject'), 'email not working')

WebUI.setText(findTestObject('Object Repository/Case/Page_New Case  Salesforce/textarea_Description'), 'email not getting delivered')

WebUI.click(findTestObject('Object Repository/Case/Page_New Case  Salesforce/button_SaveEdit'))

WebUI.verifyElementPresent(findTestObject('Case/Page_Recently Viewed Case Salesforce/txt_ToastMsg'), 5)

