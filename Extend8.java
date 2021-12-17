package workbook;

class A2{ }

class B2 extends A2 {
	void hello() {
		System.out.println("hello");
	}
}

public class Extend8 {

	public static void main(String[] args) {
		A2 a = new B2();
		B2 b = (B2) a;
		b.hello();
	}

}
