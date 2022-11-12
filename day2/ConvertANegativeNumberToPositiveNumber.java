package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int num = -40;

		if (num < 0) {
			int positiveNum= (num*-1);
			System.out.println("Negative number is converted to postive number="+positiveNum+".");
			
		} else {
			System.out.println("The number is a positive number");
		}

	}

}
