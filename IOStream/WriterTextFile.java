package in.co.IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterTextFile {
	public static void main(String[] args) throws Exception {
//	FileWriter f=new FileWriter("C:\\\\Users\\\\visha\\\\OneDrive\\\\Desktop\\\\notepade\\\\RAMAN");
//	f.write("Hello");
//	f.write("\n");
//	f.write("Himanshi");
//	f.write("\n");
//	f.write("and");
//	f.write("\n");
//	f.write("Megha");
//	f.close();
//	System.out.println("Done");
		
		//PRINTWRITER
	
		FileWriter f=new FileWriter("C:\\\\Users\\\\visha\\\\OneDrive\\\\Desktop\\\\notepade\\\\RAMAN");
		PrintWriter p=new PrintWriter(f);
		for(int i=0;i<5;i++) {
			p.println("Himanshi pagla gyi hai guy's");
		}
		f.close();
		p.close();
		System.out.println("done");
	}
}
