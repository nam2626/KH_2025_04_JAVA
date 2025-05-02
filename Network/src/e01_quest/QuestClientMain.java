package e01_quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class QuestClientMain {

	public static void main(String[] args) {
		try(Socket server = new Socket("127.0.0.1",2222);
			Scanner sc = new Scanner(System.in)){
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							server.getInputStream()));
			PrintWriter pw = 
					new PrintWriter(server.getOutputStream());
			
			System.out.print("숫자 하나 입력 : ");
			int n = sc.nextInt();
			
			pw.println(n);
			pw.flush();
			
			System.out.println(br.readLine());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
