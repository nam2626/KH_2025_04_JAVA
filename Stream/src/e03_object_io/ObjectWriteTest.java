package e03_object_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectWriteTest {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Kim", 20));
		list.add(new Person("Lee", 12));
		list.add(new Person("Park", 22));
		list.add(new Person("June", 45));
		list.add(new Person("James", 32));
		
		try(FileOutputStream fos = 
				new FileOutputStream("person.dat");
			ObjectOutputStream oos = 
					new ObjectOutputStream(fos)){
			
			for(int i=0;i<list.size();i++) {
				oos.writeObject(list.get(i));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}




