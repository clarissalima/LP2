import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServidorUDP {

	public static void main(String[] args) throws IOException {
		
		//5000: porta que vvai ser registrada perante o sistema operacional
		DatagramSocket tomadaServidora = new DatagramSocket(5000);
		System.out.println("Servidor em execução!");
		
		
		//RECEBER MENSAGEM DO CLIENTE E IMPRIMIR NA TELA
		//o tamnho que enviou la no cliente, tem que ser o tamanho a receber
		byte[] cartaAReceber = new byte[100];
		DatagramPacket envelopeAReceber = new DatagramPacket(cartaAReceber, cartaAReceber.length);
		
		tomadaServidora.receive(envelopeAReceber);
		String textoRecebido = new String(envelopeAReceber.getData());
		System.out.println(textoRecebido);
		
		//ENVIAR MENSAGEM DE VOLTA AO CLIENTE
		//estamos enviando a mesma mensagem recebida!!!
		byte[] cartaAEnviar = new byte[100];
		String mensagem = "Dados recebidos com sucesso!";
		cartaAEnviar = mensagem.getBytes();
		
		//dados do remetente (ip e porta) obtidos a partir do envelope recebido anteriormente
		//getaddress obtem o endereco de ip
		InetAddress ipCliente = envelopeAReceber.getAddress();
		//getport obtem a porta do servidor
		int portaCliente = envelopeAReceber.getPort();
		//estamos transmitindo, entao precisamos dos 4 parametros!
		DatagramPacket envelopeAEnviar = new DatagramPacket(cartaAEnviar, cartaAEnviar.length, ipCliente, portaCliente);
		//send envia o envelope pra rede
		tomadaServidora.send(envelopeAEnviar);
		
		tomadaServidora.close();
		
	}

}
