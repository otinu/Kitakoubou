package workbook;

public class Practice6_6 {

	public static void main(String[] args) {
		calc(9);
	}

	static void calc(int line) {
		for(int i = 1; i <= 9; i++) {
			System.out.print(i * line + ", ");
		}
	}

}
