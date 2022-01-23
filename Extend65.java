package workbook;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Extend65 {

	public static void main(String[] args) {
		
		// LocalDateはimmutableなオブジェクトのため、オブジェクトが変更されない
		LocalDate day = LocalDate.of(2022, 1, 1);
		day.with(DayOfWeek.MONDAY);
		System.out.println(day);
		
		LocalDate day2 = day.with(DayOfWeek.MONDAY);
		System.out.println(day2);
	}

}
