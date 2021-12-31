package serialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws IOException {
		
		Dog d = new Dog();
		
		FileOutputStream  fos = new FileOutputStream("F://pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("file is serialized");

	}

}
