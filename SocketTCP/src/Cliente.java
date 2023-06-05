import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException {

		//1. abrindo conexao
		Socket socket = new Socket("127.0.0.1", 1111);
		int port = 54321; //so p o caso de bugar
		
		//2. definindo stream de saida de dados do cliente
		DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
		//enviando mensagem em minusculo para servidor
		saida.writeUTF("clarissa");
		
		//3. definindo stream de entrada de ddos no cliente
		DataInputStream entrada = new DataInputStream(socket.getInputStream());
		//recebendo mensagem em maiusculo do servidor
		String novaMensagem = entrada.readUTF();
		System.out.println(novaMensagem);
		
		//4. fechando streams de entra e saida de dados e socket
		entrada.close();
		saida.close();
		socket.close();
	}
}

