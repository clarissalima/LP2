
public class MyThread extends Thread{
	
	private String message;
	private String name;
	private int tempo;
	
	public MyThread(String message, String name, int tempo) {
		this.message = message;
		this.name = name;
		this.tempo = tempo;
	}
	
	public void run() {
		for(int r = 0; r < 10; r++) {
			System.out.println(message + "\ncontador: " + r + "\nThread #" + name);
			
			System.out.println();
			
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
