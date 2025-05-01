package e02_text_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderMain1 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//1. 노드 스트림(물리적인 연결) 연결(빨대 꼽기)
			fr = new FileReader("c:\\test\\test.txt");
			//2. 프로세스 스트림 연결(부가기능)
			br = new BufferedReader(fr);
			
			//3. 데이터를 읽어옴
//			while(true) {
//				String str = br.readLine();
//				if(str == null) break;
//				System.out.println(str);
//			}
			String str = null;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4. close
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
