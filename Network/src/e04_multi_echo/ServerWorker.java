package e04_multi_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable{
	private Socket client;

	public ServerWorker(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try(PrintWriter pw =
				new PrintWriter(client.getOutputStream());
			BufferedReader br = 
				new BufferedReader(
					new InputStreamReader(
							client.getInputStream()));){
			
			while(true) {
				String str = br.readLine();
				if(str == null || str.equals("exit"))
					break;
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//ServerMain에 있는 리스트에 본인 객체를 제거하고
			System.out.println(client.getInetAddress() 
					+ "님이 접속 종료를 하셨습니다.");
			MultiEchoServerMain.removeServerWorker(this);
		}
	}

}






