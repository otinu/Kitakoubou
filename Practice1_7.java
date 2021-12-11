package workbook;

public class Practice1_7 {
	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		int tmp = 0;
		
		
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println( "x=" + x + ",y=" + y );
	}
}
