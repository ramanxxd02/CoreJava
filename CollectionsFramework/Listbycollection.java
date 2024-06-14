package in.co.CollectionsFramework;

import java.util.ArrayList;

public class Listbycollection {
	public static void main(String[] args) {
		ArrayList names=new ArrayList();
		for(int i=0;i<10;i++) {
			names.add("no #"+i);
		}
		System.out.println("Names="+names.size());
		Object o=names.get(0);
		String name=(String)o;
		//String name=(String)names.get(0);
		System.out.println("First name is "+name);
	}

}
