package workbook;

public class Extend17 {

	public static void main(String[] args) {
		int num = 11;
		
		// ブレークスルーは、該当するcase文～breakに到達するまで、全処理を実行する
		switch (num) {
			case 10: System.out.println("A");
			case 11: System.out.println("B");
			case 12: System.out.println("C");
			case 13: System.out.println("D");
					 break;
			case 14: System.out.println("E");
			default: System.out.println("F");
		}
		
	}

}
