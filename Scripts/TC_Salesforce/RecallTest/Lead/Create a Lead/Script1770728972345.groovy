import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'webKeywords.NavigateSalesList.checkSalesList'()

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/txt_Leads'), 'Leads')

WebUI.click(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/div_New'))

WebUI.waitForElementPresent(findTestObject('Sales/Lead/Page_New Lead Salesforce/txt_New Lead'), 10)

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/button_Salutation'))

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/span_Mr'))

salutation = WebUI.getText(findTestObject('Sales/Lead/Page_New Lead Salesforce/span_Mr'))

firstname = 'test'

def lastname = 'lead' + System.currentTimeMillis().intdiv(1000000)

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_First Name'), firstname)

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_Last Name'), lastname)

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input__Company'), 'testcompany')

WebUI.setText(findTestObject('Sales/Lead/Page_New Lead Salesforce/input_Title'), 'account manager')

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_Website'), 'www.testcomp.com')

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_Phone'), '90443434343')

String email = ('test' + lastname) + '@gmail.com'

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_Email'), email)

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_Country'))

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/span_Afghanistan'))

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/textarea_Street'), 'dfdfdf')

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_City'), 'pune')

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_Zip_Postal Code'), '711101')

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_No. of Employees'), '23')

WebUI.setText(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/input_Annual Revenue'), '500k')

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/button_Lead Source'))

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/span_Employee Referral'))

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/button_Industry'))

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/dropdown_LeadSource'))

WebUI.click(findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/button_SaveEdit'))

WebUI.verifyElementText(findTestObject('Contact/Page_Delete Contact/txt_Toaster Msg'), 
	('Lead "' + salutation + ' ' + firstname + ' ' + lastname) + '" was created.')