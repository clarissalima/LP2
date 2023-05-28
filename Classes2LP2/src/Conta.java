
public class Conta {
	int numero;
	private float saldo;
	float limite;
	
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo + limite;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	void sacar(float valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	
	//metodo getter do atributo saldo
	public float getSaldo() {
		return this.saldo;
	}

}
