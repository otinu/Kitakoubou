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
		
		//=======================
		
		// char型変数に数値リテラルを代入する場合もキャストが必要
		char t = 97;
		int i2 = 97;
		char j = i2;
		char j2 = (char) i2;
	}

}
