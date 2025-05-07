package e04_multi_echo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiEchoServerMain {
	private static Vector<ServerWorker> list = new Vector<ServerWorker>();
	
	public static void removeServerWorker(ServerWorker sw) {
		list.remove(sw);
		System.out.println("현재 인원 : "+list.size());
	}
	
	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(3333)){
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하였습니다.");
				ServerWorker sw = new ServerWorker(client);
				list.add(sw);
				System.out.println("현재 접속중인 인원 수 : " + list.size());
				Thread thread = new Thread(sw);
				thread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



