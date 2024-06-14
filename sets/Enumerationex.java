package in.co.sets;

import java.util.Enumeration;
import java.util.Vector;
// only historical value ke liye use hota hai
// ye Iterator ki tarah hi hota hai bs iska use historical ke liye hota h
public class Enumerationex {
public static void main(String[] args) {
	Vector v=new Vector();
	v.addElement("Raman");
	v.addElement(10);
	v.addElement(10.10);
	
	Enumeration en = v.elements();
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	
}
}
