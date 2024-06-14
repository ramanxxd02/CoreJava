package in.co.IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadtextFile {
	public static void main(String[] args) throws Exception {
		FileReader f=new FileReader("C:\\Users\\visha\\OneDrive\\Desktop\\notepade\\RAMANDANGE.txt");
		int ch=f.read(); //read a character
		while(ch!=-1) { //-1 is end of file
			System.out.println((char)ch);
			ch=f.read();
		}
     	f.close();
	
		
		// BUFFEREDREADER
		
//		FileReader f=new FileReader("C:\\Users\\visha\\OneDrive\\Desktop\\notepade\\RAMANDANGE.txt");
//	BufferedReader bf=new BufferedReader(f);
//		String line=bf.readLine();
//		while(line!=null) {
//			System.out.println(line);
//		line=bf.readLine();
//		}
//	f.close();
//		
		
		//SCANNER
		
		
//		FileReader f=new FileReader("C:\\Users\\visha\\OneDrive\\Desktop\\notepade\\RAMANDANGE.txt");
//		Scanner sc=new Scanner(f);
//		while(sc.hasNext()) {
//			System.out.println(sc.hasNext());
//		}
//		f.close();
		}

}
