
public class Demo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("PRIMEIRA THREAD" , "1", 100);
		
		MyThread t2 = new MyThread("SEGUNDA THREAD", "2", 120);
		
		MyThread t3 = new MyThread("TERCEIRA THREAD", "3", 1000);
		
		t1.start();
		
		t2.start();
		
		t3.start();

	}

}
