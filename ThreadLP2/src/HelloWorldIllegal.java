
public class HelloWorldIllegal extends Thread{
	
	public void run() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		
		HelloWorldIllegal t = new 	HelloWorldIllegal();
		
		t.start();
		
		System.out.println("Reiniciando...");
		
		t.start();
		
		System.out.println("Termiando...");
	
	}

}
