package workbook;

import java.util.ArrayList;

public class Extend78 {
	public static void main(String[] args) {
		
		// 明らかに不正な引数が渡されている場合はコンパイルエラー
		test(20);
		
		// コード上は渡すことは可能でも、内部的に不正な値を引数として渡す
		// ⇒IllegalArgumentException
        ArrayList array = new ArrayList( -20 );
    }

	public static void test(String s) {
	}

}


