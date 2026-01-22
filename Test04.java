package corejavaprograms;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=3,c;
		System.out.println("Value before swap a= " +a+ "\tb= "+b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("Value after swap a = "+a+ "/tb= " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value after swa a = "+a+ "\tb = "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Value after swa a = "+a+ "\tb = "+b);

		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Value after swa a = "+a+ "\tb = "+b);

		b=a+b-(a=b);
		System.out.println("Value after swa a = "+a+ "\tb = "+b);

		
		System.out.println("Addition= "+(a+b));
		System.out.println("Subtraction= "+(a-b));
		System.out.println("Multipication= "+(a*b));
		System.out.println("Division= "+(a/b));
		System.out.println("Modulus= "+(a%b));

	}

}
