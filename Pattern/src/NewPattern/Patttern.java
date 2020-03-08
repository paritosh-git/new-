package NewPattern;

public class Patttern {
public static void main(String[] args) {
	int n=5;
	for(int i=n;i>=1;i--) {
		for(int j=n-1;j>=i;j--) {
			System.out.println("");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		
	}
	System.out.println();
}
}
