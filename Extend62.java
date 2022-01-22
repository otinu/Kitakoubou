package workbook;

public class Extend62 {

	public static void main(String[] args) {
		
		// ラッパー型は状況に応じて、参照型かた基本データ型へボクシングされる
		int num = 10;
		Integer val = Integer.valueOf(10);
		System.out.println(num == val);
		System.out.println(val == num);
	}

}
