package corejavaprograms;
import java.lang.*;


public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153,i=1,r,s=0;
		
		while(i<=n) {
			r=n%10;
			s=s*10+r;
			n=n/10;
			
		}
		System.out.println("reverser= "+s);

	}

}
