package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog d = new Dog();
		
		d.a = 999;
		d.d =222;
		
		System.out.println(d.d+"..."+d.a);
		FileOutputStream fos  = new FileOutputStream("F://pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		
		
		FileInputStream fis = new FileInputStream("F://pqr.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog g = (Dog) ois.readObject();
		
		System.out.println(g.d+"..."+g.a);
		
		
		
		

	}

}
