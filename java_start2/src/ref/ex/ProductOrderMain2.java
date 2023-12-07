package ref.ex;

public class ProductOrderMain2 {

	public static void main(String[] args) {
		ProductOrder[] orders = new ProductOrder[3];
		orders[0] = createOrder("호박", 2000,3);
		orders[1] = createOrder("고구마", 3000,4);
		orders[2] = createOrder("호구마", 1000,5);
		
		printOrders(orders);
		int total = getTotalAmount(orders);
		System.out.println("총 결제 금액: "+ total);
	}
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}
	static void printOrders(ProductOrder[] orders) {
		for(int i = 0; i<orders.length; i++) {
			System.out.println("상품명: "+ orders[i].productName + ", 가격: "+ orders[i].price+ ", 수량: "+ orders[i].quantity);	
		}
	}
	static int getTotalAmount(ProductOrder[] orders) {
		int sum = 0;
		for(int i = 0; i<orders.length; i++) {
			sum += orders[i].price * orders[i].quantity;
		}
		return sum;
	}
}
