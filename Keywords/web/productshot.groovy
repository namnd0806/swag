package web
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class productshot {

	@Keyword
	public void ShortLowToHigh() {
		List<WebElement> priceElements = WebUI.findWebElements(findTestObject('Object Repository/Products/list_products_short'), 20);

		// Tạo danh sách giá trị số từ các phần tử đã lấy
		List<Float> prices = priceElements.collect { element ->
			Float price = Float.parseFloat(element.getText().replace('$', ''));
			System.out.print("Giá trị phần tử: " + price + "\n");
			return price;
		}
		// Kiểm tra xem danh sách đã sắp xếp từ thấp đến cao hay chưa
		List<Float> sortedPrices = new ArrayList<>(prices);
		Collections.sort(sortedPrices);
		// So sánh danh sách giá trị ban đầu với danh sách đã sắp xếp
		WebUI.verifyEqual(prices, sortedPrices);
	}

	@Keyword
	public void ShortHighToLow() {
		List<WebElement> priceElements = WebUI.findWebElements(findTestObject('Object Repository/Products/list_products_short'), 20);

		List<Float> prices = priceElements.collect { element ->
			Float price = Float.parseFloat(element.getText().replace('$', ''));
			System.out.print("Giá trị phần tử: " + price + "\n");
			return price;
		}
		List<Float> sortedPrices = new ArrayList<>(prices);
		Collections.sort(sortedPrices, Collections.reverseOrder());
		WebUI.verifyEqual(prices, sortedPrices);
	}
}



