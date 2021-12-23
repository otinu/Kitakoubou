package workbook;

import java.util.Random;

public class Practice4_7 {
public static void main(String[] args) {
		
		int kyojinn = 0;
		int hannsinn = 0;
		for (int i = 1; i < 10; i++) {
			Random random = new Random();
			int randomValue = random.nextInt(7);
			
			if(i % 2 == 0) {
				kyojinn += randomValue;
			} else {
				hannsinn += randomValue;
			}
		}
		System.out.println("巨人: " + kyojinn + "点, 阪神: " + hannsinn + "点");
		if(kyojinn > hannsinn) {
			System.out.println("巨人の勝ち" );
		} else {
			System.out.println("阪神の勝ち");
		}
	}
}
