package corejavaprograms;
import java.lang.*;
public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int n=153,i=1,c=0;
		while(i<=n) {
			n=n/10;
			c=c+1;
		}
		System.out.println("count(c): "+c);
	}

}
