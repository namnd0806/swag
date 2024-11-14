import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.InstanceOfAssertFactories.INTEGER

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

CustomKeywords.'web.checklogin.loginSuccess'(GlobalVariable.username, GlobalVariable.password);
WebUI.verifyElementText(findTestObject('Object Repository/login/login_success'), 'Products');

WebUI.verifyEqual(WebUI.findWebElements(findTestObject('Object Repository/Products/list_products'), 10).size(), 6);
