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

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_CaseStatus', [('case_Stage') : CaseStatus_1]))

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_btn_CurrentStatus'))

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/span_ToastMsg'), 'Status changed successfully.')

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/txt_status_CaseInfo', [('case_Stage') : CaseStatus_1]), 
    'Working')

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_CaseStatus', [('case_Stage') : CaseStatus_2]))

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_btn_CurrentStatus'))

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/span_ToastMsg'), 'Status changed successfully.')

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/txt_status_CaseInfo', [('case_Stage') : CaseStatus_2]), 
    'Waiting on Customer')

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_CaseStatus', [('case_Stage') : CaseStatus_3]))

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_btn_CurrentStatus'))

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/span_ToastMsg'), 'Status changed successfully.')

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/txt_status_CaseInfo', [('case_Stage') : CaseStatus_3]), 
    'Escalated')

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_CaseStatus', [('case_Stage') : CaseStatus_4]))

WebUI.enhancedClick(findTestObject('Case/Page_Case Details Salesforce/span_btn_CurrentStatus'))

WebUI.waitForElementPresent(findTestObject('Case/Page_Case Details Salesforce/span_ToastMsg'), 10)

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/span_ToastMsg'), 'Status changed successfully.')

WebUI.verifyElementText(findTestObject('Case/Page_Case Details Salesforce/txt_status_CaseInfo', [('case_Stage') : CaseStatus_4]), 
    'Closed')

