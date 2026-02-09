import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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

CustomKeywords.'webKeywords.ApplicationFunction.checkContactList'()

contactName = WebUI.getText(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/getContactName'))

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/input_Search this list'))

WebUI.setText(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/input_Search this list'), 
    contactName)

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/svg_Search this list'))

WebUI.delay(4)

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/span_icon'))

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/a_Delete'))

WebUI.verifyElementText(findTestObject('New Folder (1)/Contact/Page_Delete Contact/txt_DeleteContact'), 'Are you sure you want to delete this contact?')

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Delete Contact/btn_Delete'))

WebUI.verifyElementText(findTestObject('New Folder (1)/Contact/Page_Delete Contact/txt_Toaster Msg'), ('Contact "' + contactName) + 
    '" was deleted. Undo')

