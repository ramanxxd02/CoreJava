package in.co.IOStream;
// Deserialization
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class ReadObjectTest {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\visha\\OneDrive\\Desktop\\notepade\\searial.txt");
        ObjectInputStream out=new ObjectInputStream(file);
        
        Marksheet m=(Marksheet)out.readObject();
        System.out.println(m.name);
        System.out.println(m.maths);
        System.out.println(m.physics);
        System.out.println(m.chemistry);
        file.close();
        out.close();
	}

}
