package lp2;
import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 1;
		String nome;
		
		
		Scanner teclado = new Scanner(System.in);
		
		while(idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			//bug do java, tem que receber dessa forma
			System.out.println(nome + " tem " + idade + " anos.");
		}
		
		teclado.close();

	}

}
