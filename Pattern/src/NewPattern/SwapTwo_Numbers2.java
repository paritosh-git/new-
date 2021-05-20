package NewPattern;

import java.util.Scanner;

/*public class SwapTwo_Numbers {

	 public static void main(String[] args) {
		
		 int x;
		 int y;
		 int temp;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Numbers");
		x = sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("before swapping"+x+ "and"+y);
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping"+x+"And"+y);
				
	}*/
	 
	
	public   class SwapTwo_Numbers2 { //without using third variable 

		
		public static void main(String[] args) {
			
			 int x;
			 int y;
			
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the Numbers");
			x = sc.nextInt();
			y=sc.nextInt();
			
			System.out.println("before swapping =" +x+  "and" +y);
			
			x=x +y;
			
			y=x-y;
			x = x-y;
			System.out.println("After Swapping =" +x+ "And" +y);
					
		}
}
