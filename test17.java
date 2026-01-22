package corejavaprograms;

public class test17 {

	public static void main(String[] args) {
		// factorial upto n numbers
		
		int n=5,i=1,f=1;
		System.out.println("number\t factorial");
		System.out.println("======================");
		while(i<=n) {
			f=f*i;
			System.out.println(i+"\t"+f);
			i++;
		}
		System.out.println("=====================");

	}

}
