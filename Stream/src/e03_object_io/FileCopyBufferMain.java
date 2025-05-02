package e03_object_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBufferMain {

	public static void main(String[] args) {
		try(FileInputStream fis = 
				new FileInputStream("img.png");
			FileOutputStream fos = 
				new FileOutputStream("copy.png")){
			//버퍼 메모리 추가
			byte[] buffer = new byte[1024];
			long startTime = System.currentTimeMillis();
			while(true) {
				int n = fis.read(buffer);
				if(n == -1) break;
				fos.write(buffer,0,n);
			}
			long endTime = System.currentTimeMillis();
			fos.flush();
			System.out.println("파일 복사 완료 : " + (endTime - startTime));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
