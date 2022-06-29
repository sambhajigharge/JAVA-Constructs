
import java.util.Scanner;

public class QuotientRemainder {
	public static void main (String[] args) {
	     
	     System.out.println("Enter first number: ");
	     Scanner sc = new Scanner(System.in);
	     int num1 = sc.nextInt();

	     System.out.println("Enter second number: ");
	     int num2 = sc.nextInt();
 		
	     int quotient = 0, remainder = 0;

	     quotient = (num1 / num2 ) - remainder;
	     remainder = num1 - num2 * quotient;

	     System.out.println("Quotient = " + quotient);
	     System.out.println("Remainder = " + remainder);

	}
}
