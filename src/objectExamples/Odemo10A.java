package objectExamples;

public class Odemo10A {
		void funA(){
			System.out.println("this is funA");
		}
		int funB(){
			System.out.println("this is fun B");
			return 123;
		}
		boolean funC(){
			System.out.println("func is boolean");
			return true;
		}
		 veeresh funD(){
			System.out.println("this is ramesh");
			veeresh r1=new veeresh();
			return r1;
		}
		variableDemo2 funE(){
			System.out.println("this is variableDmeo1");
			return funE();
		}
	public static void main(String[] args) {
		Odemo10A od=new Odemo10A();
		

	}

}
