 
import java.util.Scanner;
public class leapYear {
    public static void main (String[] args) {
       int year;
	System.out.println("Enetr a year : ");
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();

	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))

	    System.out.println("Given year is a leap year");
	else
	    System.out.println("Given year is not a leap year");

      }
}
