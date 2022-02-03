package workbook;

public class Practice6_5 {

	public static void main(String[] args) {
		triangle(10, '△');
	}

	static void triangle(int line, char c) {
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
