package corejavaprograms;
import java.lang.*;
import java.util.*;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bcode,bname;
		int bno;
		double bprice;
		char bpcode;
		float bpdisc;
		boolean bav;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter book name");
		bname=sc.next();
		System.out.print("enter book code");
		bcode=sc.next();
		System.out.print("enter book number");
		bno=sc.nextInt();
		System.out.print("enter book price");
		bprice=sc.nextDouble();
		System.out.print("enter book price code");
		bpcode=sc.next().charAt(0);
		System.out.print("enter book avaliablity: ");
		bav=sc.nextBoolean();
		System.out.print("enter book dicount");
		bpdisc=sc.nextFloat();
		
		
		System.out.println("=========================");
		System.out.println("=======book details=======");
		System.out.println("=========================");

		System.out.println("book code: "+bcode);
		System.out.println("book number: "+bno);
		System.out.println("book name: "+bname);
		System.out.println("book price: "+bprice);
		System.out.println("book charcode: "+bpcode);
		System.out.println("book availiblity: " +bav);
		System.out.println("book price discount: "+bpdisc);
		
		System.out.println("=========================");

		
		
	}

}
