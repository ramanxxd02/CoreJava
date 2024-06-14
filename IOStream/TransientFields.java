package in.co.IOStream;

import java.io.Serializable;

public class TransientFields implements Serializable {
	String name=null;
	int maths=0;
	int physics=0;
	int chemistry=0;
	transient int total=0;
	transient double percentage =0;
	transient int temp=0;
	
	public int getTotal() {
		total=maths+physics+chemistry;
		return total;		
	}
	public double getpercentage() {
		percentage=total/3;
		return percentage;
	}

}
