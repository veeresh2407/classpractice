package method$functions;

public class methodDemo1 {
	
	public static void main(String[] args){
		methodDemo1 m1=new methodDemo1();
		
		System.out.println("hello  here main method starts");
		
		funC();
		
	m1.funA();
	m1.funB();
		
	}
	

	void funA(){
		
		System.out.println("this is funA method");
	}
	void funB(){
		
		System.out.println("this is funB method");
	}
	static void funC(){
		System.out.println("this is func method");
	}
} 
