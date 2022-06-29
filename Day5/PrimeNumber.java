
import java.util.Scanner;
 
public class PrimeNumber {

	public static void main(String [] args) {

		int num, i;
		boolean value = false;

		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		num = s.nextInt();

		for (i = 2; i <= num / 2; i++) {
		   //condition for the non prime number
			if (num % i == 0) {
				value = true;
				break;
			}
				
		}
		
		if (!value)
                   System.out.println(num + " is prime number.");
		else
		   System.out.println(num + " is not prime number.");

	}

}
