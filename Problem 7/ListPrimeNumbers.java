
public class ListPrimeNumbers {

	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
	}
	
	/**
	 * @return the integer value of the nth prime number
	 */
	public static long nthPrime(long n) {
		int numOfPrimes = 0;
		long prime = 1;
		
		while (numOfPrimes < n) {
			prime++;
			if (isPrime(prime)) {
				numOfPrimes++;
			}
		}
		return prime;
	}
	/**
	 * @return true if parameter n is a prime number
	 */
	public static boolean isPrime(long n) {
		if (n < 2) return false;
		else if (n == 2) return true;
		for (int i = 2; i < Math.pow(n, 0.5) + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
