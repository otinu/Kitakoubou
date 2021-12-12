package workbook;

public class Extend1 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		// べき乗専用の算術演算子はないものの、powメソッドがJavaには用意されている
		System.out.println(Math.pow(x, y));
	}
}
