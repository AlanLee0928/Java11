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
		System.out.println("�y�ߡG(" + x + " , " + y + ")");
		System.out.println("�b�|�G" + (int)r);
		System.out.println("�y��n�G" + vol());
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
//�]���D�n���Բөw�q�٬O�bCCircle�̭������A���MCSphere���~�Ө�iVolume�����e�A���ڭ̨èS���biVolume�̨ϥΡC