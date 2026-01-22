package corejavaprograms;
import java.lang.*;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=152,i=1,r,s=0,t;
		t=n;
		while(i<=n) {
			r=n%10;
			s=s*10+r;
		    n=n/10;
		}
		if(t==n) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not  a palindrome number");
		}

	}

}
