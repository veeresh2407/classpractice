package objectExamples;

public class Odemo8B {
	
	void fun1(A a1){
		System.out.println(a1);
		//System.out.println(new A());
		if(a1!=null)
		{
			a1.i=a1.i+1;
			a1.j=a1.j+2;
		}
		System.out.println("end fun1");
	}

	public static void main(String[] args) {
		
		Odemo8B d1=new Odemo8B();
		A k=new A();
		//System.out.println(k);
		d1.fun1(k);
		//System.out.println(A a1);
		System.out.println(k.i);
		System.out.println(k.j);
	}

}
