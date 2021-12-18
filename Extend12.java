package workbook;

import java.util.Arrays;

public class Extend12 {

	public static void main(String[] args) {
		
		// aとbを比較して、辞書順ではaが先になる
		// 第一引数が辞書順で先の場合、出力は負の値になる
		String[] a = { "apple" };
		String[] b = { "orange" };
		System.out.println(Arrays.compare(a,  b));
	}

}
