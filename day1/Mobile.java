package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Call my friend");
	}
	
	public void sendMsg() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Mobile M= new Mobile();
		
		M.makeCall();
		M.sendMsg();

	}

}
