package e05_1_vs_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {
	public static class Worker extends Thread{
		private Socket client;

		public Worker(Socket client) {
			this.client = client;
		}
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))){
				while(true) {
					System.out.println(br.readLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		
	}
	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(4444);
			Socket client = server.accept();
			Scanner sc = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(
					client.getOutputStream())){
			
			while(true) {
				System.out.println("메세지 입력 : ");
				String msg = sc.nextLine();
				if(msg.equals("exit")) break;
				pw.print(msg);
				pw.flush();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


