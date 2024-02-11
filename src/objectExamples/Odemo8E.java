package objectExamples;

public class Odemo8E {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1);
		System.out.println(a1.i);
		a1.funA();
		System.out.println(new A());
		System.out.println(new A().i);
		new A().funA();
	}

}
