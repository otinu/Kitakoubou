package workbook;

public class Extend27 {

	public static void main(String[] args) {
		
		// roundメソッドは四捨五入をするメソッド
		double x = Math.round(2.4);
		float y = Math.round(2.5);
		System.out.println(x);
		System.out.println(y);
		
		// longで受け取ることはできるものの、intでは受け取ることができない
		long a = Math.round(2.5);
		// long b = Math.round(2.5);	//コンパイルエラー
		System.out.println(a);
	}

}
