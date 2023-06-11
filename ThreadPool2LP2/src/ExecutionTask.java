import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutionTask {

	public static void main(String[] args) {
		
		Executor exec = Executors.newCachedThreadPool();
		
		int r = 0;
		
		while(true) {
			exec.execute(new RunnableTask(++r));
		}
		
	}

}
