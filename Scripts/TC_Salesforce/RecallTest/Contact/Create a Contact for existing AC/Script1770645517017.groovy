import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.enhancedClick(findTestObject('Object Repository/New Folder (1)/Page_Home  Salesforce/img_Accounts'))

WebUI.verifyElementPresent(findTestObject('New Folder (1)/Account/Page_Recently Viewed  Accounts  Salesforce/title_Recently Viewed'), 
    10)

println('DEBUG: Value from internal data  is -> ' + accountName)

// Load the object from the repository
TestObject myObject = findTestObject('Object Repository/New Folder (1)/Account/Page_Recently Viewed  Accounts  Salesforce/a_AccountName', 
    [('account_Name') : accountName])

// Get the XPath property value
String xpathValue = myObject.getSelectorCollection().get(com.kms.katalon.core.testobject.SelectorMethod.XPATH)

// Print to the Console/Log Viewer
println('The XPath is: ' + xpathValue)

WebUI.enhancedClick(findTestObject('New Folder (1)/Account/Page_Recently Viewed  Accounts  Salesforce/a_AccountName', 
	[('account_Name') : accountName]))

WebUI.delay(15)

WebUI.enhancedClick(findTestObject('New Folder (1)/Account/Page_Recently Viewed  Accounts  Salesforce/button_New Contact'))

WebUI.verifyElementPresent(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/popup_NewContact'), 10)

WebUI.click(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/dropdown_Salutation'))

WebUI.click(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/a_Mr'))

String lastName = System.currentTimeMillis().intdiv(1000000)

WebUI.setText(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/input_First Name'), 'test')

WebUI.setText(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/input__LastName'), lastName)

WebUI.setText(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/input_Title_26160'), 'account manager')

WebUI.setText(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/input_Email_26360'), ('test' + lastName) + 'one@gmail.com')

WebUI.setText(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/input_Phone_26560'), '9049923444')

WebUI.click(findTestObject('New Folder (1)/Contact/Page_New Contact  Salesforce/span_Save'))

