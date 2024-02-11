package method$functions;

public class statsTononStats {

	public static void main(String[] args) {
		System.out.println("main  method starts here");
		statsTononStats s1=new statsTononStats();
		s1.hello();
		System.out.println("done");

	}
	static void veer(){
		System.out.println("this is veer static method");
		
	}
	void hello(){
		System.out.println("this is hello non-static method");
		
		veer();
	}

}
