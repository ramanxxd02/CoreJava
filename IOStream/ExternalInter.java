package in.co.IOStream;

import java.beans.Transient;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalInter  implements Externalizable{
	public static void main(String[] args) {
		String name=null;
		int maths=0;
		int physics=0;
		int chemistry=0;
		 transient int temp=0;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject("raman");
		out.writeObject(55);
		out.writeObject(66);
		out.writeObject(62);
		//Serialize transient variable
		out.writeObject(temp);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String name = (String)in.readObject();
		Object  physics = in.readObject();
		Object maths = in.readObject();
		Object chemistry = in.readObject();
		//Deserialize transient variable
		int temp = in.readInt();
	}

}
