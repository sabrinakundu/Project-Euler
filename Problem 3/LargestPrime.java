



public class LargestPrime {

	public static void main(String[] args) {
    	long number = 600851475143L;
		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				number /= i;
			}
			}
		System.out.println(number);
			}
		}



