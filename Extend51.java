package workbook;

public class Extend51 {

	public static void main(String[] args) {
		
		// false
		System.out.println(new Boolean(null));
		
		// NumberFormatException 発生
		System.out.println(new Integer(null));
		
		//　コンパイルエラー 発生
		System.out.println(new String(null));
		System.out.println(new Character(null));
	}

}
