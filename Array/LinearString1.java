
package in.co.Array;

public class LinearString1 {
public static int search(String name[],String colour) {
	for(int i=0;i<name.length;i++) {
		if(name[i]==colour) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	String name[]= {"blue","red","green","black","white"};
	String colour="black";
	int index=search(name,colour);
	if(index==-1) {
		System.out.println("colour is not found="+colour);
	}else {
		System.out.println("colour is at index="+index);//index ki jgh colour likh skte h 
	}
}
}
