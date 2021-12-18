package workbook;

import java.util.ArrayList;

public class Extend11 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		// 要素番号2番の要素が「X」で上書きされるのではなく、
		// 要素番号2番に「X」が入り、要素番号3番に「C」が移動する
		list.add(2, "X");
		for(String str : list) {
			System.out.println(str);
		}
		
		// 要素の上書きをしたい場合はsetメソッドを使う
		list.set(2, "Y");
		System.out.println(list.get(2));
		
		// 要素の削除にはremoveメソッドを使う
		// オブジェクトを引数として渡した場合、最初に該当した要素を削除する
		list.add("A");
		list.remove("A");
		System.out.println("---");
		for(String str : list) {
			System.out.println(str);
		}
	}

}
