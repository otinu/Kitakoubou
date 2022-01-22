package workbook;

public class Extend63 {

	public static void main(String[] args) {
		int[][] array1 = { { 1 }, { 2 }, { 3 } };
		int[][] array2 = array1.clone();
		
		System.out.println(array1 == array2);
		System.out.println(array1[0] == array2[0]);
	}

}
