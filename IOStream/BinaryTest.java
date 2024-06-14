package in.co.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BinaryTest {
	public static void main(String[] args) throws Exception {
		String source=("C:\\Users\\visha\\OneDrive\\Desktop\\notepade\\image02.png");
		String target=("C:\\Users\\visha\\OneDrive\\Desktop\\notepade\\newimage.png");
		
		FileInputStream I=new FileInputStream(source);
		FileOutputStream O=new FileOutputStream(target);
		
		int ch=I.read();
		while(ch!=-1) {
			O.write(ch);
			ch=I.read();
		} 
		I.close();
		O.close();
		System.out.println("Done");
	}

}
