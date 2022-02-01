package workbook;

public class Practice6_3 {

	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		int z = 1;
		
		int xy = maxSupplier(x, y);
		if(xy > z) {
			System.out.println(xy);
		} else {
			System.out.println(z);
		}
	}
	
	static int maxSupplier(int i, int j) {
		return Math.max(i, j);
	}

}
