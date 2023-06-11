
public class MyRun implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		if(Thread.interrupted()) {
			System.out.println(t.getName() + " interrompida!");
		}
		
	}

}
