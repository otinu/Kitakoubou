package workbook;
	class A {
		String val = "A";
		void print() {
			System.out.println(val);
		}
	}
	
	class B extends A {
		String val = "B";
		void print() {
			System.out.println(val);
		}
	}
	
	public class Extend6 {
	public static void main(String[] args) {
		
		
		A a = new A();
		A b = new B();
		
		//フィールド参照の場合、変数の型で宣言された側を使用
		System.out.println(a.val);
		System.out.println(b.val);
		
		//メソッド呼び出しの場合、メソッド内の指示に従う
		a.print();
		b.print(); //オーバーライドされるため、Bクラスのprintメソッドを優先実行
	}

}
