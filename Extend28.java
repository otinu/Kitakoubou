package workbook;

public class Extend28 {

	public static void main(String[] args) {
		String[] str = new String[2];
		
		// String型で要素がnullになっている状態で+演算子を使用すると、「null●●」と出力成功
		System.out.println(str[0] + "Hello");
		
		// 要素がnullになっている状態でconcatメソッドを呼び出すとコンパイルエラー
		str[0].concat("Hello");
		System.out.println(str[0]);
	}

}
