package method;

public class MethodEx3Ref {
    public static void main(String[] args) {
       deposit(10000, 1000);
       withdraw(10000,11000);
    }
    public static void deposit(int balance, int deposit) {
    	balance = balance + deposit;
    	System.out.println(deposit+"원을 입금하였습니다. 현재 잔액: "+ balance);
    	
    	}
    public static void withdraw(int balance, int withdraw) {
    	balance = balance - withdraw;
    	if (balance >= withdraw) {
    		System.out.println(withdraw + "원을 출금하였습니다. 현자 잔액: "+ balance+ "원");
    	}else {
    	System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
    	}
    }
}

	