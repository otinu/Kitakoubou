package workbook;

import java.util.Arrays;
import java.util.List;

public class Extend10 {

	public static void main(String[] args) {
		
		// compareToは、昇順で配列を並び替える
		List<Integer> pluslist = Arrays.asList(new Integer[] {1, 2, 3});
		pluslist.sort((a, b) -> a.compareTo(b));
		for (Integer num : pluslist) {
			System.out.println(num);
		}
		System.out.println("---");
		
		// オブジェクトのマイナスにすると、降順での並び替えとなる
		List<Integer> minuslist = Arrays.asList(new Integer[] {1, 2, 3});
		minuslist.sort((a, b) -> -a.compareTo(b));
		for (Integer num : minuslist) {
			System.out.println(num);
		}
	}

}
