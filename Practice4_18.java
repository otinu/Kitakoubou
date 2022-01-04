package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_18 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		{
			System.out.println("数値を入力してください。");
			int num = 0;
			while (true) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader( System.in ) );
				int x = Integer.parseInt(br.readLine());
				num += x;
				if (x == 0) {
					break;
				}
			}
			System.out.println("合計は" + num + "です。");
		}
	}
}
