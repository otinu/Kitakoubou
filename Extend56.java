package workbook;

public class Extend56 {

	public static void main(String[] args) {
		int i = 1;
		double d = 2.0;
		float f = 3.0f;
		
		i = d;
		i = f;
		
		d = i;
		d = f;
		
		// キャストが必要
		f = i;
		f = d;
	}

}
