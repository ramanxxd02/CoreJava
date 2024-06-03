package in.co.Array;

public class LinearString {
public static int search(String name[],String colour) {
	for(int i=0;i<name.length;i++) {
		if(name[i]==colour) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	String name1[] = {"blue","red","green","white","black"};
	String colour1="black";
	int index=search(name1,colour1);
	if(index==-1) {
		System.out.println("colour not found"+colour1);
	}
	else {
		System.out.println("colour is at index"+index);
	}
}
}







