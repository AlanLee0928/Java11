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
//�i�H? �ڲq�L�H�t�~�@�Ө��רӬݦo���]��O��H���O�������A�]�����������k���@�ˡA�N�O���q�@�����εM�ᤧ��A�ǥ��~�ӥh�w�q�L���ԲӤ�k�C