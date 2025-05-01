package e02_text_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextWriterMain {

	public static void main(String[] args) {
		/*
		 * 	파일 쓰기의 경우 추가모드로 파일 연결하지 않는 이상
		 * 	매번 새로운 파일이 생성이됨
		 */
		//1. 노드 스트림, 프로세스 스트림 생성 및 초기화
		try(FileWriter fw = 
				new FileWriter("c:\\test\\write.txt",true);//true 추가모드, false 새파일
			PrintWriter pw = new PrintWriter(fw);	){
			
			//2. 텍스트 출력
			pw.println("안녕하세요");
			pw.println(1231245);
			pw.println("Hello World");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 쓰기 종료");
	}

}



