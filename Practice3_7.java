package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );

		int num = Integer.parseInt(br.readLine());
		
		if(num >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		if(num >= 80) {
			System.out.println("たいへんよくできました。");
		} else if(num >= 60 && num < 80) {
			System.out.println("よくできました。");
		} else {
			System.out.println("ざんねんでした。");
		}
		
		if(num >= 80) {
			System.out.println("優");
		} else if(num >= 70 && num < 80) {
			System.out.println("良");
		} else if(num >= 60 && num < 70) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
	}

}
