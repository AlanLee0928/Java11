package Class07;

interface Math{
	abstract public void show();
	abstract public void add(int a , int b);
	abstract public void sub(int a , int b);
	abstract public void mul(int a , int b);
	abstract public void div(int a , int b);
}

class Compute implements Math{
	int ans;
	public void show() {
		System.out.print("ans = " + ans);
	}
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

public class Class07 {
	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3 , 5);
		cmp.show();
	}
}
//可以? 我猜他以另外一個角度來看她其實也算是抽象類別的概念，因為介面的做法其實一樣，就是先訂一個雛形然後之後再藉由繼承去定義他的詳細方法。