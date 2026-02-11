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

CustomKeywords.'webKeywords.ApplicationFunction.checkSalesList'()

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/txt_Leads'), 'Leads')

WebUI.enhancedClick(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/span_Opportunities'))

WebUI.verifyElementText(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/txt_Opportunities'), 
    'Opportunities')

opptyName = WebUI.getText(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/getOpptyName'))

WebUI.click(findTestObject('Contact/Page_Recently Viewed  Contacts  Salesforce/input_Search this list'))

WebUI.setText(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/input_Search this list'), 
    opptyName)

//WebUI.setText(findTestObject('Contact/Page_Recently Viewed  Contacts  Salesforce/input_Search this list'), 
//    )
//
//WebUI.setText(findTestObject('Contact/Page_Recently Viewed  Contacts  Salesforce/input_Search this list'),
//	opptyName)
WebUI.click(findTestObject('Contact/Page_Recently Viewed  Contacts  Salesforce/svg_Search this list'))

WebUI.delay(4)

WebUI.click(findTestObject('Contact/Page_Recently Viewed  Contacts  Salesforce/span_icon'))

WebUI.click(findTestObject('Contact/Page_Recently Viewed  Contacts  Salesforce/a_Delete'))

WebUI.verifyElementText(findTestObject('Sales/Opportunity/Page_Delete Oppty/txt_DeleteOppty'), 'Are you sure you want to delete this opportunity?')

WebUI.click(findTestObject('Sales/Opportunity/Page_Delete Oppty/btn_Delete'))

WebUI.verifyElementText(findTestObject('Sales/Opportunity/Page_Delete Oppty/txt_Toaster Msg'), ('Opportunity "' + 
    opptyName) + '" was deleted. Undo')

