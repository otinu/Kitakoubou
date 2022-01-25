package workbook;

public class Extend77 {

	public static void main(String[] args) {
		
		// -128～127まではコンスタントプールが働く
		Integer i = Integer.valueOf(127);
		Integer i2 = Integer.valueOf(127);
		
		System.out.println(i == i2);
		
		i = Integer.valueOf(-128);
		i2 = Integer.valueOf(-128);
		
		System.out.println(i == i2);
		
		i = Integer.valueOf(128);
		i2 = Integer.valueOf(128);
		
		System.out.println(i == i2);
	}

}
