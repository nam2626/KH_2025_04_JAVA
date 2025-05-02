package e03_object_io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

	public static void main(String[] args) {
		try(FileInputStream fis = 
				new FileInputStream("person.dat");
			ObjectInputStream ois = 
					new ObjectInputStream(fis)){
			
			try {
				//객체를 읽어 들일때는 EOFException으로 제어
				while(true) {
					Person p = (Person) ois.readObject();
					System.out.println(p);
				}
			} catch (EOFException e) {
				System.out.println("파일 읽기 완료");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
