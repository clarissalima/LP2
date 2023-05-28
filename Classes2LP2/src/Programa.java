
public class Programa {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente("Joao da Silva", "Praca da paz");
		Cliente maria = new Cliente("Maria da Silva", "Praca da paz");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);
		
		System.out.println("Saldo do Joao: " + conta_joao.getSaldo());
		System.out.println("Saldo da Maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(300);
		System.out.println("Saldo Joao depois do saque: " + conta_joao.getSaldo());
		
		
	}

}
