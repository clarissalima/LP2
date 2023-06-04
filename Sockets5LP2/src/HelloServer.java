import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket s = new ServerSocket (4444);
		Socket ns = s.accept();
		
		DataInputStream in = new DataInputStream(ns.getInputStream());
		DataOutputStream out = new DataOutputStream(ns.getOutputStream());
		
		System.out.println(in.readUTF());
		
		out.writeUTF("Hello Client");
		
		s.close();
		ns.close();
		in.close();
		out.close();
		

	}

}
