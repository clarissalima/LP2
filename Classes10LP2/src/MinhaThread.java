
public class MinhaThread implements Runnable{

	
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThread(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(this.nome + " iniciada");
		
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);
		
		System.out.println(this.nome + " terminada");
		
	}
	
}
