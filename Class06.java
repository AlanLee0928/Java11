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
//������show()��bMath�|����Ӱ��D�A�Ĥ@�ӬOans�|�䤣��]�����ӳ����O�bCompute�̭��A
//�A�ӬO������Բөw�q�g�bMath�|�����D�A�]�������̭��u�O��°��@�����ΡA�Բөw�q�٬O�|�g�b�~�Ӫ����O���C