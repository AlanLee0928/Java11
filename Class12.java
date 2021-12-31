package Class12;

interface Data{
	public void best();
	public void failed();
}

interface Test extends Data{
	public void showData();
	public double average();
}

class CStu implements Test{
	protected String name;
	protected int math;
	protected int english;
	
	public CStu(String a , int b , int c){
		name = a;
		math = b;
		english = c;
	}
	
	public void best() {
		if(math > english) {
			System.out.println(name + "���ƾǤ�^��n");
		}
		else {
			System.out.println(name + "���^���ƾǦn");
		}
	}
	
	public void failed() {
		if(math < 60) {
			System.out.println(name + "���ƾǷ��F");
		}
		if(english < 60) {
			System.out.println(name + "���^����F");
		}
	}
	
	public void showData() {
		System.out.println("�m�W���G" + name);
		System.out.println("�ƾǦ��Z�G" + math);
		System.out.println("�^�妨�Z�G" + english);
	}
	
	public double average() {
		return ((double)math + (double)english) / 2;
	}
	
	public void show() {
		showData();
		System.out.println("�������Z�G" + average());
		best();
		failed();
	}
}

public class Class12 {
	public static void main(String[] args) {
		CStu stu = new CStu("Judy" , 58 , 91);
		stu.show();
	}
}