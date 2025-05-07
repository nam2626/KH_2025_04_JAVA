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
		}
	}

}






