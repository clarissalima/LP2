import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException{
		
		Socket socket = new Socket("127.0.0.1", 8080);
		
		int port = 8080;
		
		DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
		saida.writeUTF("clariclariclari");
		
		DataInputStream entrada = new DataInputStream(socket.getInputStream());
		String novaMensagem = entrada.readUTF();
		System.out.println(novaMensagem);
		
		entrada.close();
		saida.close();
		
		socket.close();

	}

}
