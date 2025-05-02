package e02_quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestClient {

	public static void main(String[] args) {
		try(Socket server = new Socket("127.0.0.1",3333);
			Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							server.getInputStream()));
			PrintWriter pw = 
					new PrintWriter(server.getOutputStream())){
			
			ArrayList<String> list = new ArrayList<String>();
			for(int i=0;i<5;i++) {
				System.out.print("숫자 입력 : ");
				list.add(sc.nextLine());
			}
			//문자열이 저장된 리스트를 하나의 문자열로 생성
			String str = String.join(",", list);
			//서버로 전송
			pw.println(str);
			pw.flush();
			//결과 받아서 출력
			System.out.println(br.readLine());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
