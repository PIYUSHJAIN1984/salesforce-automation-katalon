import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'webKeywords.NavigateAccountList.checkAccountList'()

accountName = WebUI.getText(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/getAccountName'))

WebUI.click(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/input_Search this list'))

WebUI.setText(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/input_Search this list'), accountName)

WebUI.click(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/svg_Search this list'))

WebUI.delay(4)

WebUI.click(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/span_icon'))

WebUI.click(findTestObject('Account/Page_Recently Viewed  Accounts  Salesforce/a_Delete'))

WebUI.verifyElementText(findTestObject('Account/Page_Delete Account/txt_DeleteAccount'), 'Are you sure you want to delete this account?')

WebUI.click(findTestObject('Account/Page_Delete Account/btn_Delete'))

WebUI.verifyElementText(findTestObject('Account/Page_Delete Account/txt_Toaster Msg'), ('Account "' + accountName) + '" was deleted. Undo')

