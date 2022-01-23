package workbook;

public class Extend69 {

	public static void main(String[] args) {
		
		int i = 0;
		try {
			Object obj = null;
			System.out.println(obj.toString());
			i++;	// 文法上は到達不能でも、到達不能やデッドコードにはならない
		} catch (NullPointerException e) {
			System.out.println("例外が発生しました。");
		}
		System.out.println(i);
	}

}
