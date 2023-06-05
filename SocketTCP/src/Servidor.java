import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {

		//1. defindo o serverSocket (abrr porta de conexao)
		ServerSocket servidorSocket = new ServerSocket(54321);
		System.out.println("A porta 54321 foi aberta");
		System.out.println("Servidor esperando msgs de clientes...");
		
		//2. aguardar solicitacoes de conexao de clientes
		Socket socket = servidorSocket.accept();
		//mostrando ip do cliente conectado
		System.out.println("Cliente " + socket.getInetAddress().getHostAddress() 
				+ " conectado");

		//3. defindo uma thread para cada cliente conectada
		ThreadSockets thread = new ThreadSockets(socket);
		thread.start();
	}
}

