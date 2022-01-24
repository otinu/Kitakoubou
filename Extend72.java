package workbook;

public class Extend72 {

	public static void main(String[] args) {
		
		// valueOf()メソッドはラッパー型に変換する際に柔軟に対応してくれる
		Boolean bl = Boolean.valueOf("TRUE");
		Integer it = Integer.valueOf("2");
		String st = String.valueOf(true);
		
		System.out.println(bl);
		System.out.println(it);
		System.out.println(st);
	}

}
