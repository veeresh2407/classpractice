package method$functions;

public class StatsTostats {

	public static void main(String[] args) {
		hello();
		System.out.println("done here");
	}
	static void hello(){
		System.out.println("this is hello");
		veer();
	}
	static void veer(){
		System.out.println("this is veer");
		hello();
	}
}
