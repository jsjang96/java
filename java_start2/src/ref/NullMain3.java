package ref;

public class NullMain3 {

	public static void main(String[] args) {
		BigData bigData = new BigData();
		System.out.println("bigData.count: "+bigData.count);
		System.out.println("bigData.data: "+bigData.data); //참조값이기 때문에 null값
		
		//NullPointerException
		System.out.println("bigData.data.value" + bigData.data.value);
	}
}
