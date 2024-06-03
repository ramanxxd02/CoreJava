package in.co.testdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatedate {
	public static void main(String[] args) throws ParseException  {
		Date d=new Date();
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		String str=format.format(d);
		System.out.println("Date :"+str);
		String str1="30/05/2024";
		Date d1=format.parse(str1);
		System.out.println(d1);
				}

}
