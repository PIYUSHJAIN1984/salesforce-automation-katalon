import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
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
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://data-momentum-7717.my.salesforce.com/')
WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username'), GlobalVariable.USERNAME)

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Login'))

not_run: WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Page_Home  Salesforce/link_Home'), 30, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'webKeywords.NavigateHomePage.checkHomePage'()

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Home  Salesforce/span_Home'), 20)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Salesforce/span_Home'), 'Home')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Salesforce/h2_Welcome, PIYUSH'), 'Welcome, PIYUSH')

