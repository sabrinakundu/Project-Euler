
public class FibonacciSum {
	private static int fibonacci(int n) {
		int x = 0;
		int y = 1;
		for (int i = 0; i < n; i++) {
			int sum = x + y;
			x = y;
			y = sum;
		}
		return x;
	}

	public String evenNumSum() {
		int evenSum = 0;
		for (int x = 0; ; x++) {
			int fib = fibonacci(x);
			if (fib > 4000000)
				break;
			 if (fib % 2 == 0)  
	                evenSum += fib;
		}
		return Integer.toString(evenSum);
	}
	
	public static void main(String[] args) {
		System.out.println(new FibonacciSum().evenNumSum());
		
	}

}

