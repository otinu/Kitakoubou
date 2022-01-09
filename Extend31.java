package workbook;

public class Extend31 {
	
	// いずれの形でも、if-else文内では初期化できているものの、ブロック外では初期化はできてない
	// ⇒最終行でコンパイルエラーが発生する。
	
	/*
	public static void main(String[] args) {
		int x;
		int y = 3;
		if (y > 2) {
			x = ++y;
			y = x + 5;
		} else {
			y++;
		}
		System.out.println(x + ", " + y);
	}
	*/

	/*
	public static void main(String[] args) {
		        int i1 = Integer.parseInt(args[0]);
		        int i2;
		        if(i1 > 0) {
		            i2 = 10;
		            int i3 = 20;
		        } else {
		            i2 = 0;
		            int i3 = 0;
		        }
		        System.out.println(i2 + i3);
	}
	*/

}
