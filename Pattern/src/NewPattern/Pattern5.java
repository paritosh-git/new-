package NewPattern;

public class Pattern5 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print((char)(i+65));
			}
			System.out.println();
		}
	}
}
//AAAAA
//BBBB
//CCC
//DD
//E
