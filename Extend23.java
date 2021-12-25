package workbook;

public class Extend23 {
	
	// ラベルによって、処理の順序をカスタムできる
	// ただし、読みにくいコードになる危険がある

	public static void main(String[] args) {
		int total = 0;
		a: for (int i = 0; i < 5; i++) {
			b: for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) continue a;
				if (3 < j) break b;
				total += j;
			}
		}
		System.out.println(total);
	}

}
