package e02_quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class QuestServerMain {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(3333);
			Socket client = server.accept();
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(
							client.getInputStream()));
			PrintWriter pw = 
					new PrintWriter(client.getOutputStream())){
			
			String str = br.readLine();
			String[] arr = str.split(",");
			ArrayList<String> list = new ArrayList<String>(); 
			for(String n : arr) {
				//홀수 일때만 list에 해당 숫자 저장
				if(Integer.parseInt(n) % 2 == 1)
					list.add(n);
			}
			//결과 문자열로 출력
			pw.println("홀수 목록 : " + list);
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
