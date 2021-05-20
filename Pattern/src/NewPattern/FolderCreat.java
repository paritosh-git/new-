package NewPattern;

import java.io.File;

public class FolderCreat {

	public static void main(String[] args) {

		String s = "C:/Grid";
		File f = new File(s);

		try {
			if (f.exists() == false) {
				f.mkdirs();
				System.out.println("Directory created");
			} else {
				System.out.println("Directory already present");

				String sa = "C:/Grid/NewFolder3";

				File fa = new File(sa);
				fa.mkdir();
				System.out.println("New folder is created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
