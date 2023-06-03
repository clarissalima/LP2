import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException, ClassNotFoundException{


		ServerSocket serverSocket = new ServerSocket(8080);
		int port = 8080;

		System.out.println("A porta 8080 foi aberta");
		System.out.println("Servidor esperando receber objeto de cliente...");
		
		Socket socket = serverSocket.accept();
		
		System.out.println("Cliente " + socket.getInetAddress().getHostAddress() + " conectado");
		
		//definindo stream de entrada de dados no servidor
		ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
		//typecast
		Pessoa p = (Pessoa) entrada.readObject();
		System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade());
		
		entrada.close();
		
		socket.close();
		
		serverSocket.close();
		
	}

}
