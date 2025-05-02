package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		//1. 서버 접속
		try(Socket server = new Socket("127.0.0.1", 1234)){
			//2. 스트림 생성 및 초기화
			PrintWriter pw = 
					new PrintWriter(server.getOutputStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							server.getInputStream()));
			//3. 입출력 처리
			//	 서버와 입출력 동작을 반대로 해야함
			//	 서버로 데이터 전송
			pw.println("Hello World");
			pw.flush();
			//	 서버가 보내준 데이터를 받아서 출력
			System.out.println(br.readLine());
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}




