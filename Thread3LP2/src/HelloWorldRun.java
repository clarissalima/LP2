
public class HelloWorldRun implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("Hello World");
		
	}


	public static void main(String[] args) {
		
		HelloWorldRun t1 = new HelloWorldRun();
		
		Thread n = new Thread(t1);
		
		n.start();

	}


}
