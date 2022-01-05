package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_19 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		{
			System.out.println("平均を求めるために数値を入力してください。");
			System.out.println("入力がよろしければ、0を入力してください。");
			int num = 0;
			int count = 0;
			while (true) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader( System.in ) );
				int x = Integer.parseInt(br.readLine());
				if(x == 0 && count == 0) {
					System.out.println("平均値を求めることができませんでした。");
				}
				num += x;
				if (x == 0) {
					break;
				}
				count++;
			}
			System.out.println("平均値は" + num / count + "です。");
		}
	}

}
