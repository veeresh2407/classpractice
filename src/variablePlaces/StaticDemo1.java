package variablePlaces;

public class StaticDemo1 {
	int a=10;
	static StaticDemo1 sd=new  StaticDemo1();
	public static void main(String[] args) {
		System.out.println("main method starts");
		StaticDemo1 sd=new  StaticDemo1();
		int a=10;
		System.out.println(sd.a);
		System.out.println("ends");

	}

}
