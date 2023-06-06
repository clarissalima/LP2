
public class RunDemo {

	public static void main(String[] args) {


		MyRun r = new MyRun();
		
		Thread t1 = new Thread(r);
		 Thread t2 = new Thread(r);
		 
		 //instancia para classe main
		 Thread m = Thread.currentThread();
		 
		 System.out.println(m.getName() + ": " + m.getId());
		 
		 t1.start();
		 t2.start();

	}

}
