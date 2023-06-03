import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		//1. abrir a porta de conexao
		ServerSocket serverSocket = new ServerSocket(8080);
		System.out.println("A porta 54321 foi aberta!");
		System.out.println("Servidor esperando receber mensagem de cliente...");
		
		
		int port = 8080;
		
		//2. aguardar solicitação de conexao de cliente
		Socket socket = serverSocket.accept();
		//mostrar endereco IP do cliente conectado
		System.out.println("Cliente " + socket.getInetAddress().getHostAddress() + " conectado");
		
		//3. Definir stream de entrada de dados no servidor
		DataInputStream entrada = new DataInputStream(socket.getInputStream());
		//receber mensagem em minusculo do cliente
		String mensagem = entrada.readUTF();
		//converter mensagem em maiusculo
		String novaMensagem = mensagem.toUpperCase();
		
		//4. definir stream de saida de dados do servidor
		DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
		saida.writeUTF(novaMensagem);
		
		//5. fechar stream de entrada e saida de dados
		entrada.close();
		saida.close();
		
		//6. fechar sockets de comunicacao e conexao
		socket.close();
		serverSocket.close();
		
	}

}
