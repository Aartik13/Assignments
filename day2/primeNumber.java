package week1.day2;

public class primeNumber {

	public static void main(String[] args) {
		int num = 17;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
//			condition for non prime number
			System.out.println(" i = " + i + " | (num / 2) = " + (num/2));
			if (num % i == 0) {
				System.out.println("-- Divided > i = " + i + " | num = " + num);
				flag = true;
				break;

			}
		}
		if (!flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");

		{

		}
	}

}
