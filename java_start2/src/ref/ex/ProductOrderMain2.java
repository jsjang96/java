package ref.ex;

public class ProductOrderMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder productOrder = new ProductOrder();
		productOrder.productName = "두부";
		productOrder.price = 2000;
		productOrder.quantity = 3;
	}
}
