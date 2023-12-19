package access.ex;

public class ShoppingCart {
	private Item[] items = new Item[10];
	private int itemCount;

	public void addItem(Item item) {
		if(itemCount > items.length) {
			System.out.println("수량을 초과했습니다.");
			return;
		}
		
		items[itemCount] = item;
		itemCount++;
	}
	
	public void displayItems() {
		System.out.println("장바구니 상품 출력");
		for(int i=0; i<itemCount; i++) {
			Item[] item = items;
			System.out.println("상품명: " + item[i].getName() + "합계: " + item[i].getTotalPrice());
			
		}
		System.out.println("전체 가격: " + totalPrice());
	}
	
	private int totalPrice() {
		int total = 0;
		for(int i=0; i<itemCount; i++) {
			Item[] item = items;
			total+=item[i].getTotalPrice();	
		}
		return total;
	}
}
