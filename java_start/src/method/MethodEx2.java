package method;

public class MethodEx2 {

	public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message, 4);
        printMessage(message, 5);
	} 
    
	public static void printMessage(String message, int numbers) {
		for(int i = 0; i < numbers; i++) {
			System.out.println(message);
		}
		
	}

}

