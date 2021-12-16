package workbook;

public class Extend3 {

	public static void main(String[] args) {
		
		// String型はnullを代入することができ、print・printlnメソッドはnullを「null」と表示する(「NULL」や非表示ではない)
		
		String msg = null;
		System.out.println(msg);
		System.out.print(msg);
		
		// int型にnullを代入することはできない
		
		/*
		int num = null;
		System.out.println(msg);
		System.out.print(msg);
		*/
		
		// nullを扱えないint型の配列の場合、初期値には0が格納される
		int[] nums = new int[3];
		System.out.println(nums[1]); // ⇒ 0
	}

}
