package corejavaprograms;

import java.lang.*;
import java.io.*;


public class Test09 {

	public static void main(String[] args)throws IOException {
		
		String ecode;
		int eno;
		String ename;
		double esal;
		float epf;
		char egrade;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter ecode ");
		ecode = br.readLine();
		
		System.out.print("Enter eno ");
		eno = Integer.parseInt(br.readLine());
		
		System.out.print("Enter ename ");
		ename = br.readLine();
		
		System.out.print("Enter esal: ");
		esal = Double.parseDouble(br.readLine());
		
		System.out.print("Enter epf ");
		epf = Float.parseFloat(br.readLine());
		
		System.out.print("Enter egrade: ");
		egrade = (char)(br.read());
		
		System.out.println("-----------------------");
		System.out.println("\tEMPLOYEE DETAILS");
		System.out.println("------------------------");
		System.out.println("code= "+ecode);
		System.out.println("Number= "+eno);
		System.out.println("Name= "+ename);
		System.out.println("Salary= "+esal);
		System.out.println("Pf= "+epf);
		System.out.println("grade= "+egrade);
		
		
		

	}

}
