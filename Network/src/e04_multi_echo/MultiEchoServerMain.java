package e04_multi_echo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServerMain {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(3333)){
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하였습니다.");
				ServerWorker sw = new ServerWorker(client);
				Thread thread = new Thread(sw);
				thread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



