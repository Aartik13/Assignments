package week1.day1;

public class Mobile1 {
	String mobileBrandName = "Apple";
	char mobileLogo = 'A';
	short noOfMobilePiece = 3000;
	int modelNumber = 13;
	long mobileNumber = 1234567890l;
	float mobilePrice = 75000.99f;
	boolean isDamaged = true;

	public static void main(String[] args) {
		Mobile1 B = new Mobile1();
		System.out.println(B.mobileBrandName);
		System.out.println(B.mobileLogo);
		System.out.println(B.noOfMobilePiece);
		System.out.println(B.modelNumber);
		System.out.println(B.mobileNumber);
		System.out.println(B.mobilePrice);
		System.out.println(B.isDamaged);

	}

}
