import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadSockets extends Thread {
	
	private Socket socket;
	public ThreadSockets(Socket s) {
		this.socket = s;
	}
	
	public void run() {
		//imprimindo o nome da thread
		System.out.println(Thread.currentThread().getName());
		//1. definindo stream de entrada de dados no servidor
		try {
			DataInputStream entrada = new DataInputStream(socket.getInputStream());
			//recendo mensagem em minusculo do cliente
			String mensagem = entrada.readUTF();
			//convertendo em maiusculo
			String novaMensagem = mensagem.toUpperCase();
			
			//2. definindo stream de saida de dados do servidor
			DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
			//enviando mensagem em maiusculo para cliente
			saida.writeUTF(novaMensagem);
			
			//3. fechar streams de entrada e saida de dados e socket de comunicacao
			entrada.close();
			saida.close();
			socket.close();
		} catch (IOException ioe) {
			System.out.println("Erro " + ioe.toString());
		}
	}
}
