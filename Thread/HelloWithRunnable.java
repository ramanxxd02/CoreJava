package in.co.Thread;
//priority set 
public class HelloWithRunnable implements Runnable{
String name=null;
public HelloWithRunnable(String name) {
	this.name=name;
}
@Override
public void run() {
	for(int i=0;i<10;i++) {
		System.out.println(i+name);
	}
	}
public static void main(String[] args) {
	Thread t=new Thread(new HelloWithRunnable("Raman"));
	Thread t1=new Thread(new HelloWithRunnable("Dange"));
	t.setPriority(10);
	t.start();
	t1.start();
	for(int i=0;i<=5;i++) {
		System.out.println(i+"captain");
	}
}


}
