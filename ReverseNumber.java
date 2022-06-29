
import java.util.Scanner;
 
public class ReverseNumber {

	public static void main(String [] args) {

		int number, remainder, reverseNumber = 0;
		boolean value = false;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		number = sc.nextInt();

		while (number > 0) {
			remainder = number % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number / 10;
		}
		
                   System.out.println("Reverse Number is : " + reverseNumber);

	}

}
