package in.co.Thread;

public class Account {
	private int balance=0;

	public int getBalance() {
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
		}
		return balance;
	}

	public void setBalance(int balance) {
        try {
        	Thread.sleep(200);
        }catch(InterruptedException e) {
        	
        }
		this.balance = balance;

	}
//Method
//	public  synchronized void deposit(String msg, int amt) {
//		int bal=getBalance();
//		bal=bal+amt;
//		setBalance(bal);
//		System.out.println(msg+"    New Balance"+bal);
//	}
	//Block
	public  void deposit1(String msg, int amt) {
//		synchronized(this) {
		int bal=getBalance();
	     bal=bal+amt;
	setBalance(bal);
//}
	System.out.println(msg+"New Balance"+bal);
}
	

}
