package workbook;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Extend74 {

	public static void main(String[] args) {
		
		// LocalDateとLocalDateTime の2種類が存在
		LocalDate ld1 = LocalDate.of(2022, 1, 1);
		LocalDate ld2 = LocalDate.of(2022, 01, 01);
		
		System.out.println(ld1);
		System.out.println(ld2);
		
		LocalDateTime ldt1 = LocalDateTime.of(2022, 1, 1, 1, 1);
		LocalDateTime ldt2 = LocalDateTime.of(2022, 01, 01, 1, 1);
		LocalDateTime ldt3 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		
		System.out.println(ldt1);
		System.out.println(ldt2);
		System.out.println(ldt3.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(ldt3.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(ldt3.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(ldt3.format(DateTimeFormatter.BASIC_ISO_DATE));
	}

}
