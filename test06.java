package corejavaprograms;

import java.lang.*;
import java.io.*;


public class test06 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		String name;
		DataInputStream D = new DataInputStream(System.in);
		System.out.print("Enter your name");
		name = D.readLine();
		System.out.println("name: "+name);
		
	}

}
