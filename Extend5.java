package workbook;

public class Extend5 {

	public static void main(String[] args) {
		Extend5 m = new Extend5();
		
		// calcに引数として、int型の2と3を渡している
		System.out.println(m.calc(2, 3));

	}
	
	// calcが一つだけの場合、JVMは第一引数をintからdoubleだと推測して実行してくれる
	private double calc(double a, int b) {
		return (a + b) / 2;
	}
	
	// しかし、下記のように引数の型が逆になったもう一つのcalcを定義すると、JVMはどちらのcalcを実行すべきか判断できない
	// ⇒「あいまいなメソッド呼び出し」とエラーが発生する
	
	/*
	private double calc(int a, double b) {
		return (a + b) / 2 + 5;
	}
	*/

}
