import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'webKeywords.ApplicationFunction.checkSalesList'()

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/txt_Leads'), 'Leads')

WebUI.enhancedClick(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/span_Opportunities'))

WebUI.verifyElementText(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/txt_Opportunities'), 
    'Opportunities')

WebUI.click(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/icon_Stage'))

WebUI.click(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/dropdown_Stage'))

WebUI.click(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/select_ValueDropdown'))

WebUI.click(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/span_Save'))

WebUI.verifyElementText(findTestObject('Sales/Opportunity/Page_Recently Viewed  Opportunities  Salesforce/text_ToastMsg'), 
    'Your changes are saved.')

