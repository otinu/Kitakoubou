package workbook;

import java.time.LocalDate;

public class Extend19 {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2022, 1, 1);
		LocalDate b = LocalDate.parse("2022-12-31");
		LocalDate c = LocalDate.now();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
