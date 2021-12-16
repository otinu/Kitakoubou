package workbook;

public class Extend4 {

	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3, 4 };
		int[] arrayB = arrayA.clone();
		
		// cloneメソッドによって、配列をコピーしたものの、同じオブジェクトではない
		System.out.println(arrayA == arrayB);
		
		// 中身は同じ
		for(int i : arrayB) {
			System.out.println(i);
		}
	}

}
