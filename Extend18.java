package workbook;

public class Extend18 {

	public static void main(String[] args) {
		sampleObject s1 = new sampleObject(10);
		sampleObject s2 = s1;
		
		// Object型のequalsメソッドは同一性の判定をする
		// ⇒ ==演算子と同じはたらきになる
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
