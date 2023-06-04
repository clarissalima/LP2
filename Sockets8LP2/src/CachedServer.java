import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CachedServer {

	public static void main(String[] args) throws IOException {
		
		Executor exec = Executors.newCachedThreadPool();
		
		ServerSocket s = new ServerSocket(2222);
		
		while(true) {
			Socket ns = s.accept();
			exec.execute(new ProtocolServer(ns));
			
			s.close();
		}
	
	

	}

}
