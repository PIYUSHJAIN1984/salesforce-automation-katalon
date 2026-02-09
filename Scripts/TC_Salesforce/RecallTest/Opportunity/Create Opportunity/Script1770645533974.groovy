import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'webKeywords.ApplicationFunction.checkContactList'()

contactName = WebUI.getText(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/getContactName'))

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Recently Viewed  Contacts  Salesforce/getContactName'))

// 1. Get the text first
String actualText = WebUI.getText(findTestObject('New Folder (1)/Contact/Page_Contact Details Salesforce/txt_ContactName', 
        [('contact_Name') : contactName]))

if (actualText.contains(contactName)) {
    println('Success!')
} else {
    KeywordUtil.markFailed('Text not found! Actual was: ' + actualText)
}

WebUI.click(findTestObject('New Folder (1)/Contact/Page_Contact Details Salesforce/btn_NewOppty'))

WebUI.verifyElementPresent(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/popup_NewOpportunity'), 
    10)

WebUI.clearText(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/input_OpptyName'))

WebUI.setText(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/input_OpptyName'), opportunityName)

WebUI.click(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/dropdown_Stage'))

WebUI.click(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/dropdown_Value'))

WebUI.setText(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/input__Amount'), '100')

WebUI.click(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/span_Save'))

WebUI.verifyElementText(findTestObject('New Folder (1)/Opportunity/Page_New Opportunity Salesforce/text_ToastMsg'), ('Opportunity "' + 
    opportunityName) + '" was created.')

