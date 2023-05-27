
public class matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[][] = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				numeros[i][j] = (i + j) * 2;
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				
				System.out.println("Matriz [" + i + "], [" + j + "] = " + numeros[i][j] );

			}

		}
	}
}
