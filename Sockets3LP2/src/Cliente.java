import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {

	//diz que objetos da classe podem ser trafegados em rede
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		//abrindo conexao
		Socket socket = new Socket("127.0.0.1", 8080);
		int port = 8080;
		
		//2. definindo stream de saida de dados do cliente
		ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
		Pessoa p = new Pessoa("Clarissa Lima", 20);
		saida.writeObject(p);
		
		//3. fechar stream de saida de dados
		saida.close();
		
		//4. fechar o socket
		socket.close();

	}

}
