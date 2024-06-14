package in.co.Thread;

public class TestRacingcondThread {
public static void main(String[] args) {
	RacingCondThread r=new RacingCondThread("Raman");
	RacingCondThread r1=new RacingCondThread("Dange");
	r.start();
	r1.start();
}
}
