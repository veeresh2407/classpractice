package method$functions;

public class nonstatsTostats {

	public static void main(String[] args) {
		System.out.println("main methid starts");
		funB();
		System.out.println("done here");

	}
	void funA(){
		System.out.println("this is funA");
	}
	static void funB(){
		System.out.println("this is funB");
		nonstatsTostats n1=new nonstatsTostats();
		
		n1.funA();
	}
}
