package in.co.superDCon;

public class Ractangle extends Shape{
    private int length;
    private int width;
    public Ractangle( String colour,int borderwidth,int length,int width) {
    	super(colour,borderwidth);
    	this.length=length;
    	this.width=width;
    }
    public int getlength(int length) {
    	return length;
    }
    public int getwidth(int width) {
    	return width;
    }
    public double area() {
    	return length*width;
    }
}
