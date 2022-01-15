package workbook;

public class Extend40 implements sampleInterface {
	
	
	// インターフェースのメソッドは「public abstract」で自動的に修飾される
	// ⇒そのため、具体化する際にメソッドをprotected以下で修飾するとコンパイルエラーとなる
	@Override
	public void echo() {
		System.out.println("echoでのNUMの呼び出し: " + NUM);
	}

	// インターフェースの変数は「public staatic final」で自動的に修飾される
	public static void main(String[] args) {
		System.out.println("static利用でのNUMの呼び出し: " + sampleInterface.NUM);
		new Extend40().echo();
		// NUM = 20;
	}

}
