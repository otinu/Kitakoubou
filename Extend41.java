package workbook;

import java.util.function.Predicate;

public class Extend41 {

	public static void main(String[] args) {
		
		// Predicate<Integer> p = t -> { return t < 100; };
		Predicate<Integer> p = t -> t < 100;
		
		System.out.println(p.test(50)); // testメソッドはPredicate型で定義されている
	}

}
