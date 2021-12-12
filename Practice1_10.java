package workbook;

public class Practice1_10 {

	public static void main(String[] args) {
		int inputNum = 2;
		int baseNum = 2;
		int x = inputNum;
		for(int i = 1; i < 4; i++) {
			for(int j = i; j > 0; j--) {
				x *= baseNum;
			}
			System.out.println(x);
			x = inputNum;
		}
	}

}
