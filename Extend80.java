package workbook;

public class Extend80 {

	public static void main(String[] args) {
		
		// Object型の多重配列には基本データ型の配列は代入できない。
		Object[][] obj = new Object[4][];
		obj[0] = new Integer[2];
		obj[1] = new String[5];
		
		obj[2] = new int[2];
		obj[3] = new char[3];
	}

}
