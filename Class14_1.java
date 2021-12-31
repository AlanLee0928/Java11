package Class14_1;

interface iVolume{
	public void showData();
	public double vol();
}

abstract class CSphere implements iVolume{
	final double PI = 3.14;
	protected int x;
	protected int y;
	protected double r;
	public double math = 4.0 / 3.0;
	
	public void showData() {
		System.out.println("球心：(" + x + " , " + y + ")");
		System.out.println("半徑：" + (int)r);
		System.out.println("球體積：" + vol());
	}
	public double vol() {
		return math * PI * r * r * r;
	}
}

class CCircle extends CSphere{
	public CCircle(int a , int b , int c){
		x = a;
		y = b;
		r = c;
	}
	public void show() {
		showData();
	}
}

public class Class14_1 {
	public static void main(String[] args) {
		CCircle cir = new CCircle(8 , 6 , 2);
		cir.show();
	}
}