package in.co.Thread;

public class RacingCondThread extends Thread {
     public static Account data= new Account();
     String name=null;
     public RacingCondThread(String name) {
    	 this.name=name;
     }
     public void run() {
    	 for(int i=0;i<5;i++) {
    		 data.deposit1(name,1000);
    	 }
     }
}
