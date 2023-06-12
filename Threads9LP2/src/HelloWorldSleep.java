
public class HelloWorldSleep extends Thread{
	
	public void run() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {

		System.out.println("Iniciando...");
		
		HelloWorldSleep t = new HelloWorldSleep();
		
		t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Terminando...");


	}

}
