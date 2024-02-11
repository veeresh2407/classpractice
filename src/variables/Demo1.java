package variables;

public class Demo1 {
	
	 
	
	public static void main(String[] args){
		Demo1 d1=new Demo1();
		d1.funA(200, 250);
	}
	void funA(int a, int b){
		
		if(a>b){
			System.out.println(a>b);
		}		
		else if(a<b){
			System.out.println(a<b);
		}
		else if(a<=b){
			System.out.println(a<=b);
		}
		else if(a>=b){
			System.out.println(a>=b);
		}
		else if(a==b){
			System.out.println(a==b);
		}
		else if(a!=b){
			System.out.println(a!=b);
		}
		else if(true){
			System.out.println(true);
		}
		else{
			System.out.println("block");
		}
	}
	
}