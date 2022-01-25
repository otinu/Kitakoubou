package workbook;

public class Extend75 {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str instanceof String);
		
		// 継承関係が明らかに異なるなら、コンパイルエラー
		// System.out.println(str instanceof Character); 
		
		// instanceofを否定形にしたい場合
		System.out.println(!(str instanceof String));
		
		// instanceofを使うことで、スーパークラスとして扱っていたオブジェクトの実態を知ることができる
		Number n1 = Integer.valueOf(1);
		Number n2 = Long.valueOf(1);
		Number n3 = Double.valueOf(1);

		System.out.println(n1 instanceof Integer); // → true、Numberの実体はInteger!!
		System.out.println(n2 instanceof Integer); // → false、Numberの実体はIntegeではない(Long)
		System.out.println(n3 instanceof Integer);
	}

}
