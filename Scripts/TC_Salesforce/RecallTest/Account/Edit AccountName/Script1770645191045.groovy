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

accountName = WebUI.getText(findTestObject('New Folder (1)/New Folder2/Page_Recently Viewed  Accounts  Salesforce/GetAcName'))

println(accountName)

WebUI.click(findTestObject('New Folder (1)/New Folder2/Page_Recently Viewed  Accounts  Salesforce/EditAccountNameIcon', 
        [('accountName1') : accountName]))

def updatedName = "test_" + System.currentTimeMillis();

WebUI.setText(findTestObject('New Folder (1)/New Folder2/Page_Recently Viewed  Accounts  Salesforce/EditAcName', [('accountName1') : accountName]), 
    updatedName)

WebUI.click(findTestObject('Object Repository/New Folder (1)/New Folder2/Page_Recently Viewed  Accounts  Salesforce/div_AccountsAccountsRecently ViewedSelect a_a20546'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/New Folder2/Page_Recently Viewed  Accounts  Salesforce/span_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Folder (1)/New Folder2/Page_Recently Viewed  Accounts  Salesforce/span_Your changes are saved'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/New Folder (1)/New Folder2/Page_Recently Viewed  Accounts  Salesforce/span_Your changes are saved'), 
    'Your changes are saved.')

