import java.util.Scanner;

public class for_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}
		}
		
		teclado.close();

	}

}
