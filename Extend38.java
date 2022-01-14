package workbook;

public class Extend38 {

	// java Extend38.java 1 2  を実行すると「12」と表示される
	// ⇒起動パラメータに数値リテラルを渡しても、文字列型に変換される
	//	⇒mainメソッドの引数がString[] のため
	public static void main(String[] args) {
		System.out.println(args[0] + args[1]);
	}

}
