import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ConnectException;

public class Cliente {

	public static void main(String[] args) throws IOException{
		
		//1. Abrir conexão
		Socket socket = new Socket("127.0.0.1", 8080);
		
		int port = 8080;
		
		//2. Definit stream de saida de dados do cliente
		DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
		//envia mensagem em minusculo para o servidor
		saida.writeUTF("clarissa");
		
		//3. Definir stream de entrada de dados no cliente
		DataInputStream entrada = new DataInputStream(socket.getInputStream());
		//receber mensagem em maiusculo no servidor
		String novaMensagem = entrada.readUTF();
		//mostrar mensagem em maiusculo no cliente
		System.out.println(novaMensagem);
		
		//4. fechar streams de entrada e saida de dados
		entrada.close();
		saida.close();
		
		//5. fechar o socket
		socket.close();

	}

}
