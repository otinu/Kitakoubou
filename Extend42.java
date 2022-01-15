package workbook;

public class Extend42 {

	public static void main(String[] args) {
		
		// ※floorメソッドでは正の値は、小数点以下切り捨ての「〇.0」
		//負の値は「-〇.0」で表示される
		System.out.println(Math.floor(-0));
		
		System.out.println(Math.floor(-1));
		System.out.println(Math.floor(1));
		System.out.println(Math.floor(-1.11));
		System.out.println(Math.floor(1.11));
		
		System.out.println(Math.floor(11.102));
		System.out.println(Math.floor(11.5));
		System.out.println(Math.floor(-11.001));
		System.out.println(Math.floor(-11.5));
	}

}
