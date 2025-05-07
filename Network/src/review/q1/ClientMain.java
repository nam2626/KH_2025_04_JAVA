package review.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		//서버 접속
		try(Socket server = new Socket("127.0.0.1", 1234);
			//스트림 초기화
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()));
			//사용자로부터 입력 받는 스트림
			Scanner sc = new Scanner(System.in);
		){
			//숫자 입력
			System.out.print("정수 입력 : ");
			int n = sc.nextInt();
			//서버로 숫자 전송
			pw.println(n);
			//서버가 보낸 메세지를 받아서 출력
			System.out.println("결과 : " + br.readLine());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
