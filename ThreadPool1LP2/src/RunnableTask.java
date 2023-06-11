
public class RunnableTask implements Runnable{

	int r;
	
	public RunnableTask(int r) {
		this.r = r;
	}
	@Override
	public void run() {
		
		System.out.println("Helooo...");
		
	}

}
