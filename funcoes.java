import java.util.Scanner;

public class funcoes {

	static String frutas[];

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int qtd;

		System.out.println("Informe a quantidade de frutas: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		//chamando funcoes
		cadastrar_dados(qtd);
		mostrar_dados(qtd);

		teclado.close();
	}

	static void cadastrar_dados(int quantidade) {
		frutas = new String[quantidade];

		for (int i = 0; i < quantidade; i++) {

			System.out.println("Informe a " + (i + 1) + " fruta: ");
			frutas[i] = teclado.nextLine();

		}
	}

	static void mostrar_dados(int quantidade) {
		for (int i = (quantidade - 1); i >= 0; i--) {

			System.out.println(frutas[i]);
		}

	}

}
