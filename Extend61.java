package workbook;

public class Extend61 {

	public static void main(String[] args) {
		int[][] array = new int[2][4];
		
		// 2次元目の配列の要素数を個別に変更することができる
		array[0] = new int[2];
		array[0] = new int[] { 1, 2 };
		
		// 既に各要素には空の要素で初期化されている
		// 初期化子を使う場合、newと併用で使う必要がある
		array[1] = { 1, 2 ,3 };
	}

}
