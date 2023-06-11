
public class WorkerThread implements Runnable {

	private int workerNumber;

	WorkerThread(int workerNumber) {
		this.workerNumber = workerNumber;
	}

	// A tarefa faz algo e periodicamente informa o percentual de trabalho realizado
	@Override
	public void run() {

		for (int i = 0; i <= 100; i += 20) {
			System.out.println("Worker number: " + workerNumber + ", percent complete: " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
