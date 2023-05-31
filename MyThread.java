
public class MyThread extends Thread {
	private String message;

	public MyThread(String m) {
		message = m;
	}

	public void run() {
		for (int r = 0; r < 10; r++) {
			System.out.println(message);
		}
	}

	public class ThreadDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyThread t1, t2;
			t1 = new MyThread("primeiro thead");
			t2 = new MyThread("segundoo thead");
			t1.start();
			t2.start();

			while (t1.isAlive()) {
				System.out.println("TERMINANDO");
			}

		}

	}
}
