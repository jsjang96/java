package static2.ex;

public class MathArrayUtils {
	
	//private으로 생성자를 막을 수 있음. 
	//=>static으로 불러써~ 라는 의도.
	private MathArrayUtils() {
		
	}
	
	public static int sum(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	public static double average(int[] values) {
		return (double)sum(values) / values.length;
	}
	
	public static int min(int[] values) {
		int min = values[0];
		
		for(int i=0; i<values.length; i++) {
			if(values[i] < min) {
				return values[i] = min;
			}
		}
		return min;
		
	}
	
	public static int max(int[] values) {
		int max = values[0];
		
		for(int i=0; i<values.length; i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}
		return max;
	}
	
}
