package ref.ex;

public class ProductOrderMain2Practice {

	public static void main(String[] args) {
		ProductOrder[] orders = new ProductOrder[3];
		orders[0] = createOrder("배추", 2000, 4);
		orders[1] = createOrder("무", 3000, 5);
		orders[2] = createOrder("감", 5000, 6);
		
		printOrders(orders);
		int total_price = getTotalAmount(orders);
		System.out.println("총 결제 금액: " + total_price);
	}
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}
	static void printOrders(ProductOrder[] orders) {
		for (int i=0; i<orders.length; i++) {
			System.out.println("상품명: "+ orders[i].productName + ", 가격: "+ orders[i].price + ", 수량: " + orders[i].quantity);
		}
	}
	static int getTotalAmount(ProductOrder[] orders) {
		int total = 0;
		for(int i=0; i<orders.length; i++) {
			int sum = orders[i].price * orders[i].quantity;
			total += sum;
		}
		return total;
	}
}
