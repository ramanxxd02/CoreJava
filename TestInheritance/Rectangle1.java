package in.co.TestInheritance;

public class Rectangle1 extends Shape1{
		private int length;
	private int width;
	public int getlength() {
     return length;
}
	public int getwidth() {
		return width;
	}
	public void setlength(int length) {
		this.length=length;
	}
	public void setwidth(int width) {
		this.width=width;
	}
	@Override
	public double area() {
		return length*width;
	}

}
