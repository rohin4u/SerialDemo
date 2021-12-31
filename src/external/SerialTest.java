package external;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog d = new Dog();
		
		
		System.out.println(d.age+"..."+d.name+"  "+d.d+"..."+d.house);
		FileOutputStream fos  = new FileOutputStream("F://pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		
		
		FileInputStream fis = new FileInputStream("F://pqr.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog g = (Dog) ois.readObject();
		
		System.out.println(g.age+"..."+g.name);
		
		
		
		

	}

}
