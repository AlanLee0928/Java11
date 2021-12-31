package Class14;

interface iVolume{
	public void showData();
	public double vol();
}

abstract class CSphere implements iVolume{
	final double PI = 3.14;
	protected int x;
	protected int y;
}

class CCircle extends CSphere{
	double r;
	double math = 4.0 / 3.0;
	public CCircle(int a , int b , int c){
		x = a;
		y = b;
		r = c;
	}
	public void showData() {
		System.out.println("球心：(" + x + " , " + y + ")");
		System.out.println("半徑：" + (int)r);
		System.out.println("球體積：" + vol());
	}
	public double vol() {
		return math * PI * r * r * r;
	}
}

public class Class14 {
	public static void main(String[] args) {
		CCircle cir = new CCircle(8 , 6 , 2);
		cir.showData();
	}
}
//因為主要的詳細定義還是在CCircle裡面完成，雖然CSphere有繼承到iVolume的內容，但我們並沒有在iVolume裡使用。