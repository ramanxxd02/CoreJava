package in.co.Thread;
// Single Thread
public class WithoutThread {
String name=null;
public WithoutThread(String name) {
	this.name=name;
	
}
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(name);
	}
}
public static void main(String[] args) {
	WithoutThread w=new WithoutThread("Raman");
	WithoutThread w1=new WithoutThread("Dange");
	w.run();
	w1.run();
}
}
