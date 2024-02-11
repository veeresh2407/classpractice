package classpractice;

public class example1 {
//	System.out.println("done"); compiler error getting here because this statement is not part 
//	of the class member
	
	
	public static void main(String[] args){
	funA();
	funB();
	funC(1000,2000);
	funD(111,222);
	example1 ex=new example1();
	ex.funE();
	ex.funF();
	ex.funG(250, 350);
	ex.funH(2500, 3500);
	}
	
	static void funA(){     //static zeroparameter non return datatype  method
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	static int funB(){        //static zeroparameter, return datatype method
		int c=100;
		int d=200;
		int e=c+d;
		System.out.println(e);
		return e;
	}
	static void funC(int a, int b){        //static parameterization, non-return datatype method
		int c=a+b;
		System.out.println(c);
	}
	static int funD(int a, int b){          //static, parameterization, return datatype method
		int c=a+b;
		System.out.println(c);
		return c;
	}
	void funE(){                           //non static ,zero parametarization, non return datatype method
		int a=100;
		int b=200;
		int g=a+b;
		System.out.println(g);
	}
	int funF(){                            //non static ,zero parametarization, return datatype method
		int e=100;
		int f=800;
		int h=e+f;
		System.out.println(h);
		return h;
	}
	void funG(int a, int b){              //non static , parametarization, non return datatype method
		int n=a+b;
		System.out.println(n);
	}
	int funH(int s,int t){                //non static , parametarization, return datatype method
		int v=s+t;
		System.out.println(v);
		return v;
	}
}
