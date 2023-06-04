import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClienteUDP {

	public static void main(String[] args) throws Exception{
		
		DatagramSocket tomada = new DatagramSocket();
		
		//obter texto via teclado
		
		System.out.println("Digite uma mensagem:");
		Scanner teclado = new Scanner(System.in);
		String mensagem = teclado.nextLine(); 
		
		//ENVIAR MENSAGEM PARA O SERVIDOR
		
		//String mensagemm = "Testando..."
		byte[] cartaAEnviar = new byte[100];
		//converte a string mensagem em um array de bytes
		cartaAEnviar = mensagem.getBytes();
		//converte a porta recebida em string para o tipo inetadress
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		//nome do array de bytes, tamanho, inetadress, porta
		DatagramPacket envelopeAEnviar = new DatagramPacket(cartaAEnviar, 
				cartaAEnviar.length, ip, 5000);
		tomada.send(envelopeAEnviar);
		
		
		//RECEBER UMA MENSAGEM RESPOSTA DO SERVIDOR
		byte[] cartaAReceber = new byte[100];
		//o ip e a porta ja estao implicitas quando vai receber a mensagem
		DatagramPacket envelopeAReceber = new DatagramPacket(cartaAReceber, 
				cartaAReceber.length);
		//a carta vai ser preenchida com os metodos recebidos
		tomada.receive(envelopeAReceber);
		//como recebe um array de bytes, tem que converter novamente em string
		//getdata = pega o conteudo
		String mensagemRecebida = new String(envelopeAReceber.getData());
		System.out.println("CHEGOU NO SERVIDOR\n" + mensagemRecebida);
		
		//finaliza conxao se nao tiver mais nada
		tomada.close();

	}

}
