import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

CustomKeywords.'web.checklogin.loginSuccess'(GlobalVariable.username, GlobalVariable.password);
WebUI.verifyElementText(findTestObject('Object Repository/login/login_success'), 'Products');

WebUI.click(findTestObject('Object Repository/Products/lbl_name'));
WebUI.verifyElementText(findTestObject('Object Repository/Products/lbl_name'), 'Sauce Labs Backpack');
WebUI.verifyElementPresent(findTestObject('Object Repository/Products/lbl_mota'), 10);
WebUI.verifyElementPresent(findTestObject('Object Repository/Products/lbl_price'), 10);
WebUI.verifyElementVisible(findTestObject('Object Repository/Products/btn_addtocart'));
WebUI.verifyElementVisible(findTestObject('Object Repository/Products/img_product'));