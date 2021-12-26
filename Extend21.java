package workbook;

public class Extend21 {

	public static void main(String[] args) {
		
		// 浮動小数点のデフォルトはdoubleとして扱われる
		// float型の変数を初期化する場合はリテラルをfloat型にキャストして代入する
		
		double a = 10.0;
		// float b = 10.0;
		float b = (float) 10.0;
		
		// あるいは、数字リテラルに接尾辞「f」を付け加える
		float c = 11.1f;
	}

}
