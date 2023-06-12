
public class MyThread extends Thread{
	
	private String message;
	
	public MyThread(String message) {
		this.message = message;
		
	}
	
	public void run() {
		System.out.println("Iniciando " + message);
		
		for(int i =0; i < 100000; i++) {
			for(int j = 0; j < 100000; j++) {
				for(int k = 0; k < 100000; k++) {
				}
			}
		}
		
		System.out.println("Terminando " + message);
	}

}
