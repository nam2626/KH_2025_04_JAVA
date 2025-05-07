package e03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1", 2222);
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			Scanner sc = new Scanner(System.in);) {
			
			while(true) {
				System.out.println("메세지 입력 > ");
				String str = sc.nextLine();
				
				pw.println(str);
				pw.flush();
				
				if(str.equals("exit")) break;
				
				System.out.println(br.readLine());				
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
