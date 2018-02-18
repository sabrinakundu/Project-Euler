/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * @author SabrinaK
 *
 */
public class SumOfPrimes {

	public static void main(String[] args) {
		long number = 2000000;
		long sum = 0;
		for (int i = 2; i < number; i++) {
			if (isPrime(i) == true) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
	
	/*
	 * @return true if parameter n is a prime number
	 */
	public static boolean isPrime(int n) {
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
