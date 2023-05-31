
public class Programa {

	public static void main(String[] args) throws InterruptedException {
		
		Cliente clil = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, clil);
		
		FazDeposito acao = new FazDeposito(c1);
		
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c1);

	}

}
