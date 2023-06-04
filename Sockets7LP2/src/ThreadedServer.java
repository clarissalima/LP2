import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedServer {

	public static void main(String[] args) throws IOException {
		
		try (ServerSocket s = new ServerSocket(1234)) {
			int port = 1234;
			while(true) {
				Socket ns = s.accept();
				new Thread(new ProtocolServer(ns).start());
				s.close();
				
			}
			
		}
		
	}

}
