import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutionTask {

	public static void main(String[] args) {
		
		int nt = Integer.parseInt(args[0]);
		
		Executor exec = Executors.newFixedThreadPool(nt);
		
		int r = 0;
		
		while(true) {
			exec.execute(new RunnableTask(++r));
		}

	}

}
