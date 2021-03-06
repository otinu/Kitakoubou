package workbook;

public class Extend16 {

	public static void main(String[] args) {
		
		// String型は+演算子を使う他に、concatメソッドでも文字列連結ができる
		String greet = "Hello ".concat("World");
		
		// StringBuilder型はappendメソッドを使って文字列連結を行う
		StringBuilder fishing = new StringBuilder("Get ");
		fishing.append("gure");
		
		System.out.println(greet);
		System.out.println(fishing);
		
		// StringBuilderは「文字列 + 16文字」分のバッファをもつ
		System.out.println(fishing.capacity());
		
		// StringBuilderでは+=演算子を扱えない
		greet += "!";
	 // fishing += "!";
	}

}
