package web

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class checklogin {

	@Keyword
	public void loginSuccess(String username, String password) {
		WebUI.openBrowser('https://www.saucedemo.com');
		WebUI.maximizeWindow();
		WebUI.sendKeys(findTestObject('Object Repository/login/txt_username'), username);
		WebUI.sendKeys(findTestObject('Object Repository/login/txt_password'), password);
		WebUI.click(findTestObject('Object Repository/login/btn_dangnhap'));
	}
}
