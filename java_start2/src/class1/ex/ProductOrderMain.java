package class1.ex;

public class ProductOrderMain {

	public static void main(String[] args) {
		//여러 상품의 주문 정보를 담는 배열 생성
		//상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
		//상품 주문 정보와 최종 금액 출력
		ProductOrder[] productOrder = new ProductOrder[3];

//내가 생각 못한 부분 : 배열로 데이터타입을 정해서 ProductOrder로 참조값을 형성한 것 까지는 했음
//하지만 배열의 각가의 방마다 주소값을 만들어주는 것을 못함.
//		productOrder[0] = new ProductOrder();
//		productOrder[1] = new ProductOrder();
//		productOrder[2] = new ProductOrder();
		
//		productOrder[0].productName = "두부";
//		productOrder[1].productName = "김치";
//		productOrder[2].productName = "콜라";
//		productOrder[0].price = 2000;
//		productOrder[1].price = 5000;
//		productOrder[2].price = 1500;
//		productOrder[0].quantity = 2;
//		productOrder[1].quantity = 1;
//		productOrder[2].quantity = 2;

//강사님이 해주신 코드대로 하자
		ProductOrder order1 = new ProductOrder();
		productOrder[0] = order1;
		order1.productName = "두부";
		order1.price = 2000;
		order1.quantity = 2;
		
		ProductOrder order2 = new ProductOrder();
		order2.productName = "김치";
		order2.price = 5000;
		order2.quantity = 1;
		productOrder[1] = order2;
		
		ProductOrder order3 = new ProductOrder();
		order3.productName = "콜라";
		order3.price = 1500;
		order3.quantity = 2;
		productOrder[2] = order3;
		
		int sum = 0;
		for(int i=0; i<productOrder.length;i++) {
			System.out.println("상품명: "+productOrder[i].productName+", 가격: "+productOrder[i].price+", 수량: " +productOrder[i].quantity);
			sum += productOrder[i].price * productOrder[i].quantity;			
		}
		System.out.println("총 결제 금액: "+ sum);

	}

}
