package objectExamples;

public class objectDemo4 {
	int a=10;
	boolean b=true;
	static int y=20;
	public static void main(String[] args){
		System.out.println(y);
		objectDemo4 ob=new objectDemo4();
		System.out.println(ob);
		System.out.println(ob.a);
		objectDemo4 ob1=new objectDemo4();
		System.out.println(ob1);
		System.out.println(ob1.b);
		
	}
}
