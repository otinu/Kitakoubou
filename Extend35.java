package workbook;

public class Extend35 {
	public static void main(String args[]) {
		Pug pug = new Pug();
		Toy toy = new Toy();
		
		// 文字リテラルを引数にint型引数を受け取るメソッドを呼び出せる
		// ⇒反対に、数値を引数にchar型引数を受け取るメソッドを呼び出すことはできない
		pug.walk('a');
		pug.walk(10);
		
		toy.bark('b');
		toy.bark(0);
		
		// ただ、char型の変数は数値リテラルを受け取ることはできるため、混乱しないように注意
		char test = 32;
	}
}

class Pug {
	void walk(int d) {
		System.out.println("int型の引数で受け取った値は" + d + "です。");
	}
}

class Toy {
	void bark(char c) {
		System.out.println("char型の引数で受け取った値は" + c + "です。");
	}
}
