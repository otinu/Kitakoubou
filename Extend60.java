package workbook;

public class Extend60 {
	public static void main(String[] args) {
		
		// 基本データ型の配列を引数として渡す
		// Object[]型は参照型の配列を扱うのであって、基本データ型の配列は扱えない
		// ⇒Object型の引数を受け取るtest()メソッドが実行
		new Sample().test(new int[3]);
		
		// 参照型の配列を引数として渡す
		// ⇒Object[]型の引数を受け取るtest()メソッドが優先的に実行される
		new Sample().test(new String[3]);
	}
}

class Sample {
	public void test (Object[] val) {
		System.out.println("A");
	}

	public void test (long[] val) {
		System.out.println("B");
	}

	public void test (Object val) {
		System.out.println("C");
	}
}