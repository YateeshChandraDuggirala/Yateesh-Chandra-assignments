package multithreading_practice;

public class CustomerITCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final CustomerITC c = new CustomerITC();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}

}
