import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

CustomKeywords.'web.checklogin.loginSuccess'(GlobalVariable.username, GlobalVariable.password);
WebUI.verifyElementText(findTestObject('Object Repository/login/login_success'), 'Products');

CustomKeywords.'web.check_icon_cart.ProductDetailAddToCart'();
CustomKeywords.'web.check_icon_cart.RedirectCheckOut'();