package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );

		int midTermScore = Integer.parseInt(br.readLine());
		int finalScore = Integer.parseInt(br.readLine());
		
		if(midTermScore >= 60 && finalScore >= 60) {
			System.out.println("合格");
		} else if(midTermScore + finalScore >= 130) {
			System.out.println("合格");
		} else if(midTermScore + finalScore >= 100 && midTermScore >= 90 || finalScore >= 90) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}

}
