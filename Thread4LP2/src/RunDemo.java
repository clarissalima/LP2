
public class RunDemo {

	public static void main(String[] args) {
		
		MyRun r1 = new MyRun("Thread #1");
		
		MyRun r2 = new MyRun("Thread #2");
		
		MyRun r3 = new MyRun("Thread #3");
		
		MyRun r4 = new MyRun("Thread #4");
		
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(r2);
		
		Thread t3 = new Thread(r3);
		
		Thread t4 = new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
