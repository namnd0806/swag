/* 1 Số hàm thường dùng
 
// ----- Các hàm nhập, xét giá trị ô nhập ----- //
1. setText()
- Chức năng: Nhập văn bản vào ô nhập liệu.
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho ô nhập liệu.
 + text (String): văn bản cần nhập
- VD: WebUI.setText(testObject, text);
2. sendKeys()
- Chức năng: Gửi một chuỗi ký tự hoặc phím nhấn đến một phần tử (thường dùng cho ô nhập liệu hoặc phím tắt).
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho ô nhập liệu.
 + keys (String): Chuỗi ký tự hoặc phím nhấn cần gửi.
- VD: WebUI.setText(testObject, keys);

3. clearText()
- Chức năng: Xóa nội dung hiện tại trong ô nhập li
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho ô nhập liệu.
- VD: WebUI.clearText();

4. getText()
- Chức năng: Lấy văn bản hiện tại từ 1 ô nhập hoặc phần tử.
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho phần tử
- VD: WebUI.getText(testObject)
WebUI.getText(findOBJ)


// ----- Các hàm click, hover ----- //
1. click()
2. doubleClick()
3. rightClick()
4. mouseOver()
5. mouseOverOffset()

// ----- Các hàm wait ----- //
1. waitForPageLoad()
- Chức năng: hàm này đợi cho đến khi trang web tải xong hoàn toàn trước khi thực hiện bước thiếp theo.
- Tham số:
 + timeout (Integer)
 + Thời gian chờ tối đa để trang tải xong, tính bằng giây. Nếu trang không tải hoàn tất trong thời gian này,
 quá trình kiểm thử sẽ thất bại.
- VD: WebUI.waitForPageLoad(20);

2. waitForElementVisible()
- Chức năng: Hàm này đợi cho đến khi 1 phần tử cụ thể xuất hiện và có thể nhìn thấy trên (UI).
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho phần tử cần kiểm tra.
 + timeout (Integer): Thời gian chờ tối đa để phần tử hiển thị, tính bằng giây.
- VD: WebUI.waitForElementVisible(testOject, timeout);

3. waitForElementPresent()
- Chức năng: Hàm này đợi cho phần tử có mặt trong (DOM) của trang, không nhất thiết phải nhìn thấy được trên (UI).
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho phần kiểm tra.
 + timeout (Integer): Thời gian chờ tối đa để phần tử hiển thị, tính bằng giây.
- VD: WebUI.waitForElementPresent(testObject, timeout);

4. waitForElementHasAttribute()
- Chức năng: Hàm này đợi cho đến khi 1 thuộc tính có giá trị nhất định có mặt trong DOM, không nhất thiết phải làm cho phần tử hiển thị trên (UI)
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho phần tử cần kiểm tra.
 + attributeName (String): Tên của thuộc tính cần kiểm tra("class", "value"...).
 + attributeValue (String): Giá trị của 1 thuộc tính cần ki
 + timeout (Integer): Thời gian chờ tối đa để phần tử hiển thị, tính bằng giây.
- VD: WebUI.waitForElementHasAttribute(testObject, attributeName, attributeValue, timeout);

// ----- Các hàm verify ----- //
1. verifyElementPresent()
- Chức năng: Xác minh rằng một phần tử tồn tại trong DOM (Document Object Model) của trang, bất kể nó có hiển thị (UI) hay không.
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho phần tử cần kiểm tra.
 + timeout (Integer): Thời gian chờ tối đa để tìm thấy phần tử, tính bằng giây.
- VD: WebUI.verifyElementPresent(testObject, timeout);

2. verifyElementVisible()
- Chức năng: Xác minh rằng một phần tử cụ thể có hiển thị trên giao diện người dùng (UI) và có thể nhìn thấy được.
- Tham số:
 + testObject (TestObject): Đối tượng kiểm thử đại diện cho phần tử cần kiểm tra.
 + timeout (Integer): Thời gian chờ tối đa để tìm thấy phần tử, tính bằng giây.
- VD: WebUI.verifyElementVisible(testObject, timeout);

3. verifyElementText()
- Chức năng: Xác minh rằng văn bản của một phần tử khớp với văn bản mong đợi.
- Tham số:
 + testObject (TestObject): Đối tượng cần kiểm thử.
 + expectedText (String): Văn bản mong đợi mà phần tử lên có.
- VD: WebUI.verifyElementText(testObject, expectedText);

4. verifyEqual()
- Chức năng: Xác minh rằng hai giá trị đầu vào bằng nhau. Thường dùng để kiểm tra giá trị của một biến hoặc đầu ra của một phương thức
- Tham số:
 + actual (Object): Giá trị thực tế.
 + expected (Object): Giá trị mong đợi.
- VD: WebUI.verifyEqual(actual, expected);

5. verifyNotEqual()
- Chức năng: Xác minh rằng hai giá trị đầu vào không bằng nhau. Thường dùng để đảm bảo rằng giá trị thực tế không khớp với giá trị mong đợi.
- Tham số:
 + actual (Object): Giá trị thực tế.
 + expected (Object): Giá trị không mong đợi
- VD: WebUI.verifyNotEqual(actual, expected);

*/