package workbook;

public class Extend24 {

	// インタフェースのデフォルトメソッドでのオーバーライドではないため、コンパイルエラーは発生しない
	
	@Override
	public String toString() {
		return "test";
	}
	
	public static void main(String[] args) {
		
		String message = new String();
		System.out.println(message.toString());
	}

}
