package workbook;

public class Extend67 {

	public static void main(String[] args) {
		
		// char型どうしの+演算は該当の文字コードどうしの演算になる
		// ⇒出力結果はint型
		char c1 = 'a';
		char c2 = 'z';
		System.out.println(c1 + c2);
		
		/* この2行はどちらもコンパイルエラー
		char c3 = c1 + c2;
		String s = c1 + c2;
		*/
		
		// コンパイル成功
		int i = c1 + c2;
	}

}
