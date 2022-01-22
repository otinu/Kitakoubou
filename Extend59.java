package workbook;

public class Extend59 {

	// static + final でフィールドの宣言のみはできない
	static final int num;

	private Extend59() {
		this.num = 10;
	}

	public static void main(String[] args) {
		System.out.println(new Extend59().num);
	}

}
