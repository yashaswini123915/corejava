package corejavaprograms;
import java.lang.*;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    // a number having both first and last number same is called cyclo number.
		int n=153,i=1,l=0,f=0;
		l=n%10;
		while(i<=n){
			f=n%10;
			n=n/10;
			
		}
		if(l==f) {
			System.out.println("cyclo number");
		}
		else {
			System.out.println("not cyclo number");
		}

	}

}
