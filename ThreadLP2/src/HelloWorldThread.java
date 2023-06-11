
public class HelloWorldThread extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World");
			System.out.println("Tudo bom galera");
		}
	}

	public static void main(String[] args) {

		HelloWorldThread t1 = new HelloWorldThread();

		HelloWorldThread t2 = new HelloWorldThread();

		t1.start();
		t2.start();

	}

}
