package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int num = Integer.parseInt(br.readLine());
        if(num % 2 == 0) {
        	System.out.println("入力値は偶数です。");
        } else {
        	System.out.println("入力値は奇数です。");
        }
	}

}
