package workbook;

public class Extend29 {
	
	// mainメソッドの引数は配列型Stringか可変長型Stringのいずれかで定義
	
	public static void main(String... args) {
		System.out.println(args[0] + args[1]);
	}
	
	/* 通常のString型ではコンパイルエラー
	public static void main(String otherArgs) {
		System.out.println(otherArgs);
	}
	*/

}
