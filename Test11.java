package corejavaprograms;
import java.lang.*;
import java.util.*;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int x;
		System.out.println("Enter a number: ");
		x=sc.nextInt();
		if(x>=0) {
			if(x==0) {
				System.out.println("zero");
			}
			else {
				System.out.println("+ve");
			}
		}
		else {
			System.out.println("-ve");
		}
		
		
		//for conditional operators
		
		System.out.println("enter a, b values ");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int t=(a>b)?a:b;
		System.out.println(t+" is big.");
		
		
		// for swtich case 
		
		switch(a) {
		case 1:
			System.out.print("apple");
		case 2:
			System.out.print("apple1");
		case 3:
			System.out.print("apple3");
		case 4:
 
			System.out.print("invalid data");

		}

		// while loop
		
		int i=1,c=0,s=0;
		while(i<=5) {
			System.out.print(i);
			c=c+1;
			s=s+i;
			i=i+1;
		}
		
		System.out.println("sum= "+s);
		System.out.println("count= "+c);
		System.out.println("average= "+(double)(s/c));




	}

}
