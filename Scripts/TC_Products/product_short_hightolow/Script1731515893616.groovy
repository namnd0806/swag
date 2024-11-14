import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

CustomKeywords.'web.checklogin.loginSuccess'(GlobalVariable.username, GlobalVariable.password);
WebUI.verifyElementText(findTestObject('Object Repository/login/login_success'), 'Products');
WebUI.click(findTestObject('Object Repository/Products/cbo_short'));
WebUI.click(findTestObject('Object Repository/Products/opt_hilo'));
CustomKeywords.'web.productshot.ShortHighToLow'();