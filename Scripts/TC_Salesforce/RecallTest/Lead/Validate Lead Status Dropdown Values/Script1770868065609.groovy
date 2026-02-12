import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'webKeywords.NavigateSalesList.checkSalesList'()

WebUI.verifyElementText(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/txt_Leads'), 'Leads')

WebUI.click(findTestObject('Sales/Lead/Page_All Open Leads  Leads  Salesforce/div_New'))

WebUI.waitForElementPresent(findTestObject('Sales/Lead/Page_New Lead Salesforce/txt_New Lead'), 10)

//Click the dropdown to make the span options visible in the DOM
WebUI.click(findTestObject('Sales/Lead/Page_New Lead Salesforce/btn_Lead Status'))

// Define a Test Object that represents the collection of span items
TestObject spanItems = findTestObject('Object Repository/Sales/Lead/Page_New Lead Salesforce/span_Lead Status Values')

// 3. Find all matching WebElements
List<WebElement> elements = WebUiCommonHelper.findWebElements(spanItems, 5)

// Extract text from each span into a list
List<String> actualValues = []

for (WebElement element : elements) {
    actualValues.add(element.getText().trim())
}

// 5. Your expected values
List<String> expectedValues = ['--None--', 'New', 'Contacted', 'Nurturing', 'Qualified', 'Unqualified']

// 6. Compare the entire list
WebUI.verifyEqual(actualValues, expectedValues)