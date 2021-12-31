package Class11;

interface Data{
	public void showData();
}

interface Test{
	public void showScore();
	public double calcu();
}

class CStu implements Data , Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	
	public CStu(String a , String b , int c , int d , int e) {
		id = a;
		name = b;
		mid = c;
		finl = d;
		common = e;
	}
	
	public void showData() {
		System.out.println("�Ǹ��G" + id);
		System.out.println("�m�W�G" + name);
	}
	
	public void showScore() {
		System.out.println("�����Ҧ��Z�G" + mid);
		System.out.println("�����Ҧ��Z�G" + finl);
		System.out.println("���ɦ��Z�G" + common);
	}
	
	public double calcu() {
		return mid * 0.3 + finl * 0.3 + common * 0.4;
	}
	
	public void show() {
		showData();
		showScore();
		System.out.println("�Ǵ����Z�G" + calcu());
	}
}

public class Class11 {
	public static void main(String[] args) {
		CStu stu = new CStu("940001" , "Fiona" , 90 , 92 , 85);
		stu.show();
	}
}