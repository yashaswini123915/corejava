package corejavaprograms;

import java.lang.*;
import java.io.*;


public class Test07 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		String name;
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(I);
		System.out.println("enter your name");
		name=br.readLine();
		System.out.print("name= "+name);
		
		
	}

}
