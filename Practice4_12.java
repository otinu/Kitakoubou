package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		{
			System.out.println("合計が100以上になるまで数値を入力してください。");
	        int x = 0;
	        int sum = 0;
	        
	        while (sum < 100) {
	        	BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
	        	x = Integer.parseInt(br.readLine());
	        	sum += x;
	        }
	        System.out.println("合計が100以上になりました。");
	        System.out.println("合計は" + sum + "です。");
	        
	    }
	}

}
