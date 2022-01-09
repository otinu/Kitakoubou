package workbook;

public class Extend32 {

	public static void main(String[] args) {
		
		// 数値リテラルに記述した「_」や「f」といった記号は出力する際に省略される
		int x = 5_23;
		float y = 3.14_15f;
		System.out.println(x);
		System.out.println(y);
	}

}
