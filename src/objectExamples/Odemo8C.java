package objectExamples;

public class Odemo8C {
	void fun1(A a1){
		System.out.println( a1);
		if(a1!=null){
			a1.i=a1.i+1;
			a1.j=a1.j+2;
		}
	}
	public static void main(String[] args) {
		
		Odemo8C d1=new Odemo8C();
		int a=10;

		
		d1.fun1(a1);
		System.out.println(a1.i);
		System.out.println(a1.j);
	}

}
