package workbook;

public class Extend25 {

	public static void main(String[] args) {
		
		// サブクラス ⇒ スーパークラス　へのインスタンスの格納やメソッドの実行は可能
		sampleSub x = new sampleSub();
		sampleSuper y = x;
		y.hello();
		
		// スーパークラス ⇒ サブクラス　へのキャストは可能(コンパイルエラーは発生しない)
		// しかし、実行後に例外(ClassCastException)が発生
		sampleSuper a = new sampleSuper();
		sampleSub b = (sampleSub) a;
		b.hello();
	}

}
