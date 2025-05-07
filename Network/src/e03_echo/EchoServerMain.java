package e03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

	public static void main(String[] args) {
		System.out.println("에코서버를 오픈합니다.......");
		try(ServerSocket server = new ServerSocket(2222);
			Socket client = server.accept();
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							client.getInputStream()));){
			System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
			while(true) {
				String str = br.readLine();
				if(str == null || str.equals("exit"))
					break;
				pw.println(str);
				pw.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
