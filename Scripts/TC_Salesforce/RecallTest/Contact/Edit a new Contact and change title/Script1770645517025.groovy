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

WebUI.enhancedClick(findTestObject('New Folder (1)/Page_Home  Salesforce/img_Contacts'))

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/getContactName'))

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Contact Details Salesforce/btn_EditTitle'))

WebUI.setText(findTestObject('New Folder (1)/Contact/Page_Contact Details Salesforce/input_Title'), newTitle)

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Contact Details Salesforce/button_Save'))

WebUI.verifyElementText(findTestObject('New Folder (1)/Contact/Page_Contact Details Salesforce/txt_Title', [('newTitle') : newTitle]), 
    newTitle)

