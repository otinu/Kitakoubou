package workbook;

public class Extend71 {

	public static void main(String[] args) {
		
		// コンパイルは通るものの、ループ内に入らない
		for(short s = 5; s < 5; s++) {
			System.out.println(s);
		}
		short s2 = 5;
		System.out.println(s2);
	}

}
