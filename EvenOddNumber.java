

import java.util.Scanner;

public class EvenOddNumber {
	public static void main (String[] args) {
	     
	     System.out.println("Enter a number: ");
	     Scanner reader = new Scanner(System.in);
	     int num = reader.nextInt();

	     if (num % 2 == 0)

	     System.out.println(num + " is Even Number ");
	     
	     else

	     System.out.println(num + " is odd Number ");

	}
}
