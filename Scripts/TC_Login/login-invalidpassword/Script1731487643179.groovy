import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'web.checklogin.loginSuccess'(username, password);
WebUI.verifyElementText(findTestObject('Object Repository/login/login_invalidpassword'), 'Epic sadface: Username and password do not match any user in this service')