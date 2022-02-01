package workbook;

public class Practice6_4 {

	public static void main(String[] args) {
		int line = 4;
		pyramid(line);
	}
	
	static void pyramid(int size) {
	    for(int i = 0 ; i < size ; i++) {
	        for(int j = 0 ; j <= i ; j++) {
	        	System.out.print("$");
	        }
	        System.out.println();
	    }
	}

}
