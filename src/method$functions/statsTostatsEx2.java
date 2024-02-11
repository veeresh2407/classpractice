package method$functions;

public class statsTostatsEx2 {

	public static void main(String[] args) {
		System.out.println("main methd starts");
		funC();
		System.out.println("done");
	}
 	static void funA(){
 		System.out.println("this is function A");
 		funC();
 		
 	}
 	static void funB(){
 		System.out.println("this is function B");
 		funA();
 	}
 	static void funC(){
 		System.out.println("this is function c");
 		funB();
 	}
 	static void funD(){
 		System.out.println("this is function D");
 		funC();
 	}
}
