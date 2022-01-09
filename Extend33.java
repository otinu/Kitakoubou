package workbook;

public class Extend33 {
	    public static void main(String[] args) {
	        int[] array = new int[] {10,20,30};
	        
	        // 拡張forにて、final修飾しているvar型の変数でループをすることは文法上可能
	        for(final var val : array) {
	            System.out.print(val + " ");
	        }
	    }
}
