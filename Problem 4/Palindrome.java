
public class Palindrome {

 public static void main(String[] args) {
  
  int lastNum = 0;
  for (int i = 100; i < 1000; i++) {
   for (int j = 100; j < 1000; j++) {
    getPalindrome(i * j);
    if (getPalindrome(i * j) && ((i * j) > lastNum)) {
     lastNum = i * j;
    }
   }
  }
  System.out.println(lastNum);
  
  System.out.println(getPalindrome(999));
  
 }
 
 public static boolean getPalindrome(int num1) {
  String forwards = Integer.toString(num1);
  String backwards = "";
  for (int i = forwards.length() - 1; i >= 0; i--) {
   backwards += forwards.charAt(i);
  }
  if (forwards.equals(backwards)) {
   return true;
  } else {
   return false;
  }
  
 }

}

