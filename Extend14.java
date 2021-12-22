package workbook;

public class Extend14 {

	public static void main(String[] args) {
		String name = "tinu";
		
		// indexOfメソッドでは、該当文字列が検索できた場合はその文字列の先頭文字の要素番号を返す
		System.out.println(name.indexOf("nu"));
		
		// 1文字での検索であれば、シングル・ダブルクォートどちらでも対応可能
		System.out.println(name.indexOf("t"));
		System.out.println(name.indexOf('t'));
		
		// 該当する文字がない場合は「-1」を返す
		System.out.println(name.indexOf('A'));
		
	}

}
