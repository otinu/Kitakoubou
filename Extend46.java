package workbook;

public class Extend46 {

	public static void main(String[] args) {
		
		// 初期化子を使ってvar型の変数に入れる場合、newを使わないと初期化できない
		// ⇒右辺で何の配列型であるか明示しないと、varが型推論できない
		int[] array = { 1, 2, 3 };
		int[] list0 = new int[] { 1, 2, 3 };
		var list = { 1, 2, 3 };
		var list2 = new int[] { 1, 2, 3 };
	}

}
