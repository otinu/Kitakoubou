package workbook;

import java.util.Random;

public class Practice4_6 {

	public static void main(String[] args) {
		
		int win = 0;
		int lose = 0;
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int randomValue = random.nextInt(2);
			
			if(randomValue == 1) {
				win++;
			} else {
				lose++;
			}
		}
		System.out.println(win + "勝" + lose + "敗でした");
	}

}
