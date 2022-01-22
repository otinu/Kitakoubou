package workbook;

public class Extend64 {

	public static void main(String[] args) {
		
		// replace()メソッドはchar型かCharSequence型のどちらかで統一しなければならない
		String str = "aaaaaa";
		str = str.replace('a', 'z');
		str = str.replace("aaa", "z");
		str = str.replace("aaa, 'z');
	}

}
