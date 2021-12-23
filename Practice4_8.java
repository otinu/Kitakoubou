package workbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Practice4_8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int randomValue = random.nextInt(101);
			list.add(randomValue);
			System.out.print(randomValue + ", ");
			if(i == 9) {
				System.out.print("\n");
			}
		}
		System.out.println("配列の最大値: " + Collections.max(list));
	}

}
