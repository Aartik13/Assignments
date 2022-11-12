package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc= new Calculator();
		
		int add = calc.add(10, 20, 30);
		int sub = calc.sub(30, 10);
		double mul = calc.mul(50.35, 6.5);
		float divide = calc.divide(45.2f, 3.4f);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(divide);
		
		
		

	}

}
