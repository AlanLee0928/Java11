package Class08;

abstract class B{
	public void show() {
		System.out.print("Hello ");
	}
}

interface A{
	public void show1();
}

class C extends B implements A{
	public void show1() {
		System.out.println("World");
	}
}

public class Class08 {
	public static void main(String[] args) {
		C c = new C();
		c.show();
		c.show1();
	}
}