package workbook;

public class Extend76 {

	public static void main(String[] args) {
		
		// 同値性の確認にはhashCodeも利用する
		String str = new String("Hello World");
		String str2 = new String("Hello World");
		
		System.out.println(str == str2);
		System.out.println(str.hashCode() == str2.hashCode());
		
		
		int[] array = { 1, 2, 3 };
		int[] array2 = { 2, 1, 3 };
		
		System.out.println(array == array2);
		System.out.println(array.hashCode() == str2.hashCode());
	}

}
