package workbook;

final class dummy {
	
}

// mainメソッドの前に別のクラスを定義してしまうと、javaコマンドでファイルを実行することができない

public class Extend30 {
	
	// 一方、mainメソッドをもつクラスを先頭に置けば、クラス内部でmainメソッドはどこに置いてもよい
	// 最後でも真ん中でも、コンパイルエラーは発生しない
	
	private static void set() {
		System.out.println("Setting");
	}
	
	private static void greet() {
		System.out.println("Hay");
	}

	public static void main(String[] args) {
		set();
		greet();
		System.out.println("Hello World");
	}

}
