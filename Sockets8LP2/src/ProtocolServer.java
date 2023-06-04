import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ProtocolServer implements Runnable {

	Socket s;

	public ProtocolServer(Socket ns) {
		s = ns;
	}

	@Override
	public void run() {

		try {
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			while (true) {
				String fromClient = in.readUTF();
				out.writeUTF(fromClient);
				if (fromClient.equals("Bye"))
					break;
			}
			in.close();
			out.close();
			s.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
