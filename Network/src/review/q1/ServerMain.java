package review.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
			//서버 열기 - 포트번호 1234
		try(ServerSocket server = new ServerSocket(1234);
			//클라이언트 접속
			Socket client = server.accept();
			//입출력 스트림 초기화
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
		){
			//클라이언트로부터 숫자 받음
			String str = br.readLine();
			int n = Integer.parseInt(str);
			//홀짝 판단
			str = n % 2 == 0 ? "짝수입니다." : "홀수입니다.";
			//결과를 클라이언트로 전송
			pw.println(str);
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}






