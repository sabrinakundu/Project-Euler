/**
 * Finds the smallest multiple evenly divisible by all of the numbers from 1 to 20
 * @author SabrinaK
 *
 */
public class SmallestMultiple {
	
	public static void main(String[] args) {
		int smallest = 1;
		
		while(!divide(smallest)) {
			smallest++;
		}
		
		System.out.println("Smallest number is: " + smallest);
	}

	//if number can be divided by each number from 1 to 10 without remainder -> return true
	public static boolean divide(int x) {
		for (int i = 1; i <= 20; i++) {
			if (x % i != 0) {
				return false;
			}
		}
		System.out.println(x);
		return true;
	}
	

}
