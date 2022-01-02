package Class04;

abstract class Math{
	protected int ans;
	static void show() {
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

public class Class04 {
	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3 , 5);
		cmp.show();
	}
}
//static只能存取關於static的值，這裡僅void show()有改變，所以會造成錯誤，應該連ans一起加static就可以了。