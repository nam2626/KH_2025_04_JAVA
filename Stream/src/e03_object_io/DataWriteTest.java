package e03_object_io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriteTest {

	public static void main(String[] args) {
		int n = 100;
		double pi = 3.1415;
		char ch = 'A';
		boolean flag = true;
		
		try(FileOutputStream fos = 
				new FileOutputStream("data.dat");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeInt(n);
			dos.writeDouble(pi);
			dos.writeChar(ch);
			dos.writeBoolean(flag);
			
			System.out.println("파일 출력 종료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}




