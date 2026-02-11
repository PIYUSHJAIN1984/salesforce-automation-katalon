import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home  Salesforce/img_Accounts'))

accountName = WebUI.getText(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/GetAcName'))

println(accountName)

WebUI.click(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/EditAccountNameIcon', [('accountName1') : accountName]))

def updatedName = 'test_' + System.currentTimeMillis()

WebUI.setText(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/EditAcName', [('accountName1') : accountName]), 
    updatedName)

WebUI.click(findTestObject('Object Repository/Account/Page_Recently Viewed  Accounts  Salesforce/div_AccountsRecently Viewed'))

WebUI.click(findTestObject('Object Repository/Account/Page_Recently Viewed  Accounts  Salesforce/span_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Account/Page_Recently Viewed  Accounts  Salesforce/span_Your changes are saved'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Account/Page_Recently Viewed  Accounts  Salesforce/span_Your changes are saved'), 
    'Your changes are saved.')

