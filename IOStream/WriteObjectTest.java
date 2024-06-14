package in.co.IOStream;
//Serialization
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectTest {
	public static void main(String[] args) throws Exception {
		FileOutputStream file=new FileOutputStream("C:\\Users\\visha\\OneDrive\\Desktop\\notepade\\searial.txt");
		ObjectOutputStream out= new ObjectOutputStream(file);
		
		Marksheet m=new Marksheet();
		m.name="Raman";
		m.maths=33;
		m.physics=43;
		m.chemistry=23;
		out.writeObject(m);
		file.close();
		out.close();
	}

}
