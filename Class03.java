package Class03;

abstract class Math{
	protected int ans;
	public void show() {
		System.out.println("ans = " + ans);
	}
	public abstract void add(int a , int b);
	public abstract void sub(int a , int b);
	public abstract void mul(int a , int b);
	public abstract void div(int a , int b);
}

class Compute extends Math{
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

public class Class03 {
	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3 , 5);
		cmp.show();
		Math mth = new Math();
	}
}
//Math是抽象類別，在此類別裡面的方法還沒有去定義，所以會造成程式在執行的時候不知道要做甚麼，變成bug的部分。