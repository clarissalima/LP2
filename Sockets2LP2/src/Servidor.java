import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException{
		
		
		//1. abrindo porta de conexao
		ServerSocket servidorSocket = new ServerSocket(8080);
		int port = 8080;
		
		System.out.println("A porta 8080 foi aberta!");
		System.out.println("Servidor esperando recerber mensagem de clientes...");
		
		
		//2. aguardando solicitações de clientes(pode ser mais que 1!)
		while(true) {
			Socket socket = servidorSocket.accept();
			//motrando IP do cliente conectado
			System.out.println("Cliente " + socket.getInetAddress().getHostAddress() + " conectado");
			
			//3. definir uma thread para cada cliente conectado
			ThreadSockets thread = new ThreadSockets(socket);
			thread.start();
		}
		

	}

}
