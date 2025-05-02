package e01_quest;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestServerMain {

	public static void main(String[] args) {
		System.out.println("서버 프로그램을 시작합니다.....");
		try(ServerSocket server = new ServerSocket(2222)){
			try(Socket client = server.accept()){
				System.out.println(client.getInetAddress() 
						+ " 님이 접속하셨습니다.");
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter pw = new PrintWriter(client.getOutputStream());
				
				String msg = br.readLine();
				int n = Integer.parseInt(msg);
				pw.println(n*n);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}




