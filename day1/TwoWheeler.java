package week1.day1;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chasisNumber = 1234567890l;
	boolean isPunctured = true;
	String bikeName = "fz";
	double runningKM = 1200.34;

	public static void main(String[] args) {

		TwoWheeler A = new TwoWheeler();
		System.out.println(A.noOfWheels);
		System.out.println(A.noOfMirrors);
		System.out.println(A.chasisNumber);
		System.out.println(A.isPunctured);
		System.out.println(A.bikeName);
		System.out.println(A.runningKM);

	}

}
