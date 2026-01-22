package corejavaprograms;
import java.lang.*;


public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,r=0,s=0,i=1;
		while(i<=n) {
			r=n%10;
			s=s+r;
			n=n/10;
		}
		System.out.println("sum(s): "+s);

	}

}
