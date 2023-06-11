
public class RunDemo {

	public static void main(String[] args) {
		
		MyRun r = new MyRun();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
		
		t1.interrupt();
		Thread.interrupted();
		t2.interrupt();
	}

}
