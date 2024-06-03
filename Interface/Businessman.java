package in.co.Interface;

public class Businessman implements Worker,Richman {
	public static void main(String[] args) {
		Worker w=new Businessman();
		w.helptoothers();
		Richman rm=new Businessman();
		rm.donation();
		rm.party();
		rm.property();
	}

	@Override
	public void party() {
System.out.println("total party money");
	}

	@Override
	public void donation() {
System.out.println("donation money");		
	}

	@Override
	public void property() {
		System.out.println("property documents");
	}

	@Override
	public void helptoothers() {
System.out.println("helpworker");		
	}


}
