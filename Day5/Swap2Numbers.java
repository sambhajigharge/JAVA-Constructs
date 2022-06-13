

public class Swap2Numbers {

	public static void main (String[] args) {

	     int first = 10, second = 20, temp;

	     System.out.println("--Before Swap--");
	     System.out.println("First Number = " + first);
	     System.out.println("Second Number = " + second);

		//value of first is assigned to temporary

		temp = first;

		//value of second is assigned to first

		first = second;

		// value of temp (which is initial value first) is assigned to second

		second = temp;

	     System.out.println("--After Swap--");
             System.out.println("First Number = " + first);
             System.out.println("Second Number = " + second);

	}
}
