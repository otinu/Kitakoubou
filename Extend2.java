package workbook;

public final class Extend2 {

	public static void main(String[] args) {
		String str = "hoge, world.";
		hello(str);
		System.out.println("メインメソッド内での実行");
		System.out.println(str + "\n");
	}
	private static void hello(String msg) {
		
		// replaceAllではオブジェクトに破壊的な変更をかけるのではなく、新しいオブジェクトを生成してそこを参照させる。
		// ⇒下記の出力の際には、msgオブジェクトを参照しているのではなく、msg.replaceAllオブジェクトを参照している
		System.out.println("msg.replaceAllメソッドを実行");
		System.out.println(msg.replaceAll("hoge", "hello") + "\n");
		
		
		System.out.println("replaceAll後にmsgのみを表示");
		System.out.println(msg + "\n");
	}

}
