package NewPattern;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int n,fact =1;
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value");
		n=sc.nextInt();
		
	for(int i=1;i<=n;i++){
		
		fact =fact*i;
	}
		System.out.println("fact value of"+n+ "is"+fact);
	
	}
}
