package workbook;

public class Extend22 {

	public static void main(String[] args) {
		
		// コンスタントプールは文字・数字リテラルどちらでも機能する
		
		String a = "tinu";
		String b = "tinu";
		System.out.println(a == b);
		
		int x = 100;
		int y = 100;
		System.out.println(x == y);
	}

}
