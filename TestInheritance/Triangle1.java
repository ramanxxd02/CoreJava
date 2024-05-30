package in.co.TestInheritance;

public class Triangle1 extends Shape1 {
private int base;
private int height;
public int getbase() {
	return base;
}
public int getheight() {
	return height;
}
public void setbase(int base) {
	this.base=base;
}
public void setheight(int height) {
	this.height=height;
}
@Override
public double area() {
	
	return base*height;
}

}
