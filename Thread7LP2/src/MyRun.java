
public class MyRun implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		//vai imprimir a t1 e t2
		
		System.out.println(t.getName() + ": " + t.getId());
		
	}

}
