package e06_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable{
	private Socket client;
	private PrintWriter pw;

	public ServerWorker(Socket client) {
		this.client = client;
		try {
			pw = new PrintWriter(client.getOutputStream());
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
				ChattingServerMain.broadCast(
						client.getInetAddress() 
						+ "님의 메세지 : " + str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//ServerMain에 있는 리스트에 본인 객체를 제거하고
			ChattingServerMain.broadCast(client.getInetAddress() 
					+ "님이 접속 종료를 하셨습니다.");
			ChattingServerMain.removeServerWorker(this);
		}
	}

	//클라이언트에게 메세지 보내는 메서드
	public void sendMessage(String msg) {
		pw.println(msg);
		pw.flush();
	}

}






