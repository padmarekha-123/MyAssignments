package week2.day1;

public class FibonacciSeriesHA {
	public static void main(String[] args) {
		int constant = 8;
		int a = 0;
		int b = 1; 
		for(int i=1;i<=constant;i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}

}
