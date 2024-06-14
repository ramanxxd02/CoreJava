package in.co.IOStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
	public static void main(String[] args) throws Exception {
		InputStreamReader isreader=new InputStreamReader(System.in);
		BufferedReader bf= new BufferedReader(isreader);
		PrintWriter pw =new PrintWriter(new FileWriter("C:/Users/visha/OneDrive/Desktop/notepade//Dange.txt"));
	    
		String line=bf.readLine();
		while(!line.equals("quit")) {
			pw.println(line);
			line=bf.readLine();
		}
		bf.close();
		pw.close();
	}

}
