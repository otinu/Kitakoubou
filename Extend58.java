package workbook;

public class Extend58 {
	
	// staticなブロック(static{}のとこ)は、staticなフィールドを初期化するために1度だけ実行される。
	// 一方、修飾なしのブロック({}だけのとこ)はコンストラクタが起動したときに実行される。
	static int num;
	{
		num = 10;
		System.out.println("hello");
	}
	static {
		num = 20;
	}
	public static void main(String[] args) {
		System.out.println(Extend58.num);
		System.out.println(new Extend58().num);
	}

}
