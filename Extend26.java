package workbook;

// Eclipseではナビが表示されず、手動で入力をする必要があった
// ⇒importするまで、「TUESDAY」はコンパイルエラーだった
import static java.time.DayOfWeek.*;

import java.time.LocalDate;

public class Extend26 {

	public static void main(String[] args) {
		var todayDate = LocalDate.now().with(TUESDAY);
		var todayDayOfWeek = LocalDate.now().with(TUESDAY).getDayOfWeek();
		System.out.println(todayDate);
		System.out.println(todayDayOfWeek);
	}

}
