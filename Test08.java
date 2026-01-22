package corejavaprograms;

import java.lang.*;
import java.io.*;



public class Test08 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int age;
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(I);
		System.out.println("enter your age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Name= "+age);

	}

}
