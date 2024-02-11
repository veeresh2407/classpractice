package method$functions;

public class nonstatsTonon {

	public static void main(String[] args) {
	System.out.println("main meethod starts");
	
	nonstatsTonon n1=new nonstatsTonon();
	n1.nonst2();
	System.out.println("done here");

	}
	void nonst1(){
		System.out.println("this is non static method 1");
	
	}
	void nonst2(){
		System.out.println("this is nonstatic method 2");
		
	nonst1();
		
	}

}
