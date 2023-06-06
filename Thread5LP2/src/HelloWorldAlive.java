
public class HelloWorldAlive  extends Thread{

	public void run() {
		System.out.println("Hello World!");
		
		System.out.println("ahahahahasfsfsg");
		
	}
	public static void main(String[] args) {

		System.out.println("Inicializando...");
		
		HelloWorldAlive t1 = new HelloWorldAlive();
		t1.start();
		
		HelloWorldAlive t2 = new HelloWorldAlive();
		t2.start();
		
		HelloWorldAlive t3 = new HelloWorldAlive();
		t3.start();
		
		while(t1.isAlive() || t2.isAlive() || t3.isAlive());
		

		System.out.println("Terminando...");
	}

}
