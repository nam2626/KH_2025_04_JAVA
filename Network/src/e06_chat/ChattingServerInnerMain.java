package e06_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChattingServerInnerMain {
	private static Vector<ServerWorker> list = new Vector<ServerWorker>();

	//모든 클라이언트에게 메세지 전송하는 메서드
	private static void broadCast(String msg) {
		for (ServerWorker worker : list) {
			worker.sendMessage(msg);
		}		
	}
	
	//접속 종료한 클라이언트에 해당하는 스레드 제거하는 메서드
	private static void removeServerWorker(ServerWorker sw) {
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
	
	private static class ServerWorker implements Runnable{
		private Socket client;
		private PrintWriter pw;

		public ServerWorker(Socket client) {
			this.client = client;
			try {
				pw = new PrintWriter(client.getOutputStream(),true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try(BufferedReader br = 
					new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));){
				
				while(true) {
					String str = br.readLine();
					if(str == null || str.equals("exit"))
						break;
					broadCast(client.getInetAddress()
							+ "님의 메세지 : " + str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				//ServerMain에 있는 리스트에 본인 객체를 제거하고
				broadCast(client.getInetAddress() 
						+ "님이 접속 종료를 하셨습니다.");
				removeServerWorker(this);
			}
		}

		//클라이언트에게 메세지 보내는 메서드
		public void sendMessage(String msg) {
			pw.println(msg);
			pw.flush();
		}

	}

}



