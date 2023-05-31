
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
	
	public void sacar(float valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso");
			
		} else if(valor <= (this.saldo + this.limite)){
			
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso");
			
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	public void depositar(float valor) {
		
		synchronized (this) {
			this.saldo = this.saldo + valor;
		}
	}
	
	
	//metodo getter do atributo saldo
	public float getSaldo() {
		return this.saldo;
	}
	
	public String toString(){
		return "O saldo da conta é " + this.getSaldo();
		
	}

}
