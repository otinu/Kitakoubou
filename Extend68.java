package workbook;

public class Extend68 {
	
	public static void main(String[] args) {
		
		// if文のみデッドコード
		if(false) {
            System.out.println("こんにちは");
        }
		
		// for・while ともに到達不能でコンパイルエラー
		for(int i = 0; false; i++) {
            System.out.println("こんにちは");
        }
		
		while(false) {
            System.out.println("こんにちは");
        }
	}

}