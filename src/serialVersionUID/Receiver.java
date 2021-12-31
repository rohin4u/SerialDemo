package serialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream fis = new FileInputStream("F://pqr.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d = (Dog) ois.readObject();
		
		System.out.println(d.age+"...."+d.name);
		

	}

}
