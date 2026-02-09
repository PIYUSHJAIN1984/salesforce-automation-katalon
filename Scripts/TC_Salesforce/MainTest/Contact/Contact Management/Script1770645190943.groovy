import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('TC_Salesforce/RecallTest/SetupTeardown/Login into Salesforce'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC_Salesforce/RecallTest/Contact/Create a Contact for existing AC'), [('accountName') : mainACName], 
    FailureHandling.STOP_ON_FAILURE)

println('DEBUG: Value from internal data  is -> ' + mainACName)

WebUI.callTestCase(findTestCase('TC_Salesforce/RecallTest/Contact/Edit a new Contact and change title'), [('newTitle') : 'Admin'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC_Salesforce/RecallTest/Contact/Search a Contact by name and Delete a Contact'), 
    [('contactName') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC_Salesforce/RecallTest/SetupTeardown/Close application'), [:], FailureHandling.STOP_ON_FAILURE)

