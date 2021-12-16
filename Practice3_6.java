package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );

		int num = Integer.parseInt(br.readLine());
		
		if(num % 2 == 0 && num > 0 || num == 0) {
			System.out.println("入力値は正の偶数です。");
		} else if(num % 2 == 0 && num < 0) {
			System.out.println("入力値は負の偶数です。");
		} else if(num % 2 == 1) {
			System.out.println("入力値は正の奇数です。");
		} else if(num % 2 == -1) {
			System.out.println("入力値は負の奇数です。");
		} else {
			
		}
	}

}
 