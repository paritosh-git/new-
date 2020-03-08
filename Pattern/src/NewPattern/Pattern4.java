package NewPattern;

public class Pattern4 {
public static void main(String[] args) {
	
	
	char i;
	char j;
		for ( i = 'A'; i <= 'E'; i++) {
			for ( j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}


}
//A
//AB
//ABC
//ABCD
//ABCDE

