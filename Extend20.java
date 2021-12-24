package workbook;

import java.util.ArrayList;

public class Extend20 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		// list.add("d");
		for (String str : list) {
			if ("b".equals(str)) {
				// removeメソッド実行後に次の読み込みが行われると、例外発生
				// もし、removeメソッド実行がn-1番目だった場合はそこで処理が終了する
				
				list.remove(str);
			}
		}
		for (String str : list) {
			System.out.println(str);
		}
	}

}
