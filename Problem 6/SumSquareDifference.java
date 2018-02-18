
public class SumSquareDifference {

	public static void main(String[] args) {
		int total1 = 0;
		int total2 = 0;
		for (int i = 0; i < 101; i++) {
			total1 += Math.pow(i, 2);
		}
		for(int i = 0; i < 101; i++) {
			total2 += i;
		}
		System.out.println(total1);
		System.out.println(Math.pow(total2, 2));
		double diff = Math.pow(total2, 2) - total1;
		System.out.println(diff);
		}
		
		}




