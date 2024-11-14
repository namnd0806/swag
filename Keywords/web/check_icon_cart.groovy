package web

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
public class check_icon_cart {

	@Keyword
	public void CheckIconCart() {
		WebElement count = WebUI.findWebElement(findTestObject('Object Repository/Cart/quantity_original'));
		int countoriginal = count.getText().isEmpty() ? 0 : Integer.parseInt(count.getText())
		System.out.print('Số lượng ban đầu: ' + countoriginal);

		WebUI.click(findTestObject('Object Repository/Cart/btn_addtocart_product'));
		WebElement updatecount = WebUI.findWebElement(findTestObject('Object Repository/Cart/quantity_original'));
		int countnew = updatecount.getText().isEmpty() ? 0 : Integer.parseInt(updatecount.getText())

		WebUI.verifyEqual(countoriginal + 1, countnew, FailureHandling.CONTINUE_ON_FAILURE);
		WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/btn_remove_product'), 20);
	}
	
	@Keyword
	public void RedirectCheckOut() {
		WebUI.click(findTestObject('Object Repository/Cart/btn_cart'));
		WebUI.click(findTestObject('Object Repository/Cart/btn_checkout'));
		
		WebUI.sendKeys(findTestObject('Object Repository/Cart/txt_firstname'), 'Nguyễn Văn');
		WebUI.sendKeys(findTestObject('Object Repository/Cart/txt_lastname'), 'Toản');
		WebUI.sendKeys(findTestObject('Object Repository/Cart/txt_zipcode'), '123456');
		WebUI.click(findTestObject('Object Repository/Cart/btn_continue'));
	}
	
	@Keyword
	public void ProductDetailAddToCart() {
		WebElement count = WebUI.findWebElement(findTestObject('Object Repository/Cart/quantity_original'));
		int countoriginal = count.getText().isEmpty() ? 0 : Integer.parseInt(count.getText())
		System.out.print('Số lượng ban đầu: ' + countoriginal);

		WebUI.click(findTestObject("Object Repository/Cart/lbl_productcheckout"));
		WebUI.click(findTestObject('Object Repository/Cart/btn_addtocart_productdetail'));
		WebElement updatecount = WebUI.findWebElement(findTestObject('Object Repository/Cart/quantity_original'));
		int countnew = updatecount.getText().isEmpty() ? 0 : Integer.parseInt(updatecount.getText())

		WebUI.verifyEqual(countoriginal + 1, countnew, FailureHandling.CONTINUE_ON_FAILURE);
		WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/btn_remove_productdetail'), 20);
	}
}
