
public class Teste {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread("#1", 500);

//		Thread t1 = new Thread(thread);
//		t1.start();

		MinhaThread thread2 = new MinhaThread("#2", 350);

		MinhaThread thread3 = new MinhaThread("#3", 1100);

		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);

//		
//		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Programa finalizado");
	}

}
