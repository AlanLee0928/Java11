package Class06;

interface Math{
	public void show() {
		System.out.print("ans = " + ans);
	}
	public void add(int a , int b);
	public void sub(int a , int b);
	public void mul(int a , int b);
	public void div(int a , int b);
}

class Compute implements Math{
	int ans;
	public void add(int a , int b) {
		ans = a + b;
	}
	public void sub(int a , int b) {
		ans = a - b;
	}
	public void mul(int a , int b) {
		ans = a * b;
	}
	public void div(int a , int b) {
		ans = a / b;
	}
}

public class Class06 {
	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3 , 5);
		cmp.show();
	}
}
//首先把show()放在Math會有兩個問題，第一個是ans會找不到因為那個部分是在Compute裡面，
//再來是直接把詳細定義寫在Math會有問題，因為介面裡面只是單純做一個雛形，詳細定義還是會寫在繼承的類別中。