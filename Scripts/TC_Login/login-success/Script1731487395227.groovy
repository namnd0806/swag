import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'web.checklogin.loginSuccess'(username, password);
WebUI.verifyElementText(findTestObject('Object Repository/login/login_success'), 'Products')

