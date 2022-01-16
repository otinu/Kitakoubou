package workbook;

public class Extend50 {

	public static void main(String[] args) {
		// NaNとは「Not a Number(数値ではない)」という意味。
		// 浮動小数点で無限大など表現しきれない値を使うときに利用する
		
		// roundメソッドで変換すると0が返る
		System.out.println(Double.NaN);
		System.out.println(Math.round(Double.NaN));
	}

}
