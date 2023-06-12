
public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("Thread #1");
		
		MyThread t2 = new MyThread("Thread #2");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		

	}

}
