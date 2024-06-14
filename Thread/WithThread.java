package in.co.Thread;
//Multi Thread
public class WithThread extends Thread{
String name;
public WithThread(String name) {
	this.name=name;
}
public void run(){
	for(int i=0;i<=20;i++) {
		System.out.println(i+name);
	}
}
public static void main(String[] args) {
	WithThread w=new WithThread("Raman");
	WithThread w1=new WithThread("Dange");
	w.start();;
	w1.start();;
	for(int i=0;i<20;i++) {
		System.out.println("Captain");
	}
}
}
