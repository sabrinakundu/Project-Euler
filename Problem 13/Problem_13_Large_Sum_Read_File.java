import java.math.BigInteger;
import java.util.Scanner;
import java.io.File;

public class Problem_13_Large_Sum_Read_File {

	public static void main(String[] args) {
		 try {
		      Scanner in = new Scanner(new File("C:\\Users\\SabrinaK\\eclipse-workspace\\Project Euler\\src\\Problem_13_Large_Sum_Numbers.txt"));
		      BigInteger sum = BigInteger.ZERO;
		      while(in.hasNextLine()) {
		    	sum = sum.add(new BigInteger(in.nextLine()));  
		      }
		      System.out.println(sum.toString().substring(0, 10));
		 } catch (Exception e) {
		      e.printStackTrace();
		    }

	}

}
