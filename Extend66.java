package workbook;

public class Extend66 {

	public static void main(String[] args) {
		
		// sqrtメソッドは平方根を求める
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sqrt(-9)); // ⇒NaN
		System.out.println(Math.sqrt(0));
		System.out.println(Math.sqrt(NaN)); // ⇒コンパイルエラー
	}

}
