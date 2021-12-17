package workbook;

class A2{ }

class B2 extends A2 {
	void hello() {
		System.out.println("hello");
	}
}

public class Extend8 {

	public static void main(String[] args) {
		
		//B型(サブクラス)のインスタンスを作成して、A型(スーパークラス)で扱うことを指定
		A2 a = new B2();
		
		//A型として扱われていたB型のインスタンスを本来のB型として扱うよう、キャスト
		B2 b = (B2) a;
		b.hello();
	}

}
