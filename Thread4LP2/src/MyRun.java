
public class MyRun implements Runnable{
	
	String message;
	
	public MyRun(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for(int r =0; r < 10; r++) {
			
			System.out.println(message + "\n Execução número: " + (r+1));
			
			System.out.println();
		}
		
		
	}

}
