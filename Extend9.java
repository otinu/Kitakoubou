package workbook;

class A3 {
	void hello() {
		System.out.println("A");
	}
}

class B3 extends A3 {
	void hello() {
		System.out.println("B");
	}
}

public class Extend9 {

	public static void main(String[] args) {
		
		// Extend8と要比較
		
		// A型のインスタンスをA型として扱うようにインスタンスを作成
		A3 a = new A3();
		
		// 本来A型のインスタンスをB型のインスタンスにキャスト
		// ⇒スーパークラスからサブクラスへのキャストは不可のため、例外発生
		B3 b = (B3) a;
	}

}
