package workbook;

public class Extend70 {

public static void main(String[] args) {
		
		int i = 0;
		try {
			Object obj = null;
			// throw new NullPointerException // 到達不能
			System.out.println(obj.toString()); // コンパイル成功
			i++;	
		} catch (NullPointerException e) {
			System.out.println("例外が発生しました。");
		}
		System.out.println(i);
	}

}
