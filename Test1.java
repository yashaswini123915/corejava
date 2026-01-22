package conditionstatements;
import java.lang.*;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i=2;
		boolean flag = false;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number");
		num=sc.nextInt();
		while(i<=num/2) {
			//condition for non prime number
			if((num%i)== 0) {
				flag=true;
				break;
			}
			++i;
			if(!flag) 
				System.out.println(num+" is a primenumber.");
			else 
				System.out.println(num+" is not a primenumber.");
		}

	}

}
