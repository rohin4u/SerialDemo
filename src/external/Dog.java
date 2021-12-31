package external;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;


public class Dog implements Externalizable {
	

	int d = 15;
	String name = "Labra";
	int age = 15;
	String house = "downtown";
	
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeObject(name);
		out.writeInt(age);
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		age = in.readInt();
		
	}

}
